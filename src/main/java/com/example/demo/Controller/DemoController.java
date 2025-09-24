//demo 패키지 폴더 안에 컨트롤러 파일을 만들어야 함. (패키지 : 프로젝트 폴더 구조 구분)
//대 소문자 및 이름이 일치해야 한다.  
//컨트롤러를 통해 페이지에 접근 == 페이지를 만들때마다 컨트롤러 등록 필요
//페이지 이름(주소)로 접근 가능하면 보안이 취약함. URI 컨트롤러 사용해 접근하면 서버 보안 강화

//위에 내가 컨트롤러라고 써놨기 때문에 컨트롤러가 되는것? 3주차, 나중 추가 설명

package com.example.demo.Controller;

import com.example.demo.model.domain.TestDB;
import com.example.demo.model.service.TestService; // 최상단 서비스 클래스 연동 추가

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 컨트롤러 어노테이션 명시
public class DemoController
{
    // 클래스 하단 작성
    @Autowired
    TestService testService; // DemoController 클래스 아래 객체 생성

    @GetMapping("/index") 
    public String index() {
        return "index";
    }
    //다른 페이지에서 메인 페이지로 돌아갈 경우 href에 링크 주소를 넣어 경로를 설정해도 됨.
    //보통은 그냥 매핑 최상단에 index를 등록해서 사용함


    @GetMapping("/hello") // 전송 방식 GET
    public String hello(Model model) {
        model.addAttribute("data", " 방갑습니다."); // model 설정
        return "hello"; // hello.html 연결
    }

    @GetMapping("/hello2") // 전송 방식 GET
    public String hello2(Model model) {
        model.addAttribute("data1", " 홍길동님."); // model 설정
        model.addAttribute("data2", " 반갑습니다."); // model 설정
        model.addAttribute("data3", " 오늘."); // model 설정
        model.addAttribute("data4", " 날씨는."); // model 설정
        model.addAttribute("data5", " 매우 좋습니다."); // model 설정
        return "hello2"; // 경로 요청이 오면, html 연결
    }

    @GetMapping("/about_detailed") 
    public String about() {
        return "about_detailed";
    }

    @GetMapping("/test1")
    public String thymeleaf_test1(Model model) {
        model.addAttribute("data1", "<h2> 방갑습니다 </h2>");
        model.addAttribute("data2", "태그의 속성 값");
        model.addAttribute("link", 01);
        model.addAttribute("name", "홍길동");
        model.addAttribute("para1", "001");
        model.addAttribute("para2", 002);
        return "thymeleaf_test1";
        // 모델 객체를 만들어 6개의 ㅇㅇ을 페이지에 전달(데이터 전달)
        //파라미터들이? 내부적으로 전달
        //달러와 괄호로 
    }

    // 하단에 맵핑 이어서 추가
    @GetMapping("/testdb")
    public String getAllTestDBs(Model model) {
        TestDB test = testService.findByName("홍길동");
        model.addAttribute("data4", test);
        System.out.println("데이터 출력 디버그 : " + test);
        return "testdb";
    }

//페이지 만들때마다 필수 등록
} 

//컨트롤러에서 사용자에게 응답할 View를 생성할 때 Model을 이용하여 View에 데이터를 전달
//model.addAttribute(String name/key, Object value);
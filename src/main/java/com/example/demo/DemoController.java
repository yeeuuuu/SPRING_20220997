//demo 패키지 폴더 안에 컨트롤러 파일을 만들어야 함. (패키지 : 프로젝트 폴더 구조 구분)
//대 소문자 및 이름이 일치해야 한다.  
//컨트롤러를 통해 페이지에 접근 == 페이지를 만들때마다 컨트롤러 등록 필요
//페이지 이름(주소)로 접근 가능하면 보안이 취약함. URI 컨트롤러 사용해 접근하면 서버 보안 강화

//위에 내가 컨트롤러라고 써놨기 때문에 컨트롤러가 되는것? 3주차, 나중 추가 설명

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 컨트롤러 어노테이션 명시
public class DemoController
{
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
//페이지 만들때마다 필수 등록
} 

//컨트롤러에서 사용자에게 응답할 View를 생성할 때 Model을 이용하여 View에 데이터를 전달
//model.addAttribute(String name/key, Object value);
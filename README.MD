# SPRING_BOOT

새로운 시작! 웹 서비스 개발의 세계로 떠나보아요~

## Getting Started

This project is a starting point for a Web application.

- [프로젝트 메인 주소](https://github.com/yeeuuuu/SPRING_20220997)

## 2주차 - 스프링 부트 개발환경 설정

1. 실습

- 개발환경 설정 및 깃허브 연동
- 스프링 부트 동작 과정
  - 클라이언트의 요청을 받으면 프론트 컨트롤러(서블릿)이 요청/응답 처리.
- thymeleaf
  - MVC에서 화면 출력(view 역할): DispatcherServlet(서블릿)을 통해 동작
  - 주요 기능: 데이터 바인딩, 연산, 객체 호출 등, 템플릿 Fragment, 전용 제어문(반복/조건 등)
- URL 맵핑과 컨트롤러 : 클라이언트 요청
  - 모든 링크는 컨트롤러를 통해 동작(URL 요청 이후 컨트롤러가 viewName을 리턴, 브라우저는 리턴받은 이름의 페이지를 연결)
  - DemoController.java 파일을 생성해 컨트롤러의 클래스 작성.
  - html 속 링크는 /파일명 으로 수정.

2. 연습문제

- 새로운 html을 만들어 URL 맵핑과 컨트롤러 추가
  - hello2.html을 만들어 기존 hello.html의 링크와 연결. 컨트롤러에 hello2 맵핑을 추가하고, 페이지에 출력할 텍스트 변수를 작성.

## 3주차 - 개인 포트폴리오 작성

1. 실습

- 3주차 포트폴리오 작성하기 완료
- [index.html : 실행/수정 완료](https://github.com/yeeuuuu/SPRING_20220997)
- 템플릿 삽입 후 내용 수정
  - 자기소개 및 전공/세부분야 맞춰 세부내용 수정
- 버튼에 매핑 경로 추가 후 about_detailed.html에 개인 소개 상세페이지 작성

2. 연습문제

- about_detailed.html의 되돌아가기 버튼 수정
  - 창을 닫을지 묻고 현재 창을 닫도록하는 알림창 추가: main.js에 confirmClose()함수를 추가 후 onclick="confirmClose()" 를 버튼에 추가. 그러나 알림창에서 확인을 눌러도 창이 닫히지 않는 오류 발생. 함수에 window.close() 를 사용했는데 사용자가 직접 연 탭은 스크립트가 임의로 닫을 수 없다고 함. 수정 필요

## 4주차 - 포트폴리오 프로필 수정 & 데이터베이스 연동

1. 실습

- 프로필 기술 & 경험 수정
- 데이터베이스 연동

2. 연습문제

## 5주차 - 포트폴리오 게시판 등록 & 블로그 제작

1. 실습

- 블로그 페이지 html, 컨트롤러, 도메인, 리포지토리, 서비스 파일 생성
- 블로그에서 직접 데이터를 입력할 수 있게 수정(글쓰기 기능)

2. 연습문제

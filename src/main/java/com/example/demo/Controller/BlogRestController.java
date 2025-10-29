package com.example.demo.Controller;

import com.example.demo.model.domain.Article;
import com.example.demo.model.service.AddArticleRequest;
import com.example.demo.model.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController // @Controller + @ResponseBody
public class BlogRestController {
  private final BlogService blogService;
  
  @PostMapping("/api/articles") // post 요청
  public ResponseEntity<Article> addArticle(@ModelAttribute AddArticleRequest request) { // 아직 클래스가 없음(에러)
    Article saveArticle = blogService.save(request); // 게시글 저장
    return ResponseEntity.status(HttpStatus.CREATED) // 상태 코드 및 게시글 정보 반환
      .body(saveArticle);

      // save는 만든게 아님. 데이터베이스 저장할때 만들어진것?
  }

  @GetMapping("/favicon.ico")
  public void favicon() {
  // 아무 작업도 하지 않음
}
}
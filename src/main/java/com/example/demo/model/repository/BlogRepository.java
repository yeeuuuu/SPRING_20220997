package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.domain.Article;

@Repository

public interface BlogRepository extends JpaRepository<Article, Long>{
}

//추가 사용자 정의 가능 – 비어놔도 상관없음
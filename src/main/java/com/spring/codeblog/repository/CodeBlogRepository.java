package com.spring.codeblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.codeblog.model.Post;

//acesso aos meetodos save, delete e update

public interface CodeBlogRepository extends  JpaRepository<Post, Long> {

}

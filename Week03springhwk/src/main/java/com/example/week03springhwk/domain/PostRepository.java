package com.example.week03springhwk.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;



public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByModifiedAtDesc();



}
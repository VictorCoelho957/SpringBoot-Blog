package com.spring.codeblog.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;


@Service
public class CodeblogServiceImpl implements  CodeblogService {
	
	@Autowired
	CodeblogRepository codeblogRepository ;
	
	@Override
	public List<Post> findAll() {
		
		return codeblogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		// TODO Auto-generated method stub
		return codeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		return codeblogRepository.save(post);
	}

}

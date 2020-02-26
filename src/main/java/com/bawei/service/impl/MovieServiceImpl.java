package com.bawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bawei.dao.MovieDao;
import com.bawei.entity.Movie;
import com.bawei.service.MovieService;
import com.bawei.vo.MovieVO;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieDao dao;

	@Override
	public List<Movie> list(MovieVO vo) {
		
		return dao.list(vo);
	}

	

	@Override
	public boolean deletep(String ids) {
		// TODO Auto-generated method stub
		return dao.deletep(ids);
	}




	

	

	
	
	
}

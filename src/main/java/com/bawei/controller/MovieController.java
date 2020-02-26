package com.bawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.entity.Movie;
import com.bawei.service.MovieService;
import com.bawei.vo.MovieVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MovieController {
	
	@Autowired 
	private MovieService service;
	
	
	@RequestMapping("list")
	public String list(Model m,MovieVO vo){
		
		if (vo.getPageNum()==null) {
			vo.setPageNum(1);
		}
		
		PageHelper.startPage(vo.getPageNum(), 3);
				
		
		List<Movie> list=service.list(vo);
		
		PageInfo<Movie> page=new PageInfo<Movie>(list);
		
		m.addAttribute("list", list);
		m.addAttribute("page", page);
		m.addAttribute("vo", vo);
		
		return "list";
	}
	
	@ResponseBody
	@RequestMapping("deletep")
	public boolean deletep(String ids){
		System.out.println("Controller£º£º£º"+ids);
		boolean result=service.deletep(ids);
		return result;
	}
	

}

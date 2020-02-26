package com.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.entity.Movie;
import com.bawei.vo.MovieVO;

public interface MovieDao {
	
	List<Movie> list(MovieVO movieVO);
	
	boolean deletep(@Param("ids")String ids);

}

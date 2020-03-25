package com.wangchuchao.movie.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangchuchao.movie.domain.Movie;
import com.wangchuchao.movie.domain.Year;

public interface MovieDao {
	

	boolean delsomecenter(Integer[] ids);
	boolean delsomemovie(Integer[] ids);

	List<Year> selyear();

	List<Movie> list(@Param("name")String name, @Param("guideName")String guideName, @Param("year")Integer year, 
			@Param("startTime")String startTime, @Param("endTime")String endTime, @Param("price1")Double price1,
			@Param("price2")Double price2, @Param("longTime1")Integer longTime1, @Param("longTime2")Integer longTime2);
	
}

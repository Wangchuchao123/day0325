package com.wangchuchao.movie.service;

import java.util.List;

import com.wangchuchao.movie.domain.Movie;
import com.wangchuchao.movie.domain.Year;

public interface MovieService {
	

	boolean delsome(Integer[] ids);

	List<Year> selyear();

	List<Movie> list(String name, String guideName, Integer year, String startTime, String endTime, Double price1,
			Double price2, Integer longTime1, Integer longTime2);
}

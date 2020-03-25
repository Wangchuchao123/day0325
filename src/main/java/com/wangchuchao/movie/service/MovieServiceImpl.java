package com.wangchuchao.movie.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wangchuchao.movie.dao.MovieDao;
import com.wangchuchao.movie.domain.Movie;
import com.wangchuchao.movie.domain.Year;
@Service
public class MovieServiceImpl implements MovieService{
	@Resource
	private MovieDao dao;
	
	@Override
	public boolean delsome(Integer[] ids) {
		//ɾ���м��
		dao.delsomecenter(ids);
		//ɾ����Ӱ��
		dao.delsomemovie(ids);
		return true;
	}
	@Override
	public List<Year> selyear() {
		//��ѯ���
		return dao.selyear();
	}
	@Override
	public List<Movie> list(String name, String guideName, Integer year, String startTime, String endTime, Double price1,
			Double price2, Integer longTime1, Integer longTime2) {
		//��ѯ�б�
		return dao.list(name,guideName,year,startTime,endTime,price1,price2,longTime1,longTime2);
	}

}

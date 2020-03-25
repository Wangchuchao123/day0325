package com.wangchuchao.movie.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangchuchao.movie.domain.Movie;
import com.wangchuchao.movie.domain.Year;
import com.wangchuchao.movie.service.MovieService;

@org.springframework.stereotype.Controller
public class Controller {
	@Resource
	private MovieService service;
	/**
	 * 
	 * @Title: list 
	 * @Description: 查询列表
	 * @param m
	 * @param pageNum
	 * @param name
	 * @param guideName
	 * @param year
	 * @param startTime
	 * @param endTime
	 * @param price1
	 * @param price2
	 * @param longTime1
	 * @param longTime2
	 * @return
	 * @return: String
	 */
	@RequestMapping("list")
	public String list(Model m,@RequestParam(defaultValue = "1")int pageNum,String name,String guideName,
			Integer year,String startTime,String endTime,Double price1,Double price2,Integer longTime1,
			Integer longTime2) {
		System.out.println("name:"+name);
		System.out.println("guideName:"+guideName);
		System.out.println("year:"+year);
		System.out.println("startTime:"+startTime);
		System.out.println("endTime:"+endTime);
		System.out.println("price1:"+price1);
		System.out.println("price2:"+price2);
		System.out.println("longTime1:"+longTime1);
		System.out.println("longTime2:"+longTime2);
		
		PageHelper.startPage(pageNum, 3);
		List<Movie> list = service.list(name,guideName,year,startTime,endTime,price1,price2,longTime1,longTime2);
		
		PageInfo<Movie> page = new PageInfo<Movie>(list);
		System.out.println(list);
		m.addAttribute("list", list);
		m.addAttribute("page", page);
		m.addAttribute("pageNum", pageNum);
		
		m.addAttribute("name", name);
		m.addAttribute("guideName", guideName);
		m.addAttribute("year", year);
		m.addAttribute("startTime", startTime);
		m.addAttribute("endTime", endTime);
		m.addAttribute("price1", price1);
		m.addAttribute("price2", price2);
		m.addAttribute("longTime1", longTime1);
		m.addAttribute("longTime2", longTime2);
		
		return "list";
		
	}
	/**
	 * 批量删除
	 * @Title: delsome 
	 * @Description: TODO
	 * @param ids
	 * @return
	 * @return: boolean
	 */
	@PostMapping("delsome")
	@ResponseBody
	public boolean delsome(Integer[] ids) {
		
		return service.delsome(ids);
		
	}
	
	/**
	 * 
	 * @Title: sel 
	 * @Description: 跳转条件查询页面
	 * @param m
	 * @return
	 * @return: String
	 */
	@RequestMapping("sel")
	public String sel(Model m) {
		
		return "sel";
		
	}
	/**
	 * 
	 * @Title: selyear 
	 * @Description: 查询年代
	 * @return
	 * @return: List<Year>
	 */
	@PostMapping("selyear")
	@ResponseBody
	public List<Year> selyear() {
		
		return service.selyear();
		
	}
}

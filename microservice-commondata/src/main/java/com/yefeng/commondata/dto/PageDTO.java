package com.yefeng.commondata.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 通用的分页返回类
 * @author: wangliying
 * @create: 2018-05-10
 **/
public class PageDTO<T> implements Serializable {

	private Integer totalpage;
	private Integer totalcount;
	private Integer size;
	private Integer currentpage;

	private List<T> records;

	public Integer getTotalpage() {
		if (totalpage != null) return totalpage;
		if (records == null || totalcount == null || size == null || size == 0 || totalcount == 0) return 0;
		int pages = 0;
		if (totalcount % size == 0) {
			pages = (totalcount / size);
		} else {
			pages = (totalcount / size) + 1;
		}
		return pages;
	}

	public void setTotalpage(Integer totalpage) {
		this.totalpage = totalpage;
	}

	public Integer getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(Integer totalcount) {
		this.totalcount = totalcount;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getCurrentpage() {
		return currentpage;
	}

	public void setCurrentpage(Integer currentpage) {
		this.currentpage = currentpage;
	}

	public List<T> getRecords() {
		return this.records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}
}

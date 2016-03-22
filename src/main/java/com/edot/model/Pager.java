package com.edot.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pager<T> {
	@JsonProperty("current_page")
	private int currentPage;
	@JsonProperty("page_size")
    private int pageSize;
    private long pageCount;
	@JsonProperty("record_count")
    private long recordCount;
    private List<T> datas;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getPageCount() {
		return pageCount;
	}

	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}

	public long getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(long recordCount) {
		this.recordCount = recordCount;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
}

package com.edot.model;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *  图文资讯
 * @author tony
 *
 */
@Entity(name = "msg_infomation")
public class MsgInfomationModel extends BaseModel {
	
	// 标题
	private String title;
	// 发布时间
	@JsonProperty("release_time")
	private Date releaseTime;
	// 发布人
	private String username;
	// 图片
	@JsonProperty("image_url")
	private String imageUrl;
	// 信息来源
	private String source;
	// 摘要
	private String summary;
	// 内容
	private String content;
	// 浏览量
	@JsonProperty("view_count")
	private Integer viewCount;
	// 状态，见ConstantUtils
	private Integer status;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getViewCount() {
		return viewCount;
	}
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}

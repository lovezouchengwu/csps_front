package com.edot.model;

import javax.persistence.Entity;

/**
 * 基础属性
 * @author Administrator
 *
 */
@Entity(name = "bac_property")
public class BacPropertyModel extends BaseModel {
	
	// 属性名称
	private String name;
	// 属性类型
	private String type;
	// 级联层数
	private Integer level;
	// 上级属性
	private BacPropertyModel parent;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public BacPropertyModel getParent() {
		return parent;
	}
	public void setParent(BacPropertyModel parent) {
		this.parent = parent;
	}
}

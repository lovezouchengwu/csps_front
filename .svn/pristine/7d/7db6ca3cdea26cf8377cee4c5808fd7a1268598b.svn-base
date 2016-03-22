package com.edot.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.edot.service.BaseService;

import cn.wltg.http.HttpApiClient;

public class BaseServiceImpl implements BaseService {

	@Autowired
    protected HttpApiClient httpApiClient;
	
	protected Map<String, Object> mapOf(String key, Object value) {
		Map<String, Object> map = new HashMap<>();
		map.put(key, value);
		return map;
	}
	
}

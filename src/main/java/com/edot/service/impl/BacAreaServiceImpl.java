package com.edot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edot.model.BacAreaModel;
import com.edot.service.BacAreaService;
import com.edot.util.ApiUrls;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class BacAreaServiceImpl extends BaseServiceImpl implements BacAreaService {

	@Override
	public List<BacAreaModel> list(Long parentId) throws Exception {
		return httpApiClient.get(ApiUrls.BAC_AREA_LIST, mapOf("parentId", parentId), new TypeReference<List<BacAreaModel>>() {});
	}

}

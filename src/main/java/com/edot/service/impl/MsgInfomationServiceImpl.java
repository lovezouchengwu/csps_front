package com.edot.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.edot.model.MsgInfomationModel;
import com.edot.model.Pager;
import com.edot.service.MsgInfomationService;
import com.edot.util.ApiUrls;
import com.edot.util.ConstantUtils;
import com.fasterxml.jackson.core.type.TypeReference;


@Service
public class MsgInfomationServiceImpl extends BaseServiceImpl implements MsgInfomationService {

	@Override
	public Pager<MsgInfomationModel> list(int currentPage) throws Exception {
		Map<String, Object> params = mapOf("currentPage", currentPage);
		params.put("pageSize", ConstantUtils.PAGE_SIZE);
		return httpApiClient.get(ApiUrls.MSG_INFOMATION_LIST, params, new TypeReference<Pager<MsgInfomationModel>>() {});
	}

	@Override
	public Map<String, MsgInfomationModel> view(Long id) throws Exception {
		return httpApiClient.get(ApiUrls.MSG_INFOMATION_VIEW, mapOf("id", id), new TypeReference<Map<String, MsgInfomationModel>>(){});
	}
}

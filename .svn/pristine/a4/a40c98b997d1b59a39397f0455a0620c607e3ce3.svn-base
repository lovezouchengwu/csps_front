package com.edot.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;


import com.edot.model.MsgPolicyModel;
import com.edot.model.Pager;
import com.edot.service.MsgPolicyService;
import com.edot.util.ApiUrls;
import com.edot.util.ConstantUtils;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MsgPolicyServiceImpl extends BaseServiceImpl implements MsgPolicyService{
	
	@Override
	public Pager<MsgPolicyModel> list(int currentPage) throws Exception {
		Map<String, Object> params = new HashMap<>();
		params.put("currentPage", currentPage);
		params.put("pageSize", ConstantUtils.PAGE_SIZE);
		return httpApiClient.get(ApiUrls.MSG_POLICY_LIST, params,new TypeReference<Pager<MsgPolicyModel>>() {});
	}

	@Override
	public Map<String, MsgPolicyModel> view(Long id) throws Exception {
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return httpApiClient.get(ApiUrls.MSG_POLICY_VIEW, params, new TypeReference<Map<String, MsgPolicyModel>>() {});
	}
}

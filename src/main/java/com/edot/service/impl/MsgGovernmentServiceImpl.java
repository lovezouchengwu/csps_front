package com.edot.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.edot.model.MsgGovernmentModel;
import com.edot.model.Pager;
import com.edot.service.MsgGovernmentService;
import com.edot.util.ApiUrls;
import com.edot.web.request.MsgSearchRequest;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MsgGovernmentServiceImpl extends BaseServiceImpl implements MsgGovernmentService {

	@Override
	public Pager<MsgGovernmentModel> list(MsgSearchRequest request) throws Exception {
		 return httpApiClient.post(ApiUrls.MSG_GOVERNMENT_LIST, request, new TypeReference<Pager<MsgGovernmentModel>>() {});
	}

	@Override
	public Map<String, MsgGovernmentModel> view(Long id) throws Exception {
		return httpApiClient.get(ApiUrls.MSG_GOVERNMENT_VIEW, mapOf("id", id), new TypeReference<Map<String, MsgGovernmentModel>>() {});
	}
	
}

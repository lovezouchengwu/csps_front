package com.edot.service;

import java.util.Map;

import com.edot.model.MsgGovernmentModel;
import com.edot.model.Pager;
import com.edot.web.request.MsgSearchRequest;

public interface MsgGovernmentService extends BaseService {

	public Pager<MsgGovernmentModel> list(MsgSearchRequest request) throws Exception;
	
	public Map<String, MsgGovernmentModel> view(Long id) throws Exception;
	
}

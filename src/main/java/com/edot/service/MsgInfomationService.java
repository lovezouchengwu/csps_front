package com.edot.service;

import java.util.Map;

import com.edot.model.MsgInfomationModel;
import com.edot.model.Pager;

public interface MsgInfomationService extends BaseService {

	public Pager<MsgInfomationModel> list(int currentPage) throws Exception;
	
	public Map<String, MsgInfomationModel> view(Long id) throws Exception;
	
}

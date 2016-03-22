package com.edot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.edot.service.MsgPolicyService;
import com.edot.support.Page;

@Controller
@RequestMapping("/msg/policy")
public class MsgPolicyController extends BaseController{
	
	@Autowired
	MsgPolicyService msgPolicyService;
	
	@RequestMapping(value="/list",method = RequestMethod.GET)	
	@Page
	public String list(@RequestParam(value="currentPage")int currentPage,Model model) throws Exception{
		model.addAttribute("pager", msgPolicyService.list(currentPage));
		return "msg/policy/list";
	}
	
	@RequestMapping(value="/view",method = RequestMethod.GET)	
	public String view(@RequestParam("id") Long id, Model model) throws Exception{
		model.addAttribute("msgPolicyMap", msgPolicyService.view(id));
		return "msg/policy/view";
	}

}

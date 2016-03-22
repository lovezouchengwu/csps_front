package com.edot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.edot.service.MsgGovernmentService;
import com.edot.support.Page;
import com.edot.web.request.MsgSearchRequest;

@Controller
@RequestMapping("/msg/government")
public class MsgGovernmentController extends BaseController {
	
	@Autowired
	private MsgGovernmentService msgGovernmentService;
	
	@RequestMapping(value = "/list")
	@Page
	public String list(MsgSearchRequest request, Model model) throws Exception {
		model.addAttribute("pager", msgGovernmentService.list(request));
		return "msg/government/list";
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(@RequestParam("id") Long id, Model model) throws Exception {
		model.addAttribute("msgGovernmentMap", msgGovernmentService.view(id));
		return "msg/government/view";
	}

}

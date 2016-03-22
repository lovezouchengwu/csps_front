package com.edot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.edot.service.MsgInfomationService;
import com.edot.support.Page;

@Controller
@RequestMapping("msg/infomation")
public class MsgInfomationController extends BaseController {

	@Autowired
	private MsgInfomationService msgInfomationService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@Page
	public String list(@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage, 
			Model model) throws Exception {
		model.addAttribute("pager", msgInfomationService.list(currentPage));
		return "msg/infomation/list";
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(@RequestParam(value = "id") Long id, Model model) throws Exception {
		model.addAttribute("msgInfomationMap", msgInfomationService.view(id));
		return "msg/infomation/view";
	}
}

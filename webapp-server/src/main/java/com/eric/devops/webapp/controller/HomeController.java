package com.eric.devops.webapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Value("${spring.application.name}")
	private String appName;
	
	@Value("${server.address}")
	private String serverAddr;
	
	@Value("${server.port}")
	private int serverPort;
	
	@Value("${heartbeat.message}")
	private String heartbeatMsg;
	
	@RequestMapping("/")
	public String getHome(Model homeModel) {
		homeModel.addAttribute("serverPort", serverPort);
		homeModel.addAttribute("serverAddr", serverAddr);
		homeModel.addAttribute("appName", appName);
		homeModel.addAttribute("heartbeatMsg", heartbeatMsg);
		return "index";
	}
}

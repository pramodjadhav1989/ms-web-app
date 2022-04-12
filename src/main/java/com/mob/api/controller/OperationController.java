package com.mob.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OperationController {

	@GetMapping("/forgetpassword")
    public String homePage(Model model) {
        
        return "forgetpwd";
    }
	
	@GetMapping("/devicerequest")
    public String devicerequest(Model model) {
        
        return "devicerequest";
    }
}

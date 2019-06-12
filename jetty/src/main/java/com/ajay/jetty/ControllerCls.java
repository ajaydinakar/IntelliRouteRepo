package com.ajay.jetty;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCls {
	@RequestMapping("/")
public String metghod()
{
return "Hellow world";	
}
}

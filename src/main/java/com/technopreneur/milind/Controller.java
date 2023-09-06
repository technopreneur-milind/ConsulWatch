package com.technopreneur.milind;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RefreshScope
public class Controller {
	
	@Value("${msg:Hello world - KV Store is not working..please check}")
	private String message;
	
	@GetMapping("/message")
	String getMsg() {
		return this.message;
	}
	

}

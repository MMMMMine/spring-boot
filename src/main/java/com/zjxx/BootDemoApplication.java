package com.zjxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BootDemoApplication {
	// 日志记录
	private static final Logger LOG = LoggerFactory.getLogger(BootDemoApplication.class);

	@RequestMapping("/")
	public String test(){
		LOG.error("error");
		LOG.info("info");
		LOG.debug("debug");
		LOG.warn("warn");
		return "HELLO WORLD!";
	}

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}
}

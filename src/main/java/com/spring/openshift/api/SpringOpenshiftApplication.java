package com.spring.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOpenshiftApplication {

	@GetMapping("/")
	public String redirect() {
		return "*********** Welcome Page *************";
	}

	@GetMapping("/{name}")
	public String message(@PathVariable String name) {
		return "Congrats !! " + name + "  Your application deployed successfully in OpenShift Container";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftApplication.class, args);
	}
}

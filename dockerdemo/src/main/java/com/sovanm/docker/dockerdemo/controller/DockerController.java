package com.sovanm.docker.dockerdemo.controller;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@GetMapping("/hello")
	public String sayHello() {
		return "hello serigne";
	}

	@GetMapping("/bonjour")
	public String sayBonjour() {
		return "bonjour";

	}
	
		private void syso() {
		System.out.println("test egit");

		}

	}
	



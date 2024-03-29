package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;

@RestController
public class MessageController {

	@ResponseBody
	@GetMapping("/message")
	Message send() {
		return new Message("first message");
	}

	@PostMapping("/message")
	Message echo(@RequestBody Message message) {
		return message;
	}
}

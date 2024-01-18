package com.pharos.info.study.controller;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class studyController {

	@GetMapping("/")
	public ResponseEntity<Integer> studyGet(@RequestParam int test) {
		log.info(String.valueOf(test));
		return ResponseEntity.ok(test+1);
	}
}

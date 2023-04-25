package com.example.demo.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class TestControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("GET 메소드 호출")
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/test"))
			.andDo(print()).andExpect(status().isOk())
			.andExpect(content().string(containsString("Hello World")));
	}

	@Test
	@DisplayName("POST 메소드 호출")
	public void shouldReturnDefaultMessagePost() throws Exception {
		this.mockMvc.perform(post("/"))
			.andDo(print()).andExpect(status().isOk())
			.andExpect(content().string(containsString("Hello World")));
	}
}

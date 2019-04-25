package com.example.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.cg.controller.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest(HomeController.class)
public class SpringBankBootApplicationTests {
	private MockMvc mockMvc;
	
	@Test
	public void contextLoads() throws Exception {
		 mockMvc.perform(get("/")) 
		 .andExpect(content().string( 	
		 containsString("Loading...")));
	}
	@Test
	 public void testRegister() throws Exception {
	 mockMvc.perform(get("/register")) .andExpect(status().isOk());}

	

}

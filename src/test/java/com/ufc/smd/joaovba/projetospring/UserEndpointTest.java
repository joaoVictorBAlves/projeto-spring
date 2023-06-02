package com.ufc.smd.joaovba.projetospring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserEndpointTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testGetUserById() {
		ResponseEntity<String> response = restTemplate.getForEntity("/users/1", String.class);
		String expectedJson = "{\"id\":1,\"name\":\"Maria\",\"email\":\"maria@gmail.com\",\"department\":{\"id\":1,\"name\":\"Gestão\"}}";

		assertEquals(expectedJson, response.getBody());
	}
}

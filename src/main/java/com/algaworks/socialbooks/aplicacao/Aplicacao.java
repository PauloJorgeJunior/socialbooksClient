package com.algaworks.socialbooks.aplicacao;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.web.client.RestTemplate;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		RequestEntity.get(URI.create("http://localhost:8080/livros")).header("Authorization", "Basic YWxnYXdvcmtzOnMzbmg0").build()
		
	}

}

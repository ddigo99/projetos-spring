package com.example.helloworld;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class HelloWorldController {

		@GetMapping("/hello")
		public String helloWorld() {
			return "Hello World!";
		}

		@GetMapping("/bsms")
		public List<String> getBSMs() {
			return Arrays.asList("Proatividade", "Orientação ao detalhe", "Orientação ao futuro");
		}

		@GetMapping("/objectives")
		public List<String> getObjectives() {
			return Arrays.asList("Aprender Spring Boot", "Melhoras algumas BSMS", "Participar de processos seletivos",
					"Buscar um maior conhecimento com base em esforço");
		}
	}

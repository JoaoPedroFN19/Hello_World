package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloworld() {
		return " Hello World!! ";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "Orientação ao futuro \nResponsabilidade Pessoal \nMentalidade de Crescimento"
				+ " \nPersistência \nTrabalho em equipe"
				+ " \nAtenção aos detalhes \nProatividade \nComunicação ";
	}
	
	@GetMapping("/objetivo-da-semana")
	public String objetivodasemana() {
		return "Aprender Spring-Boot, e aperfeiçoar minhas habilidades técnicas!";
	}
}

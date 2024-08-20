package com.example.Lista2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Ex01Application {
	private static List ilhas = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(Ex01Application.class, args);
	}

	@PostMapping("/ilhas-de-calor")
	public static String adicionarIlhaDeCalor(@RequestBody IlhaDeCalor ilha) {
		ilhas.add(ilha);

		return "Ilha de calor " + ilha.getBairro() + " adicionada com sucesso!";
	}

	@GetMapping("/ilhas-de-calor")
	public static List listarIlhasDeCalor() {
		return ilhas;
	}
}
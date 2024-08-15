package com.example.Ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Ex01Application {

	@GetMapping("/{senha}")
	public String validarSenha(@PathVariable("senha") String senha) {
		if ("senha123".equals(senha)) {
            return "Entrada autorizada!\n Seja Bem vindo Guih!";
        } else {
            return "Entrada não autorizada...";
        }
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ex01Application.class, args);
	}

}
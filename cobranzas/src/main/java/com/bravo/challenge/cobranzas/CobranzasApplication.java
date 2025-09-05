package com.bravo.challenge.cobranzas;

import com.bravo.challenge.cobranzas.model.Usuario;
import com.bravo.challenge.cobranzas.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CobranzasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CobranzasApplication.class, args);
	}
	@Bean
	CommandLineRunner mostrarUsuarios(UsuarioRepository usuarioRepository) {
		return args -> {
			System.out.println("Usuarios en la DB:");
			for (Usuario u : usuarioRepository.findAll()) {
				System.out.println(u.getId() + " | " + u.getUsername() + " | " + u.getPassword() + " | " + u.getRol() + " | " + u.getState());
			}
		};
	}

}

package com.jacoste.galactic.security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jacoste.galactic.repository.UserRepository;

import com.jacoste.galactic.table.Role;
import com.jacoste.galactic.table.User;
import com.jacoste.galactic.repository.UserRepository;

@Service
public class DbInit implements CommandLineRunner{
	private final UserRepository utilisateurRepository;
	private final PasswordEncoder passwordEncoder;
	
	public DbInit(UserRepository utilisateurRepository, PasswordEncoder passwordEncoder) {
		this.utilisateurRepository = utilisateurRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public void run(String... args) throws Exception {
		//Utilisateur user = new Utilisateur("Jacopo", passwordEncoder.encode("123"), 25, Role.USER);
		//Utilisateur admin = new Utilisateur("Admin", passwordEncoder.encode("456"), 3, Role.ADMIN);
		//utilisateurRepository.save(user);
		//utilisateurRepository.save(admin);
	}

}

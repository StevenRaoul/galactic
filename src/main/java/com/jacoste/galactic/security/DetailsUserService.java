package com.jacoste.galactic.security;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jacoste.galactic.repository.UserRepository;
import com.jacoste.galactic.table.User;

@Service
public class DetailsUserService implements UserDetailsService{
	
	private final UserRepository userRepository;

	public DetailsUserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User> optionalUser = userRepository.findByEmail(email);
		
		if (optionalUser.isPresent()) {
			return (UserDetails) optionalUser.get();
		}
		throw new UsernameNotFoundException(email + "pas en BD");
	}
	
}

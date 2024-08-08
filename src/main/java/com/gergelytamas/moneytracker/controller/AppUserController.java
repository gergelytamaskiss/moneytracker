package com.gergelytamas.moneytracker.controller;

import java.util.List;

import com.gergelytamas.moneytracker.model.AppUser;
import com.gergelytamas.moneytracker.repository.AppUserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppUserController {

	private final AppUserRepository repo;

	AppUserController(AppUserRepository repo) {
		this.repo = repo;
	}

	@GetMapping("/api/app_users")
	List<AppUser> getAll() {
		return repo.findAll();
	}
}

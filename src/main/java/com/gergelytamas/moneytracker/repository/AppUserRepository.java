package com.gergelytamas.moneytracker.repository;

import com.gergelytamas.moneytracker.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
	//
}

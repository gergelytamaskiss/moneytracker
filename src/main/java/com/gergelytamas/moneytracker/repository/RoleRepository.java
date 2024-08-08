package com.gergelytamas.moneytracker.repository;

import com.gergelytamas.moneytracker.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

interface RoleRepository extends JpaRepository<Role, Integer> {
	//
}

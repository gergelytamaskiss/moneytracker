package com.gergelytamas.moneytracker.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "app_user")
public class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_user_id_gen")
	@SequenceGenerator(name = "app_user_id_gen", sequenceName = "app_user_id_seq", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Size(max = 256)
	@NotNull
	@Column(name = "email", nullable = false, length = 256)
	private String email;

	@Size(max = 128)
	@NotNull
	@Column(name = "password", nullable = false, length = 128)
	private String password;

	@Size(max = 128)
	@Column(name = "first_name", length = 128)
	private String firstName;

	@Size(max = 128)
	@Column(name = "last_name", length = 128)
	private String lastName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	private Role role;

	@NotNull
	@Column(name = "enabled", nullable = false)
	private Boolean enabled = false;

	@Column(name = "last_login")
	private Instant lastLogin;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "created_by")
	private AppUser createdBy;

	@NotNull
	@Column(name = "created_on", nullable = false)
	private Instant createdOn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "modified_by")
	private AppUser modifiedBy;

	@NotNull
	@Column(name = "modified_on", nullable = false)
	private Instant modifiedOn;

}
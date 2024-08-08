package com.gergelytamas.moneytracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {
	@Id
	@ColumnDefault("nextval('role_id_seq')")
	@Column(name = "id", nullable = false)
	private Integer id;

	@Size(max = 64)
	@NotNull
	@Column(name = "name", nullable = false, length = 64)
	private String name;

	@NotNull
	@Column(name = "enabled", nullable = false)
	private Boolean enabled = false;

	@Column(name = "created_by")
	private Integer createdBy;

	@NotNull
	@Column(name = "created_on", nullable = false)
	private Instant createdOn;

	@Column(name = "modified_by")
	private Integer modifiedBy;

	@NotNull
	@Column(name = "modified_on", nullable = false)
	private Instant modifiedOn;

}
package com.andreidodu.boilerplate.db;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "data_bis")
public class DataBisDB {

	@Id
	@Column(name = "data_bis_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "str_field", length = 255, nullable = false)
	private String field;

	@Column(name = "insert_date", updatable = false, insertable = false)
	@JsonIgnore
	private Timestamp dateIns;

	@Column(name = "update_date", updatable = true, insertable = false)
	@JsonIgnore
	private Timestamp dateUpd;

	@Version
	@Column(name = "version")
	@JsonIgnore
	private Integer version;

}

package com.dataguise.saas.model;
// default package
// Generated 4 Nov, 2016 11:19:03 AM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * DgSaasUserSolutions generated by hbm2java
 */
@Entity
@Table(name = "dg_saas_user_solutions")
public class DgSaasUserSolutions implements java.io.Serializable {

	private int id;
	private DgSaasUsers dgSaasUsers;
	private DgSaasDataSolutions dgSaasDataSolutions;

	public DgSaasUserSolutions() {
	}

	public DgSaasUserSolutions(int id, DgSaasUsers dgSaasUsers,
			DgSaasDataSolutions dgSaasDataSolutions) {
		this.id = id;
		this.dgSaasUsers = dgSaasUsers;
		this.dgSaasDataSolutions = dgSaasDataSolutions;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@TableGenerator(name="table_gen", table="dg_sequence_gen", pkColumnName="seq_col_name",
	valueColumnName="seq_col_value", pkColumnValue="dg_saas_user_solution", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="table_gen")
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public DgSaasUsers getDgSaasUsers() {
		return this.dgSaasUsers;
	}

	public void setDgSaasUsers(DgSaasUsers dgSaasUsers) {
		this.dgSaasUsers = dgSaasUsers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "solution_id", nullable = false)
	public DgSaasDataSolutions getDgSaasDataSolutions() {
		return this.dgSaasDataSolutions;
	}

	public void setDgSaasDataSolutions(DgSaasDataSolutions dgSaasDataSolutions) {
		this.dgSaasDataSolutions = dgSaasDataSolutions;
	}

}

package it.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
@Table(name = "profilo")
public class DipendenteProfilo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NeverNull
	@Column(name = "username")
	private String username;
	@NeverNull
	@Column(name = "password")
	private String password;
	@OneToOne
	@NeverNull
     @JoinColumn(name = "id_dipendente", referencedColumnName = "id")
     private Dipendente dipendenteId;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}



	
	public Dipendente getDipendenteId() {
		return dipendenteId;
	}
	public void setDipendenteId(Dipendente dipendenteId) {
		this.dipendenteId = dipendenteId;
	}
	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

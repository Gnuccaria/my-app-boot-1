package it.app.model;

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
public class DipendenteProfilo {
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
	@JoinColumn(name = "codice", referencedColumnName = "codiceFiscale")
     private Dipendente dipendente;
	// il capo assegna l'account al dipndente (cliccando sui dati del dipendente per
	// creare un account, passa l'id al backend)


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Dipendente getDipendente() {
		return dipendente;
	}

	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
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

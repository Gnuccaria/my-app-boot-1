package it.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
@Table(name = "status")
public class StatusGenerale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	@Column
	private Integer idDipendente;//può essere nullo perchè non indica necessariamente lo stato del dipendente
	@Column
	private Integer idSchedule;//può essere nullo perchè non indica necessariamente lo stato della task
	//sarà popolata o la colonna task o la colonna dipendente a seconda si chi si riferisce lo stato
	@Column
	@NeverNull
	private String stato;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getIdDipendente() {
		return idDipendente;
	}
	public void setIdDipendente(Integer idDipendente) {
		this.idDipendente = idDipendente;
	}
	public Integer getIdSchedule() {
		return idSchedule;
	}
	public void setIdTask(Integer idSchedule) {
		this.idSchedule = idSchedule;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}

}

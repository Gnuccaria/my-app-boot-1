package it.app.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
@Table(name="schedule")
public class ScheduleLavoro implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NeverNull
	@Column
	private String mansione;//materia lavoro svolto //creare model mansione
	@NeverNull
	@Column	
	private Date dataInizioTask;
	@NeverNull
	@Column
	private Date dataFineTask;
	@NeverNull
	@Column
	private String descrizione;
	@NeverNull
	@Column
	private Stato stato;
	@NeverNull
	@OneToOne
	@JoinColumn(name = "luogo_id", referencedColumnName = "id")
	private LuogoDiLavoro luogo;
	@OneToOne
	@JoinColumn(name = "dipendente",referencedColumnName = "codiceFiscale" )//oneToMany 
	private Dipendente dipendente;
	public Integer getId() {
		return id;
	}
	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	
	public Dipendente getDipendente() {
		return dipendente;
	}
	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public String getMansione() {
		return mansione;
	}
	public void setMansione(String mansione) {
		this.mansione = mansione;
	}
	public Date getDataInizioTask() {
		return dataInizioTask;
	}
	public void setDataInizioTask(Date dataInizioTask) {
		this.dataInizioTask = dataInizioTask;
	}
	public Date getDataFineTask() {
		return dataFineTask;
	}
	public void setDataFineTask(Date dataFineTask) {
		this.dataFineTask = dataFineTask;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public LuogoDiLavoro getLuogo() {
		return luogo;
	}
	public void setLuogo(LuogoDiLavoro luogo) {
		this.luogo = luogo;
	}

	
	
	
}

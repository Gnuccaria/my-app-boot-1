package it.app.dto;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import it.app.model.Dipendente;
import it.app.model.LuogoDiLavoro;
import it.app.model.Stato;
import net.bytebuddy.utility.nullability.NeverNull;

public class ScheduleLavoroDto {
	private Integer id;
	private String mansione;//materia lavoro svolto //creare model mansione
	private Date dataInizioTask;
	private Date dataFineTask;
	private String descrizione;
	private Stato stato;
	private LuogoDiLavoro luogo;
	private Dipendente dipendente;
	public Integer getId() {
		return id;
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
	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	public LuogoDiLavoro getLuogo() {
		return luogo;
	}
	public void setLuogo(LuogoDiLavoro luogo) {
		this.luogo = luogo;
	}
	public Dipendente getDipendente() {
		return dipendente;
	}
	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}
	
	

}

package it.app.dto;

import java.util.Date;
import java.util.List;

import it.app.model.Dipendente;
import it.app.model.LuogoDiLavoro;

public class ScheduleLavoroDto {
	private Integer id;
	private List<Integer> idDipendente;
	private String mansione;//materia lavoro svolto
	private Date dataInizioTask;
	private Date dataFineTask;
	private String descrizione;
	private LuogoDiLavoro luogo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Integer> getIdDipendente() {
		return idDipendente;
	}
	public void setIdDipendente(List<Integer> idDipendente) {
		this.idDipendente = idDipendente;
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

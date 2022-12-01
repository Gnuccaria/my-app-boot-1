package it.app.dto;

import java.util.Date;


import it.app.model.Dipendente;

public class ScheduleLavoroDto {

	private Integer id;
	private String task;
	private Date dataTask;
	private Integer status;//simbolo colorato (css:transition)
	public Integer getId() {
		
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public Date getDataTask() {
		return dataTask;
	}
	public void setDataTask(Date dataTask) {
		this.dataTask = dataTask;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Dipendente getDipendente() {
		return dipendente;
	}
	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}
	private Dipendente dipendente;
}

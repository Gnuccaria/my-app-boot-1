package it.app.model;

import java.util.Date;

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
@Table(name="schedule")
public class ScheduleLavoro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	@NeverNull
	private Integer idLuogo;
	@Column
	@NeverNull
	private Integer idDipendente;
	@Column
	@NeverNull
	private String task;
	@NeverNull
	@Column(name="datatask")
	private Date dataTask;
	@Column
	private String note;
	
	
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
}

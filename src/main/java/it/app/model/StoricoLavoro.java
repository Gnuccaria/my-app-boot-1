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
//sospeso
@Entity
@Table(name = "storico")
public class StoricoLavoro {// legata a schedule
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NeverNull
	@Column
	private String mansione;// materia lavoro svolto
	@NeverNull
	@Column
	private Date dataInizioTask;
	@Column
	private Date dataFineTask;//può essere null perché nello storico vanno le task che sono ALMENO iniziate, non perforza finite
	@NeverNull
	@Column
	private String descrizione;// allegare documenti

	@OneToOne
	@JoinColumn(name = "luogo_id", referencedColumnName = "id")
	private LuogoDiLavoro luogo;

	public String getMansione() {
		return mansione;
	}

	public void setMansione(String mansione) {
		this.mansione = mansione;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataInizioTask() {
		return dataInizioTask;
	}

	public void setDataInizioTask(Date dataTask) {
		this.dataFineTask = dataTask;
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

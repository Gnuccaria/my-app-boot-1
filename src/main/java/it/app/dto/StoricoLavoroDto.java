package it.app.dto;

import java.util.Date;

import it.app.model.LuogoDiLavoro;
//sospeso
public class StoricoLavoroDto {
	 
		private String mansione;//materia lavoro svolto
		private Integer id;
		private Date dataInizioTask;
		private Date dataFineTask;
		private String descrizione;//allegare documenti
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
			this.dataInizioTask = dataTask;
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

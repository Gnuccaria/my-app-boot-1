package it.app.dto;

import java.util.Date;

import it.app.model.LuogoDiLavoro;

public class StoricoLavoroDto {
	 
		private String mansione;//materia lavoro svolto
		private Integer id;
		private Date dataTask;
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
		public Date getDataTask() {
			return dataTask;
		}
		public void setDataTask(Date dataTask) {
			this.dataTask = dataTask;
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

package it.app.dto;

import it.app.model.Dipendente;

public class DipendenteProfiloDto {
	private Integer id;
    private String userName; 
    private String password;
    private Dipendente dipendenteId;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Dipendente getDipendenteId() {
		return dipendenteId;
	}
	public void setDipendenteId(Dipendente dipendenteId) {
		this.dipendenteId = dipendenteId;
	}
	


}

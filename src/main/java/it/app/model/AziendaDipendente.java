package it.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "azienda")
public class AziendaDipendente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="ragione_sociale")
	private String ragioneSociale; //es: “Evergreen di Mario Rossi s.n.c.”  https://quifinanza.it/lavoro/ragione-sociale-cose-significato/391774/
	@Column(name="indirizzo_legale")
	private String indirizzoLegale; 
	@Column(name="codice_fiscale")
	private String codiceFiscale;
	@Column(name="numero_soci")
	private Integer numeroSoci;
	@Lob
	@Column(name="soci")
	private List<String> soci;
	//codiceFiscale/numero di partita iva
	//ufficio del Registro delle Imprese presso cui la società è iscritta ed il numero di iscrizione (REA)
	//eventuale stato di liquidazione della società
	//----Nel caso di società per azioni (Spa), società a responsabilità limitata (srl) e società in accomandita per azioni (Sapa) i dati indicati dovranno includere anche:
	
	//valore del capitale sociale versato, come risulta esistente dall’ultimo bilancio
	//l’indicazione che la Società ha un socio unico (solo per Spa e Srl)
	

	
}




//----NOTE LEGALI---- https://www.newcomweb.it/blog/vademecum/article/quali-sono-i-dati-societari


//----Dati societari completi per società di persone
//Nel caso di società di persone come Ss, Snc, Sas è necessario indicare:
//
//ragione sociale
//indirizzo della sede legale della società
//codice fiscale/numero di partita iva
//ufficio del Registro delle Imprese presso cui la società è iscritta ed il numero di iscrizione (REA)
//eventuale stato di liquidazione della società
//----Dati societari completi per società di capitali
//----Nel caso di società per azioni (Spa), società a responsabilità limitata (srl) e società in accomandita per azioni (Sapa) i dati indicati dovranno includere anche:
//
//ragione sociale
//indirizzo della sede legale della società;
//codice fiscale/numero di partita iva
//ufficio del registro delle imprese presso presso cui la società è iscritta ed il numero d’iscrizione (REA)
//valore del capitale sociale versato, come risulta esistente dall’ultimo bilancio
//eventuale stato di liquidazione della società
//l’indicazione che la Società ha un socio unico (solo per Spa e Srl)
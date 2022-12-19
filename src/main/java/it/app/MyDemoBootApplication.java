package it.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import it.app.model.ScheduleLavoro;
import it.app.service.ContrattoService;
import it.app.service.DipendenteProfiloService;
import it.app.service.DipendenteService;
import it.app.service.LuogoService;
import it.app.service.ScheduleService;
import it.app.service.StoricoService;
import it.app.service.impl.ContrattoServiceImpl;
import it.app.service.impl.DipendenteProfiloServiceImpl;
import it.app.service.impl.DipendenteServiceImpl;
import it.app.service.impl.LuogoServiceimpl;
import it.app.service.impl.ScheduleServiceImpl;
import it.app.service.impl.StoricoServiceImpl;
//webSocket magichine
//https://www.youtube.com/watch?v=4Hyv4M1kFeM


@EnableJpaRepositories(basePackages="it.app.repository")
@SpringBootApplication
public class MyDemoBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoBootApplication.class, args);
	}

@Bean("dipendente")
public DipendenteService getDipendenteService() {
	return new DipendenteServiceImpl();
}
@Bean ("contratto")
public ContrattoService getContrattoDipendente() {
	return new ContrattoServiceImpl();
}
@Bean("profilo")
public DipendenteProfiloService getDipendenteProfilo() {
	return new DipendenteProfiloServiceImpl();
}
@Bean("luogo")
public LuogoService getLuogoDiLavoro() {
	return new LuogoServiceimpl();
}
@Bean("Storico")//sospeso
public StoricoService getStorico() {
	return new StoricoServiceImpl();
}
@Bean("Schedule")
public ScheduleService getSchedule() {
	return new ScheduleServiceImpl();
}




}

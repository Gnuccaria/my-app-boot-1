package it.app.mapper;

import it.app.dto.OrarioDipendenteDto;

import it.app.model.OrarioDipendente;

public interface OrarioMapper {

	OrarioDipendente dtoToModel(OrarioDipendenteDto dipDto);

	OrarioDipendenteDto modelToDto(OrarioDipendente dip);

}

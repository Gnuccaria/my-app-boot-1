package it.app.mapper;

import it.app.dto.RapportinoDto;
import it.app.model.Rapportino;

public interface RapportinoMapper {

	Rapportino dtoToModel(RapportinoDto dipDto);

	RapportinoDto modelToDto(Rapportino dip);

}

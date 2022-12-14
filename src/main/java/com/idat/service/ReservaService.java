package com.idat.service;

import java.util.List;

import com.idat.Dto.ReservaDTO;


public interface ReservaService {
	List<ReservaDTO> listar();
	void guardar(ReservaDTO reserva);
	

}

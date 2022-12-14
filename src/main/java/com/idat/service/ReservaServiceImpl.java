package com.idat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Dto.ReservaDTO;

import com.idat.model.Reserva;
import com.idat.repository.ReservaRepository;


@Service
public class ReservaServiceImpl implements ReservaService {
	@Autowired
	private ReservaRepository repository;

	@Override
	public List<ReservaDTO> listar() {
		List<ReservaDTO> listado = new ArrayList<>();
		ReservaDTO dto = null;
		for (Reserva reserva : repository.findAll()) {
			dto = new ReservaDTO();
			dto.setIdReserva(reserva.getIdReserva());
			dto.setCosto(reserva.getCosto());
			listado.add(dto);
		}
		return listado;

	}

	@Override
	public void guardar(ReservaDTO reserva) {
		Reserva res = new Reserva();
		res.setIdReserva(reserva.getIdReserva());
		res.setCosto(reserva.getCosto());
		repository.save(res);

		
	}

}
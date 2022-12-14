package com.idat.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.idat.Dto.ReservaDTO;

@FeignClient(name="Reserva-microservicio", url="localhost:8080")
public interface OpenFeingClient {
	
			@GetMapping("/api/reserva/v1/listar")
			public List<ReservaDTO> listarReserva();
			
}

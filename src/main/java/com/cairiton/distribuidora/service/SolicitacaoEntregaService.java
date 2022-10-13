package com.cairiton.distribuidora.service;

import java.time.OffsetDateTime;

import org.springframework.stereotype.Service;

import com.cairiton.distribuidora.model.Cliente;
import com.cairiton.distribuidora.model.Entrega;
import com.cairiton.distribuidora.model.StatusEntrega;
import com.cairiton.distribuidora.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {
	
	
	private CatalogoClienteService catalogoClienteService;
	
	private EntregaRepository entregaRepository;
	
	
	public Entrega solicitar (Entrega entrega){
	Cliente cliente =	catalogoClienteService.buscar(entrega.getCliente().getId());
	
	
		entrega.setCliente(cliente);
		entrega.setStatus(StatusEntrega.PENDENTE);
		entrega.setDataPedido(OffsetDateTime.now());
		
		return entregaRepository.save(entrega);
		
	}

}

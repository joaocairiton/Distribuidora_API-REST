package com.cairiton.distribuidora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cairiton.distribuidora.model.Entrega;
@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {

}

package com.elohim.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.elohim.crm.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}

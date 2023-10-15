package br.com.webank.webank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webank.webank.model.ContaBancaria;
import java.util.List;


public interface ContaBancariaRepository extends JpaRepository<ContaBancaria, Long> {

}

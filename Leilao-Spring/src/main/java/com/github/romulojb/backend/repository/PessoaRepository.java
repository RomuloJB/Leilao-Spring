package com.github.romulojb.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.romulojb.backend.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
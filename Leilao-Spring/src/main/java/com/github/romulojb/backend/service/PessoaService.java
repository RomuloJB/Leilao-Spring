package com.github.romulojb.backend.service;

import java.rmi.NoSuchObjectException;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import com.github.romulojb.backend.exception.NotFoundException;
import com.github.romulojb.backend.model.Pessoa;
import com.github.romulojb.backend.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private MessageSource messageSource;

    public Pessoa buscarPorId(Long id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(messageSource.getMessage("pessoa.notfound",
                        new Object[] { id }, LocaleContextHolder.getLocale())));
    }

    public Page<Pessoa> buscarTodos(Pageable pageable) {
        return pessoaRepository.findAll(pageable);
    }

    public Pessoa inserir(Pessoa pessoa) {
        return pessoaCadastrada = pessoaRepository.save(pessoa);
        emailSevice.enviarEmailSimples(pessoaCadastrada.getEmail(), :"Cadastrado com sucesso",
        "Cadastro no sistema de leilao foi feito com sucesso");
    }

    public Pessoa alterar(Pessoa pessoa) {
        Pessoa pessoaBanco = buscarPorId(pessoa.getId());

        pessoa.setNome(pessoa.getNome());
        pessoa.setEmail(pessoa.getEmail());

        return pessoaRepository.save(pessoaBanco);
    }

    public void deletar(Long id) {
        Pessoa pessoaBanco = buscarPorId(id);

        pessoaRepository.delete(pessoaBanco);
    }

}

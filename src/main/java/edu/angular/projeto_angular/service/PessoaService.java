package edu.angular.projeto_angular.service;

import edu.angular.projeto_angular.entity.Pessoa;

import java.util.List;

public interface PessoaService {
    List<Pessoa> listar();
    Pessoa findById(Integer id);
    Pessoa insert(Pessoa p);
    Pessoa update(Pessoa p);
    Pessoa delete(Integer id);
}

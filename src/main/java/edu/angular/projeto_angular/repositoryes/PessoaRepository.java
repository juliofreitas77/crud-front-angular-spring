package edu.angular.projeto_angular.repositoryes;

import edu.angular.projeto_angular.entity.Pessoa;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PessoaRepository extends Repository<Pessoa, Integer> {
    List<Pessoa> findAll();
    Pessoa findById(Integer id);
    Pessoa save(Pessoa p);
    void delete(Pessoa p);
}

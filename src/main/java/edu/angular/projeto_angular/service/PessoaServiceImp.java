package edu.angular.projeto_angular.service;

import edu.angular.projeto_angular.entity.Pessoa;
import edu.angular.projeto_angular.repositoryes.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImp implements PessoaService {

    @Autowired
    private PessoaRepository repository;

    @Override
    public List<Pessoa> listar() {
        return repository.findAll();
    }

    @Override
    public Pessoa findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Pessoa insert(Pessoa p) {
        return repository.save(p);
    }

    @Override
    public Pessoa update(Pessoa p) {
        return repository.save(p);
    }

    @Override
    public Pessoa delete(Integer id) {
        Pessoa p = repository.findById(id);
        if(p!=null) {
            repository.delete(p);
        }
        return p;
    }
}

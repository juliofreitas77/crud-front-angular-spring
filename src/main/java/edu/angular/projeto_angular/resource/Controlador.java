package edu.angular.projeto_angular.resource;

import edu.angular.projeto_angular.entity.Pessoa;
import edu.angular.projeto_angular.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/pessoas")
public class Controlador {

    @Autowired
    PessoaService service;

    @GetMapping
    public List<Pessoa> listar() {
        return service.listar();
    }

    @PostMapping
    public Pessoa insertPessoa(@RequestBody Pessoa p) {
        return service.insert(p);
    }

    @GetMapping(path={"/{id}"})
    public Pessoa findById(@PathVariable("id")Integer id){
        return service.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Pessoa editar(@RequestBody Pessoa pessoa, @PathVariable("id") Integer id){
        pessoa.setId(id);
        return service.update(pessoa);
    }

    @DeleteMapping(path = {"/{id}"})
    public Pessoa delete(@PathVariable("id") Integer id){
        return service.delete(id);
    }

}

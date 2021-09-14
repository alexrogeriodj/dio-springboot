package dio.springbootweb.controller;

import dio.springbootweb.model.Cliente;
import dio.springbootweb.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @PostMapping("/clientes")
    public void post(@RequestBody Cliente cliente){
        repository.save(cliente);
    }
    @PutMapping("/clientes")
    public void put(@RequestBody Cliente cliente){
        repository.update(cliente);
    }
    @GetMapping("/clientes")
    public List<Cliente> getAll(){
        return repository.listAll();
    }
    @GetMapping("/clientes/{id}")
    public Cliente getOne(@PathVariable("id") Integer id){
        return repository.finById(id);
    }
    @DeleteMapping("/clientes/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}

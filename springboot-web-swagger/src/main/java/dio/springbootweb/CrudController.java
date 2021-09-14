package dio.springbootweb;

import dio.springbootweb.model.Cliente;
import dio.springbootweb.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrudController {

    @PostMapping("/crud/post")
    public void post(@RequestBody User user){
        System.out.println("POST - Este foi o usuário recebido");

    }
    @PutMapping("/crud/put")
    public void put(@RequestBody User user){
        System.out.println("PUT - Este foi o usuário recebido");
        System.out.println(user);
    }
    @GetMapping("/crud/all")
    public List<Cliente> getAll(){
        return repository.listAll();
    }
    @GetMapping("/crud/one/{id}")
    public Cliente getOne(@PathVariable("id") Integer id){
        return repository.finById(id);
    }
    @DeleteMapping("/crud/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}

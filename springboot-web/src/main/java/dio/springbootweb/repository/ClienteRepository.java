package dio.springbootweb.repository;

import dio.springbootweb.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ClienteRepository {
    private static int nextId=0;
    private Map<Integer,Cliente> clientes = new HashMap<>();
    public ClienteRepository(){

    }
    public void save(Cliente cliente){
        cliente.setId(++nextId);
        clientes.put(cliente.getId(),cliente);
    }
    public void update(Cliente cliente){
        clientes.put(cliente.getId(),cliente);
    }
    public void remove(Integer id){
        clientes.remove(id);
    }
    public List<Cliente> listAll(){
        return clientes.values().stream().collect(Collectors.toList());
    }
    public Cliente finById(Integer id){
        return clientes.get(id);
    }

}

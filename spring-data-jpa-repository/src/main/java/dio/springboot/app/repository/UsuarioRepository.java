package dio.springboot.app.repository;

import org.springframework.data.repository.CrudRepository;

import dio.springboot.app.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	boolean existsByLogin(String login);
}

package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.springboot.app.model.Usuario;
import dio.springboot.app.repository.UsuarioRepository;

@Component
public class SistemaUsuario implements CommandLineRunner {

	@Autowired
	private UsuarioRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setEmail("gleyson@dio.com.br");
		usuario.setLogin("gleyson");
		usuario.setNomeCompleto("GLEYSON SAMPAIO");
		usuario.setSenha("diospringjpa");
		repository.save(usuario);
		
	}
}

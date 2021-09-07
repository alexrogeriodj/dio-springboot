package dio.springboot.app;

import org.hibernate.internal.util.collections.JoinedIterable;
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
		if(!repository.existsByLogin("gleyson")) {
			Usuario gleyson = criarUsuarioGleyson();
			repository.save(gleyson);
		}
		if(!repository.existsByLogin("admin")) {
			Usuario admin = criarUsuarioAdmin();
			repository.save(admin);
		}
		
		Iterable<Usuario> usuarios = repository.findAll();
		usuarios.forEach(u->System.out.println(u.getNomeCompleto() + " - " + u.getLogin()));
		
	}
	private Usuario criarUsuarioGleyson() {
		Usuario usuario = new Usuario();
		usuario.setEmail("gleyson@dio.com.br");
		usuario.setLogin("gleyson");
		usuario.setNomeCompleto("GLEYSON SAMPAIO");
		usuario.setSenha("diospringjpa");
		return usuario;
	}
	private Usuario criarUsuarioAdmin() {
		Usuario usuario = new Usuario();
		usuario.setEmail("admin@dio.com.br");
		usuario.setLogin("admin");
		usuario.setNomeCompleto("ADMINISTRADOR");
		usuario.setSenha("masterpass");
		return usuario;
	}
	
}

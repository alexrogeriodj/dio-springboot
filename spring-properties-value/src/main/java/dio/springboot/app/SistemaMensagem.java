package dio.springboot.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {

	@Value("${nome}")
	private String nome;
	@Value("${email}")
	private String email;
	@Value("${telefones}")
	private List<Long> telefones;

	public void enviarConfirmacaoCadastro() {
		System.out.println("Mensagem enviada por: " + nome + "\nE-mail:" + email + "\nCom telefones para contato: " + telefones);
		System.out.println("Seu cadastro foi aprovado");
	}

}

package dio.springboot.app;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Gson gson;
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente fincaneiro;
   public void enviarConfirmacaoCadastro(){
       System.out.println(noreply);
       System.out.println("Seu cadastro foi aprovado");
   }
    public void enviarMensagemBoasVindas(){
        fincaneiro.setEmail("tech@dio.com.br");
        System.out.println(fincaneiro);
        System.out.println("Bem-vindo à Tech Elite");
    }
}

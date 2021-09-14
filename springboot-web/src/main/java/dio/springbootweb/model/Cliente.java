package dio.springbootweb.model;

public class Cliente {
    private String cpf;
    private String nome;
    private int id=0;
    public Cliente(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente(String cpf, String nome) {
        this();
        this.nome = nome;
        this.cpf=cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

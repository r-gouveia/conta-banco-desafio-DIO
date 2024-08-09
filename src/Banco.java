import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;

    private List<Conta> contas;


    public Banco() {
        this.contas = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }



    public void exibirContas(){
        System.out.println(contas);
    }



}

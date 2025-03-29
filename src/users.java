import java.util.Scanner ;

public class users {

    String nome;
    String proficao;
    int idade;

    Scanner input = new Scanner(System.in);

    public users( int indade, String nome, String proficao) {
        this.idade = indade;
        this.nome = nome;
        this.proficao = proficao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProficao() {
        return proficao;
    }

    public void setProficao(String proficao) {
        this.proficao = proficao;
    }

}

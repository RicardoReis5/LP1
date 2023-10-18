package ClasseObjeto;

public class Sapo {
    private String nome;
    private int idade;
    private String cor;

    public Sapo(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void piruleta() {
        System.out.println(nome + " sapo é um bixo piruleta (DEU UM MORTAL PARA TRÁS)");
    }

    public void urro() {
        System.out.println(nome + " o sapo está fez o urro (TUDO ESTÁ BEM AGORA)");
    }

    public void exibirInformacoes() {
        System.out.println("Sapo chamado " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cor: " + cor);
    }
}

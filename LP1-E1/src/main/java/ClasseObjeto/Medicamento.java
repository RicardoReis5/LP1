package ClasseObjeto;

public class Medicamento {
    private String nome;
    private String principioAtivo;
    private double preco;

    public Medicamento(String nome, String principioAtivo, double preco) {
        this.nome = nome;
        this.principioAtivo = principioAtivo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Medicamento: " + nome);
        System.out.println("Princípio Ativo: " + principioAtivo);
        System.out.println("Preço: R$" + preco);
    }

    public void aplicar() {
        System.out.println("O medicamento " + nome + " foi aplicado.");
    }

    public void armazenar() {
        System.out.println("O medicamento " + nome + " foi armazenado corretamente.");
    }
}
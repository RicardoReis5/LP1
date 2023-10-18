package ClasseObjeto;

public class Biscoito {
    private String sabor;
    private double preco;
    private int quantidade;

    public Biscoito(String sabor, double preco, int quantidade) {
        this.sabor = sabor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void abrir() {
        System.out.println("Você abriu o pacote de biscoitos de " + sabor);
    }

    public void comer(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Você comeu " + quantidade + " biscoitos de " + sabor);
        } else {
            System.out.println("Não há biscoitos suficientes para comer.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Biscoito de " + sabor);
        System.out.println("Preço por unidade: R$" + preco);
        System.out.println("Quantidade restante: " + quantidade + " biscoitos");
    }
}
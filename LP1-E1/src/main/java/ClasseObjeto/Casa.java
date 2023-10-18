package ClasseObjeto;

public class Casa {
    private String endereco;
    private int numeroDeQuartos;
    private double area;

    public Casa(String endereco, int numeroDeQuartos, double area) {
        this.endereco = endereco;
        this.numeroDeQuartos = numeroDeQuartos;
        this.area = area;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroDeQuartos() {
        return numeroDeQuartos;
    }

    public void setNumeroDeQuartos(int numeroDeQuartos) {
        this.numeroDeQuartos = numeroDeQuartos;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void abrirPorta() {
        System.out.println("Você abriu a porta da casa no endereço: " + endereco);
    }

    public void calcularPreco(double valorMetroQuadrado) {
        double precoCasa = valorMetroQuadrado * area;
        System.out.println("O preço da casa é: R$" + precoCasa);
    }

    public void exibirInformacoes() {
        System.out.println("Casa no endereço: " + endereco);
        System.out.println("Número de quartos: " + numeroDeQuartos);
        System.out.println("Área: " + area + " metros quadrados");
    }
}

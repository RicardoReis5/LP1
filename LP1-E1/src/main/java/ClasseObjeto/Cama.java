package ClasseObjeto;

public class Cama {
    private String tipo;
    private double comprimento;
    private double largura;

    public Cama(String tipo, double comprimento, double largura) {
        this.tipo = tipo;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void deitar() {
        System.out.println("Você deitou na cama de " + tipo);
    }

    public void dormir() {
        System.out.println("Você está dormindo na cama de " + tipo);
    }

    public void exibirInformacoes() {
        System.out.println("Cama do tipo " + tipo);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Largura: " + largura + " cm");
    }
}
package ClasseObjeto;

public class Racao {
    private String marca;
    private String tipo;
    private double peso;

    public Racao(String marca, String tipo, double peso) {
        this.marca = marca;
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void despejar() {
        System.out.println("Você despejou a ração da marca " + marca + " no recipiente.");
    }

    public void servirPorcao(double quantidade) {
        if (peso >= quantidade) {
            peso -= quantidade;
            System.out.println("Você serviu " + quantidade + " kg de ração " + tipo);
        } else {
            System.out.println("Não há ração suficiente para servir essa quantidade.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Ração da marca " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Peso restante: " + peso + " kg");
    }
}

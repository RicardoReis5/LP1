package ClasseObjeto;

public class Eletrodomestico {
    private String marca;
    private String modelo;
    private boolean ligado;

    public Eletrodomestico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O eletrodoméstico foi ligado.");
        } else {
            System.out.println("O eletrodoméstico já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O eletrodoméstico foi desligado.");
        } else {
            System.out.println("O eletrodoméstico já está desligado.");
        }
    }

    public void status() {
        String estado = (ligado) ? "ligado" : "desligado";
        System.out.println("Eletrodoméstico: " + marca + " " + modelo + " - Estado: " + estado);
    }
}

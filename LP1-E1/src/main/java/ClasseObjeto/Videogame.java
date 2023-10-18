package ClasseObjeto;

public class Videogame {
    private String marca;
    private String modelo;
    private int armazenamento;

    public Videogame(String marca, String modelo, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
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

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        System.out.println("O videogame da marca " + marca + " modelo " + modelo + " está ligado.");
    }

    public void jogarJogo(String jogo) {
        System.out.println("Você está jogando o jogo '" + jogo + "' no videogame.");
    }

    public void exibirInformacoes() {
        System.out.println("Videogame da marca " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Armazenamento interno: " + armazenamento + " GB");
    }
}
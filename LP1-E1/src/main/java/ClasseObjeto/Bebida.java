package ClasseObjeto;

public class Bebida {
    private String nome;
    private double volume;
    private boolean alcoolica;

    public Bebida(String nome, double volume, boolean alcoolica) {
        this.nome = nome;
        this.volume = volume;
        this.alcoolica = alcoolica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }

    public void abrir() {
        System.out.println("Você abriu a bebida: " + nome);
    }

    public void beber() {
        if (alcoolica) {
            System.out.println("Você está bebendo a bebida alcoólica " + nome);
        } else {
            System.out.println("Você está bebendo a bebida não alcoólica " + nome);
        }
    }

    public void exibirInformacoes() {
        System.out.println("Bebida: " + nome);
        System.out.println("Volume: " + volume + " ml");
        System.out.println("É alcoólica? " + (alcoolica ? "Sim" : "Não"));
    }
}

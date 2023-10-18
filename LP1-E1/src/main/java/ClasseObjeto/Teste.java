package ClasseObjeto;

public class Teste {
    public static void main(String[] args) {
        Eletrodomestico geladeira = new Eletrodomestico("Brastemp", "Frost Free");
        geladeira.status();
        geladeira.ligar();
        geladeira.status();
        geladeira.desligar();
        geladeira.status();

        Medicamento aspirina = new Medicamento("Aspirina", "Ácido Acetilsalicílico", 10.99);
        aspirina.exibirInformacoes();
        aspirina.aplicar();
        aspirina.armazenar();

        Biscoito biscoitoChocolate = new Biscoito("Acerola", 2.99, 20);
        biscoitoChocolate.exibirInformacoes();
        biscoitoChocolate.abrir();
        biscoitoChocolate.comer(5);
        biscoitoChocolate.exibirInformacoes();

        Racao racaoGatos = new Racao("Golden", "Gatos", 6354.0);
        racaoGatos.exibirInformacoes();
        racaoGatos.despejar();
        racaoGatos.servirPorcao(500.5);
        racaoGatos.exibirInformacoes();

        Casa minhaCasa = new Casa("R. Tchurosbango Tchurosbago, 123", 57, 5.0);
        minhaCasa.exibirInformacoes();
        minhaCasa.abrirPorta();
        minhaCasa.calcularPreco(2000.0);

        Videogame playstation = new Videogame("Nintendo", "Switch", 825);
        playstation.exibirInformacoes();
        playstation.ligar();
        playstation.jogarJogo("GTA VI");

        Bebida cerveja = new Bebida("Caipirinha", 330, true);
        cerveja.exibirInformacoes();
        cerveja.abrir();
        cerveja.beber();

        Cama camaSolteiro = new Cama("Solteiro", 190, 90);
        camaSolteiro.exibirInformacoes();
        camaSolteiro.deitar();
        camaSolteiro.dormir();

        Sapo sapoVerde = new Sapo("Perereco", 5, "Verde");
        sapoVerde.exibirInformacoes();
        sapoVerde.piruleta();
        sapoVerde.urro();

        Filme filmeMatrix = new Filme("5 Noches com Frederico", 2023, "Markplier");
        filmeMatrix.exibirInformacoes();
        filmeMatrix.reproduzir();
        filmeMatrix.pausar();
    }
}


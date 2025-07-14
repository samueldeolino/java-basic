package iphone;

public class Main {
    public static void main(String[] args) {

        Iphone meuIphone = new Iphone();

        System.out.println("--- Testando Reprodutor Musical ---");
        meuIphone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuIphone.ligar("11-98765-4321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n--- Testando Navegador na Internet ---");
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}

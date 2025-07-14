package iphone;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando a música: "+musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: "+url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Recarregando a página!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }
}

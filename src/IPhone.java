import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    // FUNÇÕES DO APARELHO TELEFONICO
    @Override
    public void ligar() {
        System.out.println("TELEFONE REALIZANDO A LIGAÇÃO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO A LIGAÇÃO RECEBIDA");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO O CORREIO DE VOZ");
    }

    // FUNÇÕES DO REPRODUTOR MUSICAL
    @Override
    public void tocar() {
        System.out.println("REPRODUZINDO A MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO A MÚSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO A MÚSICA DESEJADA");
    }

    // FUNÇÕES DO NAVEGADOR DE INTERNET
    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO A PÁGINA DA INTERNET NO NAVEGADOR");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ABRINDO UMA NOVA ABA NO NAVEGADOR");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA DA INTERNET");
    }
}

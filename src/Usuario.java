public class Usuario {
    public static void main(String[] args) {
        IPhone celular = new IPhone();

        System.out.println("Quero ouvir uma música, mas não lembro o nome. Vou pesquisar na Internet.");
        celular.adicionarNovaAba();
        System.out.println("Pesquisando por música do meu artista preferido");
        celular.exibirPagina();
        celular.atualizarPagina();
        System.out.println("ACHEI! Agora vou abrir meu reprodutor de música e escolher ela para ouvir.");
        celular.selecionarMusica();
        celular.tocar();
        System.out.println("Lembrei que preciso pausar a música para ligar para o meu amigo.");
        celular.pausar();
        celular.ligar();
        System.out.println("Ele não está atendendo, lembrei que tinha correio de voz, vou ouvir.");
        celular.iniciarCorreioVoz();
        System.out.println("Estou recebendo ligação dele, agora podemos conversar!");
        celular.atender();
    }
}

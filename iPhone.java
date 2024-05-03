class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos das interfaces
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    public void ligar() {
        System.out.println("Chamada realizada.");
    }

    public void atender() {
        System.out.println("Chamada atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    public void exibirPagina(String url) {
        System.out.println("Página exibida: " + url);
    }

    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba adicionada: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
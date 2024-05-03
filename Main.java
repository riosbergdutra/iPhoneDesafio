public class Main {
    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone();

        // Testando os métodos
        System.out.println("--- Testando Reprodutor Musical ---");
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Nome da música");

        System.out.println("--- Testando Aparelho Telefônico ---");
        meuIPhone.ligar();
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        System.out.println("--- Testando Navegador na Internet ---");
        meuIPhone.exibirPagina("www.exemplo.com");
        meuIPhone.adicionarNovaAba("www.novaaba.com");
        meuIPhone.atualizarPagina();
    }
}
public class Iphone {

    String modelo = "Modelo Teste";
    String cor = "Azul e branco";

    private void testarConexao(){
        System.out.println("Testando conexão");
    }
    private void verificarAcao(){
        System.out.println("Verificando ação e direcionando");
    }

    public static void main(String[] args) {


        Iphone iphone = new Iphone();
        System.out.println("O modelo do Iphone é: "+ iphone.modelo);
        System.out.println("A cor dele é: "+ iphone.cor);

        iphone.verificarAcao();
        iphone.testarConexao();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar();
        telefone.iniciarCorreioDeVoz();
        telefone.atender();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.selecinarMusica();
        reprodutor.tocar();
        reprodutor.pausar();

    }

}

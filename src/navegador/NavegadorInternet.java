package navegador;

public class NavegadorInternet implements Browser {

    @Override
    public void exibirPagina(String url) {
        System.out.println("URL: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

}

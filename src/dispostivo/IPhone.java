package dispostivo;

import chamadas.Call;
import musica.Music;
import navegador.Browser;

public class IPhone implements Call, Browser, Music {

    public void ligar(String numero) {
        System.out.println("Ligar para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    
    public void iniciarCorreioVoz() {
        System.out.println("Sua chamada está indo para o correio de voz");
    }

    // =========== BROWSER ================
    public void exibirPagina(String url) {
        System.out.println("URL: " + url);
    }

    
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    // ============= MUSIC ================
    public void tocar() {
        System.out.println("Play");
    }

    public void pausar() {
        System.out.println("Pause");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Iniciando: " + musica);
    }

}

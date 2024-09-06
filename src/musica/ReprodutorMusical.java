package musica;

public class ReprodutorMusical implements Music {

    @Override
    public void tocar() {
        System.out.println("Play");
    }

    @Override
    public void pausar() {
        System.out.println("Pause");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Iniciando: " + musica);
    }

}

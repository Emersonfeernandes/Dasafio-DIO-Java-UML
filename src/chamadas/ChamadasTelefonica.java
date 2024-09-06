package chamadas;

public class ChamadasTelefonica implements Call {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligar para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Sua chamada está indo para o correio de voz");
    }

}

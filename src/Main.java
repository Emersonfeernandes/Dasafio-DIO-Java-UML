import dispostivo.IPhone;

public class Main {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        iPhone.ligar("75988557715");
        iPhone.iniciarCorreioVoz();

        
        iPhone.exibirPagina("google.com");

    }
}

import java.util.ArrayList;


public class TrabalhoPart1Jean {
    public static void main(String[] args) {
        ArrayList<Mesa> listaMesas = new ArrayList<>();

        ArrayList<Garcom> listaGarcoms = new ArrayList<>();

        Mesa mesa1 = new Mesa(1,10);

        mesa1.cadastrarMesa(listaMesas);

        Garcom pedro = new Garcom("PedrinDelas",1,"pedroteles829@gmail.com",123456789,"m",1099.00,123456);
        pedro.cadastrarGarcomNoSistema(listaGarcoms);

        pedro.relacionarMesaAoGarcom(mesa1,listaMesas);
//        pedro.relacionarMesaAoGarcom(mesa1,listaMesas);
    }
}

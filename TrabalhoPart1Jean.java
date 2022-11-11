import java.util.ArrayList;


public class TrabalhoPart1Jean {
    public static void main(String[] args) {
        ArrayList<Mesa> listaMesas = new ArrayList<>();

        ArrayList<Garcom> listaGarcoms = new ArrayList<>();

        Mesa mesa1 = new Mesa(1,10);
        Mesa mesa2 = new Mesa(2,10);

        Garcom pedro = new Garcom("PedrinDelas","1","pedroteles829@gmail.com",123456789,"m",1099.00,123456);
        Garcom teste = new Garcom("Pedrins","12","pedroteles829@gmail.com",1234567213,"m",1099.00,123456);

        mesa1.cadastrarMesa(listaMesas);
        mesa2.cadastrarMesa(listaMesas);

        pedro.cadastrarGarcomNoSistema(listaGarcoms);
        teste.cadastrarGarcomNoSistema(listaGarcoms);

        pedro.relacionarMesaAoGarcom(mesa1,listaMesas);
        pedro.relacionarMesaAoGarcom(mesa2,listaMesas);
        pedro.removeMesa(mesa2);
        teste.relacionarMesaAoGarcom(mesa2,listaMesas);

        System.out.println(pedro.getMesas().size());

    }
}

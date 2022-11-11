import java.util.ArrayList;
import java.util.Objects;

public class TrabalhoPart1Jean {
    public static void main(String[] args) {
        ArrayList<Mesa> listaMesas = new ArrayList<>();
        ArrayList<Garcom> listaGarcoms = new ArrayList<>();

        Mesa teste = new Mesa();
        teste.setNumero(1);

        Garcom testeGarcom = new Garcom();
        testeGarcom.setNome("pedro");

        listaMesas.add(teste);
        listaGarcoms.add(testeGarcom);
        relacionarMesaAoGarcom(teste,testeGarcom,listaGarcoms,listaMesas);
        relacionarMesaAoGarcom(teste,testeGarcom,listaGarcoms,listaMesas);


    }


    public static void relacionarMesaAoGarcom(
            Mesa mesa,
            Garcom garcom,
            ArrayList<Garcom> listaGarcom,
            ArrayList<Mesa> listaMesas
    ) {
        if (!listaMesas.stream().anyMatch(e -> Objects.equals(e.getNumero(),
                mesa.getNumero()))) {
            System.out.println("mesa nao valida");

        } else if ((listaGarcom.stream().anyMatch(e -> Objects.equals(e.getCpf(),
                garcom.getCpf())))) {
            for(Garcom a : listaGarcom){
                if(Objects.equals(garcom.getCpf(), a.getCpf())){
                    garcom.adicionarNovaMesa(mesa);
                    System.out.println("teste " + garcom.getNome());

                }
            }
        }
    }


}

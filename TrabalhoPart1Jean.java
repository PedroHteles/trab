import java.util.ArrayList;
import java.util.Objects;

public class TrabalhoPart1Jean {
    public static void main(String[] args) {
        ArrayList<Mesa> listaMesas = new ArrayList<>();
        ArrayList<Garcom> listaGarcoms = new ArrayList<>();
    }


    public  static void relacionarMesaAoGarcom(
            int numeroDaMesa,
            Garcom garcom,
            ArrayList<Garcom> listaGarcom,
            ArrayList<Mesa> listaMesas
    ) {
        if (!listaMesas.stream().anyMatch(e -> Objects.equals(e.getNumero(),numeroDaMesa))) {
            System.out.println("mesa nao valida");
        } else {
            for (Garcom g : listaGarcom) {
                if (Objects.equals(g.getCpf(), garcom.getCpf())) {
                    System.out.println("teste");
                }
            }
        }
    }


}

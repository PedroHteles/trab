import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Mesa {

    private Integer numero;
    private  Integer capacidadeMaximaClientes;
    private Garcom garcom;

    public Mesa(final Integer numero, final Integer capacidadeMaximaClientes) {
        this.numero = numero;
        this.capacidadeMaximaClientes = capacidadeMaximaClientes;
    }

    public Garcom getGarcom() {return garcom;}
    public Integer getNumero() {return this.numero;}
    public Integer getCapacidadeMaximaClientes() {
        return capacidadeMaximaClientes;
    }

    public void cadastrarMesa(ArrayList<Mesa> listaDeMesas){
        if(listaDeMesas != null){
           if(listaDeMesas.stream().filter(e -> Objects.equals(e, this)).collect(Collectors.toList()).size() == 0){
                listaDeMesas.add(this);
           }else{
               System.out.println("mesa ja registrada");
           }
        }
    }
    public boolean validarMesa(ArrayList<Mesa> listaMesasCadastradas) {
        return listaMesasCadastradas.stream().anyMatch(e -> Objects.equals(e.getNumero(), this.numero));
    }
    public boolean verificarSeMesaEstaDisponivel(){ return this.garcom == null;}
    public void setGarcom(Garcom garcom) {this.garcom = garcom;}
    public void removeGarcom() {this.garcom = null;}
}

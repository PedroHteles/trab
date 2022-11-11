import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Garcom {

    private String nome;
    private String cpf;
    private String email;
    private Integer telefone;
    private Double salarioFixo;
    private Integer dataNascimento;
    private ArrayList<Mesa> mesas = new ArrayList<>();

    public Garcom(
            String nome,
            String cpf,
            String email,
            Integer telefone,
            String sexo,
            Double salarioFixo,
            Integer dataNascimento
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.salarioFixo = salarioFixo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
    public ArrayList<Mesa> quantidadeDeMesasAtual(){return this.mesas;}

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }


    public Double getSalarioFixo() {
        return this.salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Integer getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Integer dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Mesa> getMesas() {
        return this.mesas;
    }

//    public void relacionarMesaAoGarcom(
//            Mesa mesa,
//            ArrayList<Mesa> listaMesasCadastradas
//    ) {
//        if(mesa.validarMesa(listaMesasCadastradas)) {
//            if(mesa.verificarSeMesaEstaDisponivel()){
//                mesa.setGarcom(this);
//                if(this.mesas.size() == 0){
//                    ArrayList<Mesa> listames = new ArrayList<>();
//                    listames.add(mesa);
//                    this.mesas = listames;
//                }else{
//                    this.mesas.add(mesa);
//                }
//            }else{System.out.println("mesa: " + mesa.getNumero() + " ja foi registrada pelo garcom: " + mesa.getGarcom().getNome());}
//        } else System.out.println("Mesa nao cadastrada no sistema");
//    }


//    public  void cadastrarGarcomNoSistema(ArrayList<Garcom> listG){
//        if(listG != null){
//            if(listG.stream().filter(e -> Objects.equals(e, this)).collect(Collectors.toList()).size() == 0){
//                listG.add(this);
//            }else{
//                System.out.println("Garcom ja registrado");
//            }
//        }
//    }
//    public void  removeMesa(Mesa mesa){
//        mesa.removeGarcom();
//        this.mesas.remove(mesa);
//    }


}

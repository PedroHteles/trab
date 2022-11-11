import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Garcom {

    private String nome;
    private Integer cpf;
    private String email;
    private Integer telefone;
    private String Sexo;
    private Double salarioFixo;
    private Integer dataNascimento;
    private ArrayList<Mesa> mesas;

    public Garcom(
            String nome,
            Integer cpf,
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
        this.Sexo = sexo;
        this.salarioFixo = salarioFixo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void relacionarMesaAoGarcom(
            Mesa mesa,
            ArrayList<Mesa> listaMesasCadastradas
    ) {
        if(mesa.validarMesa(listaMesasCadastradas)) {
            if(mesa.verificarSeMesaEstaDisponivel()){
                mesa.setGarcom(this);
                if(this.mesas == null){
                    ArrayList<Mesa> listames = new ArrayList<>();
                    listames.add(mesa);
                    this.mesas = listames;
                }
            }else{System.out.println("mesa: " + mesa.getNumero() + " ja foi registrada pelo garcom: " + mesa.getGarcom().getNome());}
        } else System.out.println("Mesa nao cadastrada no sistema");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Integer getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Integer dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }

    public ArrayList<Mesa> quantidadeDeMesasAtual(){return this.mesas;}
    public  void cadastrarGarcomNoSistema(ArrayList<Garcom> listG){
        if(listG != null){
            if(listG.stream().filter(e -> Objects.equals(e, this)).collect(Collectors.toList()).size() == 0){
                listG.add(this);
            }else{
                System.out.println("Garcom ja registrado");
            }
        }
    }
    public void  removeMesa(Mesa mesa){
       this.mesas = (ArrayList<Mesa>) this.mesas.stream().filter(e -> e != mesa).collect(Collectors.toList());
    }
    public void setMesa(Mesa mesa) {

    }
}

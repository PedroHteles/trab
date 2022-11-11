import java.util.ArrayList;

public class Garcom {

    private String nome;
    private Integer cpf;
    private String email;
    private Integer telefone;
    private String Sexo;
    private float salarioFixo;
    private Integer dataNascimento;
    private ArrayList<Mesa> mesas = new ArrayList<>();

    public  Garcom(){

    }


    public Garcom(
            String nome,
            Integer cpf,
            String email,
            Integer telefone,
            String sexo,
            float salarioFixo,
            Integer dataNascimento,
            ArrayList<Mesa> mesas
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        Sexo = sexo;
        this.salarioFixo = salarioFixo;
        this.dataNascimento = dataNascimento;
        this.mesas = mesas;
    }

    public String getNome() {
        return nome;
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

    public float getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(float salarioFixo) {
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

    public void adicionarNovaMesa(Mesa mesa){
        this.mesas.add(mesa);
    }
}

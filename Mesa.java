public class Mesa {

    private Integer numero;
    private  Integer capacidadeMaximaClientes;
    private Garcom garcom;

    public  Mesa(){

    }

    public Mesa(Integer numero, Integer capacidadeMaximaClientes) {
        this.numero = numero;
        this.capacidadeMaximaClientes = capacidadeMaximaClientes;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidadeMaximaClientes() {
        return capacidadeMaximaClientes;
    }

    public void setCapacidadeMaximaClientes(Integer capacidadeMaximaClientes) {
        this.capacidadeMaximaClientes = capacidadeMaximaClientes;
    }
}

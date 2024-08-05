public class Carro {
    private String placa;
    private String modelo;
    private Cliente dono;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public Carro(String placa, String modelo, Cliente dono) {
        this.placa = placa;
        this.modelo = modelo;
        this.dono = dono;
    }


}

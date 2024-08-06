import java.util.Date;

public class Servico {
    private Cliente cliente;
    private Funcionario funcionario;


    private Carro carro;
    private double preco;
    private String descricao;
    public Servico(Cliente cliente, Funcionario funcionario, Carro carro, double preco, String descricao) {
        this.cliente = cliente;
        this.carro = carro;
        this.preco = preco;
        this.funcionario = funcionario;
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

}

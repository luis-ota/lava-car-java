import java.util.Date;

public class Servico {
    private Cliente cliente;
    private double preco;
    private Date dataInicio;
    private Date dataFim;
    private Funcionario funcionario;
    private String descricao;
    public double valorHora = 20.0;

    public Servico(Cliente cliente, double preco, Date dataInicio, Date dataFim, Funcionario funcionario, String descricao) {
        this.cliente = cliente;
        this.preco = preco;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
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
}

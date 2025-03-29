import java.math.BigDecimal;
import java.util.ArrayList;
public class Carteiraa {

    private BigDecimal saldo  = BigDecimal.ZERO;
    private BigDecimal salario = BigDecimal.ZERO;
    private BigDecimal valorCashBack = BigDecimal.ZERO;
    private BigDecimal movimentacaoDeAdicao = BigDecimal.ZERO;
    private BigDecimal movimentacaoDeSaidas = BigDecimal.ZERO;
    private ArrayList<BigDecimal> movimentacoesPositivas = new ArrayList<>();
    private ArrayList<BigDecimal> movimentacoesNegativas = new ArrayList<>();




    //gets


    public BigDecimal getMovimentacaoDeAdicao() {
        return movimentacaoDeAdicao;
    }

    public BigDecimal getMovimentacaoDeSaidas() {
        return movimentacaoDeSaidas;
    }

    public ArrayList<BigDecimal> getMovimentacoesNegativas() {
        return movimentacoesNegativas;
    }

    public ArrayList<BigDecimal> getMovimentacoesPositivas() {
        return movimentacoesPositivas;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public   BigDecimal getSaldo() {

        return saldo;
    }
// seters


    public void setMovimentacaoDeAdicao(BigDecimal movimentacaoDeAdicao) {
        this.movimentacaoDeAdicao = movimentacaoDeAdicao;
    }

    public void setMovimentacaoDeSaidas(BigDecimal movimentacaoDeSaidas) {
        this.movimentacaoDeSaidas = movimentacaoDeSaidas;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setMovimentacoesNegativas(ArrayList<BigDecimal> movimentacoesNegativas) {
        this.movimentacoesNegativas = movimentacoesNegativas;
    }

    public void setMovimentacoesPositivas(ArrayList<BigDecimal> movimentacoesPositivas) {
        this.movimentacoesPositivas = movimentacoesPositivas;
    }

}

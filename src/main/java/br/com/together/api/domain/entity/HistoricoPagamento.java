package br.com.together.api.domain.entity;

import java.time.LocalDate;
import java.util.Objects;

public class HistoricoPagamento {

    private Double valorCobrado;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private String observacao;

    public HistoricoPagamento(Double valorCobrado, LocalDate dataVencimento) {
        this.valorCobrado = valorCobrado;
        this.dataVencimento = dataVencimento;
    }

    /**
     * @return Retorna o atributo valorCobrado
     */
    public Double getValorCobrado() {
        return valorCobrado;
    }

    /**
     * @param valorCobrado Atribui o valor do parâmetro no atributo valorCobrado
     */
    public void setValorCobrado(Double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    /**
     * @return Retorna o atributo dataVencimento
     */
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    /**
     * @param dataVencimento Atribui o valor do parâmetro no atributo dataVencimento
     */
    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /**
     * @return Retorna o atributo dataPagamento
     */
    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    /**
     * @param dataPagamento Atribui o valor do parâmetro no atributo dataPagamento
     */
    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    /**
     * @return Retorna o atributo observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao Atribui o valor do parâmetro no atributo observacao
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoricoPagamento that = (HistoricoPagamento) o;
        return valorCobrado.equals(that.valorCobrado) &&
                dataVencimento.equals(that.dataVencimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valorCobrado, dataVencimento);
    }

    @Override
    public String toString() {
        return "HistoricoPagamento{" +
                "valorCobrado=" + valorCobrado +
                ", dataVencimento=" + dataVencimento +
                '}';
    }
}

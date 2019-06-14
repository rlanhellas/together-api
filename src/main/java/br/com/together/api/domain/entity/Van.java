package br.com.together.api.domain.entity;

import br.com.together.api.domain.enums.SituacaoVan;
import br.com.together.api.domain.valueobject.Contato;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Van {

    private String placa;
    private LocalDateTime dataHoraCriacao;
    private SituacaoVan situacaoVan;
    private LocalDateTime dataAtualizacaoSituacao;
    private Contato contato;
    private Usuario usuario;
    private List<HistoricoPagamento> pagamentos;

    public Van(String placa, Contato contato, Usuario usuario) {
        this.placa = placa;
        this.contato = contato;
        this.usuario = usuario;
        this.pagamentos = new ArrayList<>();
        this.dataHoraCriacao = LocalDateTime.now();
        this.situacaoVan = SituacaoVan.ATIVO;
    }

    public void adicionarPagamento(HistoricoPagamento pagamento) {
        this.pagamentos.add(pagamento);
    }

    public void removerPagamento(HistoricoPagamento pagamento) {
        this.pagamentos.remove(pagamento);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public SituacaoVan getSituacaoVan() {
        return situacaoVan;
    }

    public void setSituacaoVan(SituacaoVan situacaoVan) {
        this.situacaoVan = situacaoVan;
    }

    public LocalDateTime getDataAtualizacaoSituacao() {
        return dataAtualizacaoSituacao;
    }

    public void setDataAtualizacaoSituacao(LocalDateTime dataAtualizacaoSituacao) {
        this.dataAtualizacaoSituacao = dataAtualizacaoSituacao;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<HistoricoPagamento> getPagamentos() {
        return pagamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Van van = (Van) o;
        return placa.equals(van.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    @Override
    public String toString() {
        return "Van{" +
                "placa='" + placa + '\'' +
                '}';
    }
}

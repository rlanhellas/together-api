package br.com.together.api.usecase.model;

import java.util.Objects;

public class TelefoneDto {
    private Integer ddd;
    private String numero;
    private String operadora;

    public TelefoneDto(Integer ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelefoneDto that = (TelefoneDto) o;
        return ddd.equals(that.ddd) &&
                numero.equals(that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ddd, numero);
    }
}

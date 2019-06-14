package br.com.together.api.domain.valueobject;

import java.util.Objects;

public class Telefone {

    public Telefone(Integer ddd, String telefone) {
        this.ddd = ddd;
        this.telefone = telefone;
    }

    private Integer ddd;
    private String telefone;
    private String operadora;

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
        Telefone telefone1 = (Telefone) o;
        return ddd.equals(telefone1.ddd) &&
                telefone.equals(telefone1.telefone) &&
                Objects.equals(operadora, telefone1.operadora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ddd, telefone, operadora);
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "ddd=" + ddd +
                ", telefone='" + telefone + '\'' +
                ", operadora='" + operadora + '\'' +
                '}';
    }
}

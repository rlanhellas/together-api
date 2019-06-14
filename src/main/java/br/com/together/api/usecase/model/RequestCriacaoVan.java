package br.com.together.api.usecase.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RequestCriacaoVan {
    private String placa;
    private String nomeContato;
    private String email;
    private Set<TelefoneDto> telefones;

    public RequestCriacaoVan(String placa, String nomeContato, String email) {
        this.placa = placa;
        this.nomeContato = nomeContato;
        this.email = email;
        this.telefones = new HashSet<>();
    }

    public void adicionarTelefone(TelefoneDto telefoneDto) {
        this.telefones.add(telefoneDto);
    }

    public void removerTelefone(TelefoneDto telefoneDto) {
        this.telefones.remove(telefoneDto);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<TelefoneDto> getTelefones() {
        return telefones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestCriacaoVan that = (RequestCriacaoVan) o;
        return placa.equals(that.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    @Override
    public String toString() {
        return "RequestCriacaoVan{" +
                "placa='" + placa + '\'' +
                '}';
    }
}

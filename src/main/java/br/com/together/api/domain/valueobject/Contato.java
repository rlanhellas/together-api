package br.com.together.api.domain.valueobject;

import java.util.HashSet;
import java.util.Set;

public class Contato {
    private String nome;
    private Set<Telefone> telefones;
    private String email;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.telefones = new HashSet<>();
    }

    public void adicionarTelefone(Telefone telefone){
        telefones.add(telefone);
    }

    public void removerTelefone(Telefone telefone){
        telefones.remove(telefone);
    }

    /**
     * @return Retorna o atributo nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome Atribui o valor do parâmetro no atributo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Retorna o atributo telefones
     */
    public Set<Telefone> getTelefones() {
        return telefones;
    }

    /**
     * @return Retorna o atributo email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email Atribui o valor do parâmetro no atributo email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}

package br.com.together.api.domain.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Usuario {

    private String login;
    private String senha;
    private String email;
    private LocalDateTime ultimoAcesso;
    private LocalDateTime dataHoraCriacao;
    private Boolean ativo;

    public Usuario(String login, String senha, String email) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.dataHoraCriacao = LocalDateTime.now();
        this.ativo = Boolean.FALSE;
    }

    /**
     * @return Retorna o atributo login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login Atribui o valor do parâmetro no atributo login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return Retorna o atributo senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha Atribui o valor do parâmetro no atributo senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
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

    /**
     * @return Retorna o atributo ultimoAcesso
     */
    public LocalDateTime getUltimoAcesso() {
        return ultimoAcesso;
    }

    /**
     * @param ultimoAcesso Atribui o valor do parâmetro no atributo ultimoAcesso
     */
    public void setUltimoAcesso(LocalDateTime ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    /**
     * @return Retorna o atributo dataHoraCriacao
     */
    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    /**
     * @param dataHoraCriacao Atribui o valor do parâmetro no atributo dataHoraCriacao
     */
    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    /**
     * @return Retorna o atributo ativo
     */
    public Boolean getAtivo() {
        return ativo;
    }

    /**
     * @param ativo Atribui o valor do parâmetro no atributo ativo
     */
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return login.equals(usuario.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}

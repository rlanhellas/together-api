package br.com.together.api.domain.enums;

public enum SituacaoVan {
    ATIVO("Ativo"), INATIVO("Inativo"), EM_DEBITO("Em débito");

    private String descricao;

    SituacaoVan(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return Retorna o atributo descricao
     */
    public String getDescricao() {
        return descricao;
    }
}

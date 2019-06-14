package br.com.together.api.usecase;

import br.com.together.api.domain.entity.Usuario;
import br.com.together.api.domain.entity.Van;
import br.com.together.api.domain.valueobject.Contato;
import br.com.together.api.usecase.model.RequestCriacaoVan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CriarVanUseCase {

    private Logger logger = LoggerFactory.getLogger(CriarVanUseCase.class);

    public void executar(RequestCriacaoVan requestCriacaoVan) {
        logger.info("Iniciando criação da Van.", requestCriacaoVan);
        Contato contato = new Contato(requestCriacaoVan.getNomeContato(), requestCriacaoVan.getEmail());
        Usuario usuario = new Usuario(requestCriacaoVan.getPlaca(), requestCriacaoVan.getEmail(), "123");
        Van van = new Van(requestCriacaoVan.getPlaca(), contato, usuario);
        logger.info("Van criada " + van.getPlaca(), van);
    }

    private void enviarEmailContaCriada(Van van) {
        logger.info("Preparando o envio do e-mail para "+van.getContato().getEmail());
    }
}

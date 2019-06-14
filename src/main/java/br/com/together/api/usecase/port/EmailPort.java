package br.com.together.api.usecase.port;

public interface EmailPort {
    void enviarEmail(String destino, String assunto, String mensagem);
}

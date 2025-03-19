package org.example;

public class ServicoBancoFactory {

    public static IServicoBanco obterServicoBanco(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.ServicoBanco" + servico);
            objeto = classe.newInstance();
        } catch (Exception exception) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IServicoBanco)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServicoBanco) objeto;
    }
}

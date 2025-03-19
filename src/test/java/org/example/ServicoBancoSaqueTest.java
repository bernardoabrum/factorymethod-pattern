package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoBancoSaqueTest {

    @Test
    void deveExecutarSaque() {
        IServicoBanco servico = ServicoBancoFactory.obterServicoBanco("Saque");
        assertEquals("Saque realizado", servico.executar());
    }

    @Test
    void deveCancelarSaque() {
        IServicoBanco servico = ServicoBancoFactory.obterServicoBanco("Saque");
        assertEquals("Saque cancelado", servico.cancelar());
    }
}

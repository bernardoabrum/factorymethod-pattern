package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoBancoDepositoTest {

    @Test
    void deveExecutarDeposito() {
        IServicoBanco servico = ServicoBancoFactory.obterServicoBanco("Deposito");
        assertEquals("Depósito realizado", servico.executar());
    }

    @Test
    void deveCancelarDeposito() {
        IServicoBanco servico = ServicoBancoFactory.obterServicoBanco("Deposito");
        assertEquals("Depósito cancelado", servico.cancelar());
    }
}

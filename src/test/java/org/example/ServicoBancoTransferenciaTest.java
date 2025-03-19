package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoBancoTransferenciaTest {

    @Test
    void deveExecutarTransferencia() {
        IServicoBanco servico = ServicoBancoFactory.obterServicoBanco("Transferencia");
        assertEquals("Transferência realizada", servico.executar());
    }

    @Test
    void deveCancelarTransferencia() {
        IServicoBanco servico = ServicoBancoFactory.obterServicoBanco("Transferencia");
        assertEquals("Transferência cancelada", servico.cancelar());
    }
}

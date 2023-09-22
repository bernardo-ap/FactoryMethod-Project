package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoEURTest {
    @Test
    void deveExecutarCompra() {
        IServico servico = ServicoFactory.obterServico("EUR");
        assertEquals("Moeda EUR comprada!", servico.comprar());
    }

    @Test
    void deveExecutarVenda() {
        IServico servico = ServicoFactory.obterServico("EUR");
        assertEquals("Moeda EUR vendida!", servico.vender());
    }

}
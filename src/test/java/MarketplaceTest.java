import br.ufjf.command.EncerrarVendasTarefa;
import br.ufjf.command.IniciarVendasTarefa;
import br.ufjf.interfaces.Tarefa;
import br.ufjf.model.Marketplace;
import br.ufjf.model.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarketplaceTest {

    private Marketplace marketplace;
    private Produto produto;

    @BeforeEach
    public void setUp() {
        marketplace = new Marketplace();
        produto = new Produto("Bio Whey Protein 909g Performance");
    }

    @Test
    public void iniciarVendasTest() {
        Tarefa iniciarVendasTarefa = new IniciarVendasTarefa(produto);
        marketplace.executarTarefa(iniciarVendasTarefa);

        assertEquals("Produto disponível para venda.", produto.getDisponibilidade());
    }

    @Test
    public void encerrarVendasTest() {
        Tarefa encerrarVendasTarefa = new EncerrarVendasTarefa(produto);
        marketplace.executarTarefa(encerrarVendasTarefa);

        assertEquals("Produto indisponível.", produto.getDisponibilidade());
    }

}

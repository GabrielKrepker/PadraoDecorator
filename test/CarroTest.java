import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    public void deveCriarCarroBasico() {

        ICarro carro = new CarroBasico(10000);

        assertEquals(10000, carro.getPreco());
        assertEquals("Carro básico", carro.getDescricao());
    }

    @Test
    public void deveAdicionarTurbo() {

        ICarro carro = new CarroBasico(10000);
        carro = new Turbo(carro);

        assertEquals(12000, carro.getPreco());
        assertEquals("Carro básico / Turbo", carro.getDescricao());
    }

    @Test
    public void deveAdicionarNitro() {

        ICarro carro = new CarroBasico(10000);
        carro = new Nitro(carro);

        assertEquals(11500, carro.getPreco());
        assertEquals("Carro básico / Nitro", carro.getDescricao());
    }

    @Test
    public void deveAdicionarBlindagem() {

        ICarro carro = new CarroBasico(10000);
        carro = new Blindagem(carro);

        assertEquals(12500, carro.getPreco());
        assertEquals("Carro básico / Blindagem", carro.getDescricao());
    }

    @Test
    public void deveAdicionarSom() {

        ICarro carro = new CarroBasico(10000);
        carro = new Som(carro);

        assertEquals(11000, carro.getPreco());
        assertEquals("Carro básico / Som", carro.getDescricao());
    }

    @Test
    public void deveAdicionarMultiplosItens() {

        ICarro carro = new CarroBasico(10000);

        carro = new Turbo(carro);
        carro = new Nitro(carro);
        carro = new Som(carro);

        // cálculo: 10000 → +20% → +15% → +10%
        assertEquals(15180, carro.getPreco());
        assertEquals("Carro básico / Turbo / Nitro / Som", carro.getDescricao());
    }
}
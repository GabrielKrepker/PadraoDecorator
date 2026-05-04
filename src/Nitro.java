public class Nitro extends CarroDecorator {

    public Nitro(ICarro carro) {
        super(carro);
    }

    public float getPercentualPreco() {
        return 15.0f;
    }

    public String getNomeAdicional() {
        return "Nitro";
    }
}
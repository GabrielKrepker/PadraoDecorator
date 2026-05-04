public class Turbo extends CarroDecorator {

    public Turbo(ICarro carro) {
        super(carro);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeAdicional() {
        return "Turbo";
    }
}
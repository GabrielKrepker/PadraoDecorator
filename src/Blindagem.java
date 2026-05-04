public class Blindagem extends CarroDecorator {

    public Blindagem(ICarro carro) {
        super(carro);
    }

    public float getPercentualPreco() {
        return 25.0f;
    }

    public String getNomeAdicional() {
        return "Blindagem";
    }
}
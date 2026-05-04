public abstract class CarroDecorator implements ICarro {

    private ICarro carro;

    public CarroDecorator(ICarro carro) {
        this.carro = carro;
    }

    public ICarro getCarro() {
        return carro;
    }

    public abstract float getPercentualPreco();
    public abstract String getNomeAdicional();

    public float getPreco() {
        return this.carro.getPreco() * (1 + (this.getPercentualPreco() / 100));
    }

    public String getDescricao() {
        return this.carro.getDescricao() + " / " + this.getNomeAdicional();
    }
}
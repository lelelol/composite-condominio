package composite;

public class Apartamento extends Espaco {

    private int metragem;

    public Apartamento(String descricao, int metragem) {
        super(descricao);
        this.metragem = metragem;
    }

    public int getMetragem() {
        return metragem;
    }

    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }

    public String getEstrutura() {
        return "Apartamento: " + this.getDescricao() + " - metragem: " + this.metragem + "\n";
    }

}

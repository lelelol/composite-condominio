package composite;

public class Condominio {

    private Espaco estrutura;

    public void setEstrutura(Espaco estrutura) {
        this.estrutura = estrutura;
    }

    public String getEstrutura() {
        if (this.estrutura == null) {
            throw new NullPointerException("Condomínio sem estrutura");
        }
        return this.estrutura.getEstrutura();
    }
}

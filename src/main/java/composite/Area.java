package composite;

import java.util.ArrayList;
import java.util.List;

public class Area extends Espaco {

    private List<Espaco> espacos;

    public Area(String descricao) {
        super(descricao);
        this.espacos = new ArrayList<Espaco>();
    }

    public void addEspaco(Espaco espaco) {
        this.espacos.add(espaco);
    }

    public String getEstrutura() {
        String saida = "";
        saida = "Área: " + this.getDescricao() + "\n";
        for (Espaco espaco : espacos) {
            saida += espaco.getEstrutura();
        }
        return saida;
    }
}

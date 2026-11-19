package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CondominioTest {

    @Test
    void deveRetornarEstruturaCondominio() {
        Area area1 = new Area("Área de Lazer");

        Area area2 = new Area("Torre A");
        Apartamento apartamento21 = new Apartamento("101", 60);
        area2.addEspaco(apartamento21);

        Area area3 = new Area("Torre B");
        Apartamento apartamento31 = new Apartamento("201", 70);
        Apartamento apartamento32 = new Apartamento("202", 80);
        area3.addEspaco(apartamento31);
        area3.addEspaco(apartamento32);

        Area estrutura = new Area("Residencial Jardim");
        estrutura.addEspaco(area1);
        estrutura.addEspaco(area2);
        estrutura.addEspaco(area3);

        Condominio condominio = new Condominio();
        condominio.setEstrutura(estrutura);

        assertEquals("Área: Residencial Jardim\n" +
                "Área: Área de Lazer\n" +
                "Área: Torre A\n" +
                "Apartamento: 101 - metragem: 60\n" +
                "Área: Torre B\n" +
                "Apartamento: 201 - metragem: 70\n" +
                "Apartamento: 202 - metragem: 80\n", condominio.getEstrutura());
    }

    @Test
    void deveRetornarExcecaoCondominioSemEstrutura() {
        try {
            Condominio condominio = new Condominio();
            condominio.getEstrutura();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Condomínio sem estrutura", e.getMessage());
        }
    }
}

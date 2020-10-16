
package br.com.rogerio.model;

import br.com.rogerio.interfaces.InterfaceImovel;

public class FactoryImovel {

    private static FactoryImovel instance = null;

    private FactoryImovel() {
    }

    public static FactoryImovel getInstance() {
        if (instance == null) {
            instance = new FactoryImovel();
        }
        return instance;
    }

    public InterfaceImovel getImovel(String imovel) throws Exception {

        InterfaceImovel objeto = null;
        if (imovel.equalsIgnoreCase("Sobrado")) {
            objeto = new Sobrado();
        } else if (imovel.equalsIgnoreCase("Apartamento")) {
            objeto = new Apartamento();
        } else if (imovel.equalsIgnoreCase("AreaDeLazer")) {
            objeto = new AreaDeLazer();
        } else {
            throw new Exception("O imóvel selecionado ainda está em projeto!\n");
        }
        return objeto;
    }

    public String entregarImovel(InterfaceImovel objeto) {
        return objeto.adquirirImovel();
    }
}

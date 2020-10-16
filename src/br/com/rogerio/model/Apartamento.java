/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.model;

import br.com.rogerio.interfaces.InterfaceImovel;

public class Apartamento implements InterfaceImovel {

    private double areaConstruida;
    private int quantQuartos;
    private int suite;
    private int quantCarrosNaGaragem;
    private boolean piscina;
    private int quantBanheiros;

    public Apartamento() {
         this.areaConstruida = 150;
        this.quantQuartos = 3;
        this.suite = 1;
        this.quantCarrosNaGaragem = 2;
        this.piscina = false;
        this.quantBanheiros = 2;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public int getQuantQuartos() {
        return quantQuartos;
    }

    public int getSuite() {
        return suite;
    }

    public int getQuantCarrosNaGaragem() {
        return quantCarrosNaGaragem;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public int getQuantBanheiros() {
        return quantBanheiros;
    }

    @Override
    public String adquirirImovel() {
        String saida = "---------- Informações do imóvel adquirido ----------\n"
                + "Área construída: " + areaConstruida + "\n"
                + "Quantidade de Quartos: " + quantQuartos + "\n"
                + "Quantidade de Suites: " + suite + "\n"
                + "Quantidade de carros na garagem: " + quantCarrosNaGaragem + "\n"
                + "Tem piscina: " + piscina + "\n"
                + "Quantidade de banheiros: " + quantBanheiros + "\n";

        return saida;
    }

}

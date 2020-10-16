/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.model;

import br.com.rogerio.interfaces.InterfaceImovel;

public class AreaDeLazer implements InterfaceImovel {

    private double areaConstruida;
    private int quantQuartos;
    private int suite;
    private int quantCarrosNaGaragem;
    private boolean piscina;
    private int quantBanheiros;

    public AreaDeLazer() {
         this.areaConstruida = 200;
        this.quantQuartos = 2;
        this.suite = 2;
        this.quantCarrosNaGaragem = 5;
        this.piscina = true;
        this.quantBanheiros = 3;
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

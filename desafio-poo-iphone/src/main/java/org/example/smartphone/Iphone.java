package org.example.smartphone;

import org.example.funcionalidades.multifuncional.MultiFuncional;

public class Iphone {
    public static void main(String[] args) {

        MultiFuncional iphone1 = new MultiFuncional();
        iphone1.iniciarCorreioVoz();
        iphone1.ligar("+55 99999-9090");
        iphone1.atender();
        iphone1.exibirPagina("Youtube");
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();
        iphone1.tocar();
        iphone1.pausar();
        iphone1.selecionarMusica("Ride On Time");

    }
}

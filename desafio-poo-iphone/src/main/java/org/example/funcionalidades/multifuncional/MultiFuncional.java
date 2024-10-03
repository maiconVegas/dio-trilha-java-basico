package org.example.funcionalidades.multifuncional;

import org.example.funcionalidades.aparelhotelefonico.AparelhoTelefonico;
import org.example.funcionalidades.navegadorinternet.NavegadorInternet;
import org.example.funcionalidades.reprodutormusical.ReprodutorMusical;

public class MultiFuncional implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para..." + numero);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Pagina..." + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica..." + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica..." );
    }
}

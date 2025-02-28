package br.com.gomide.main;

import br.com.gomide.Carro;

public class Main {
  public static void main(String[] args) {
    Carro meuCarro = new Carro();

    meuCarro.marca = "Ford";
    meuCarro.modelo = "Fusion";
    meuCarro.cor = "Preto";
    meuCarro.velocidade = 0;

    meuCarro.mostrarDetalhes();

    meuCarro.acelerar(10);
    meuCarro.mostrarDetalhes();

    meuCarro.frear(5);
    meuCarro.mostrarDetalhes();
  }
}

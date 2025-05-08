package br.edu.ifgoiano.heranca.exercicio05;

import java.util.Date;

public class ProdutoAlimenticio extends Produto {
  // Atributos
  private Date dataValidade;

  // Construtores
  public ProdutoAlimenticio() {
    super();
    this.dataValidade = new Date();
  }

  public ProdutoAlimenticio(int codigo, String nome, double preco, Date dataValidade) {
    super(codigo, nome, preco);
    this.dataValidade = dataValidade;
  }

  // Métodos
  public boolean verificarVencimento() {
    return dataValidade.before(new Date());
  }

  public void imprimirInformacoes() {
    super.imprimirInformacoes();
    System.out.println("Data de validade: " + this.dataValidade);
  }

  // Getters e Setters
  public Date getDataValidade() {
    return dataValidade;
  }

  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

}

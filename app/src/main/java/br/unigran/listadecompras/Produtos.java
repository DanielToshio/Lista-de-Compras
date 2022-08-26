package br.unigran.listadecompras;

public class Produtos {

    private String produto;
    private String marca;
    private String quantidade;

    public String getProduto() {return produto;}
    public void setProduto(String produto){this.produto = produto;}

    public String getMarca() {return marca;}
    public void setMarca(String marca){this.marca = marca;}

    public String getQuantidade() {return quantidade;}
    public void setQuantidade(String quantidade){this.quantidade = quantidade;}


    @Override
    public String toString()
    {
        return "Produto: "+produto+" |marca: "+marca+" | quantidade: "+quantidade;
    }
}


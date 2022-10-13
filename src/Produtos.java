/*Cria uma classe Produto contendo nome, código, marca e preço.
Depois crie outra classe chamada CarrinhoDeCompra contendo código,
dois produtos e o valor a ser pago. Implemente, por fim, a classe principal Compra
onde você deve criar dois produtos, depois criar um carrinho e associar os dois produtos a ele e,
por último, exibir o valor total a ser pago.*/


public class Produtos {
    private String nome;
    private String marca;
    private int codigo;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

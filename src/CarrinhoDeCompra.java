public class CarrinhoDeCompra {

    double valor;

    Produtos p1 = new Produtos();
    Produtos p2 = new Produtos();

    public double valorPago(){
        this.valor = p1.getPreco() + p2.getPreco();
        return valor;
    }

    public String toString() {
        return "Você comprou " + p1.getNome() + " e " + p2.getNome() + ". O valor total das suas compras foi de: R$" + valorPago();
    }
}


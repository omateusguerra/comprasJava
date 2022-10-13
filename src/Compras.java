public class Compras {
    public static void main(String[] args) {

        CarrinhoDeCompra c1 = new CarrinhoDeCompra();
        c1.p1.setNome("Picanha");
            c1.p1.setCodigo(01);
            c1.p1.setMarca("Friboi");
            c1.p1.setPreco(72.90);
        c1.p2.setNome("Leite Condensado");
            c1.p2.setCodigo(02);
            c1.p2.setMarca("Moça");
            c1.p2.setPreco(12.90);

        System.out.println(c1.toString());

    }


}

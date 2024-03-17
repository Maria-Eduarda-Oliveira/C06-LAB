public class AppCarrinho {
    public static void main(String[] args){

        Carrinho carrinho = new Carrinho();

        ProdutoCarrinho p1 = new ProdutoCarrinho();
        p1.nome = "Pão";
        p1.descricao = "Pão integral";
        p1.fabricante = "Padeiro";
        p1.preco = 5.5;

        ProdutoCarrinho p2 = new ProdutoCarrinho();
        p2.nome = "Carne";
        p2.descricao = "Carne de vaca";
        p2.fabricante = "Açogueiro";
        p2.preco = 15.9;

        ProdutoCarrinho p3 = new ProdutoCarrinho();
        p3.nome = "Queijo";
        p3.descricao = "Queijo de búfalo";
        p3.fabricante = "Cooper Rita";
        p3.preco = 9.2;

        carrinho.addProduto(p1);
        carrinho.addProduto(p2);
        carrinho.addProduto(p3);

        carrinho.exibirInfo();
        System.out.println(carrinho.calculaTotal());
    }
}

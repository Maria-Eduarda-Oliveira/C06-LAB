public class Carrinho{
    double total;
    ProdutoCarrinho[] produtos = new ProdutoCarrinho[3];

    void addProduto(ProdutoCarrinho novoProduto){
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = novoProduto;
                break;
            }
        }
    }
    void exibirInfo(){
        for (ProdutoCarrinho produto : produtos){
            System.out.println(produto.nome);
            System.out.println(produto.descricao);
            System.out.println(produto.fabricante);
            System.out.println(produto.preco);
            System.out.println();
        }
    }
    double calculaTotal(){
        for (ProdutoCarrinho produto : produtos){
            total += produto.preco;
        }
        return total;
    }
}

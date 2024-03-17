public class AppProduto {
    public static void main(String[] args){

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.codigoSerie = 1111;
        p1.codigoProduto = "aaa";
        p1.nome = "Desinfetante";
        p1.categoria = "Limpeza";
        p1.quantidade = 5;

        p2.codigoSerie = 2222;
        p2.codigoProduto = "bbb";
        p2.nome = "Cerveja";
        p2.categoria = "Bebidas";
        p2.quantidade = 10;

        p1.mostraInfo();
        System.out.println();
        p2.mostraInfo();
    }
}

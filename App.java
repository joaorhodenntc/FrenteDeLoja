public class App {
    public static void main(String args[]) {
        CatalogoProdutos catalogo = new CatalogoProdutos();
        catalogo.cadastraProduto(new Produto(10, "Notebook", 5000));
        catalogo.cadastraProduto(new Produto(20, "Smart TV", 2000));
        catalogo.cadastraProduto(new Produto(30, "Smartphone", 3000));
        catalogo.cadastraProduto(new Produto(40, "Video game", 2000));

        // System.out.println(catalogo.getProduto(20));
        // System.out.println(catalogo.getProduto(30));
        
        Estoque estoque = new Estoque();
        estoque.adicionaProduto(catalogo.getProduto(10), 5);
        estoque.adicionaProduto(catalogo.getProduto(20), 15);
        estoque.adicionaProduto(catalogo.getProduto(30), 10);
        
        //System.out.println(estoque.getQuantidadeDisponivel(20));
        //System.out.println(estoque.getQuantidadeDisponivel(40));
        
         Venda venda = new Venda(2);
         venda.InsereItem(catalogo.getProduto(10),2);
         System.out.println("Numero da venda: " + venda.getNumero(2));
         System.out.println("Valor do item " + venda.getTotal());
         System.out.println("Valor total da venda: " + venda.getValorVenda());
        
         

        //  venda.InsereItem(catalogo.getProduto(20),2);
        //  System.out.println("Valor do item " + venda.getTotal());

        //  venda.InsereItem(catalogo.getProduto(30),3);
        //  System.out.println("Valor do item " + venda.getTotal());
         
         
        //  System.out.println("Valor total da venda: " + venda.getValorVenda());
        
        //  System.out.println("Numero da venda: " + venda.getNumero(2));
    }
}



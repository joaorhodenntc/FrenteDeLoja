import java.util.ArrayList;

public class CatalogoProdutos {
    private ArrayList<Produto> produtos;

    public CatalogoProdutos() {
        produtos = new ArrayList<Produto>();
    }

    public boolean cadastraProduto(Produto produto) {
        if (produto == null)
            return false;
        return produtos.add(produto);
    }

    public Produto getProduto(int codigo) {

        for (Produto produto: produtos) {
            if (produto.getCodigo() == codigo)
                return produto;
        }

        // for (int i = 0; i < produtos.size(); i++) {
        //     Produto produto = produtos.get(i);
        //     if (produto.getCodigo() == codigo) {
        //         return produto;
        //     }
        // }
        for (Produto produto: produtos) {
            if (produto.getCodigo() != codigo)
                return null;
        }
        return null;
    }
}

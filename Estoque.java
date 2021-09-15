import java.util.ArrayList;

public class Estoque {
    private ArrayList<ItemEstoque> itensestoque;

    public Estoque() {
        itensestoque = new ArrayList<ItemEstoque>();
    }

    public boolean adicionaProduto(Produto produto, int quantidadeInicial) {
        if (produto == null)
            return false;
        
        if (quantidadeInicial < 0)
            return false;
        
        return itensestoque.add(new ItemEstoque(produto, quantidadeInicial));
    }

    private ItemEstoque getItem(int codigo) {
        for (ItemEstoque item: itensestoque) {
            if (item.getProduto().getCodigo() == codigo) {
                return item;
            }
        }
        return null;
    }

    public int getQuantidadeDisponivel(int codigo) {
        ItemEstoque item = getItem(codigo);
        if (item == null)
            return -1;

        return item.getQuantidadeDisponivel();
    }

    public boolean baixaEstoque(int codigo, int quantidade) {
        ItemEstoque item = getItem(codigo);
        if (item == null)
            return false;
        
        return item.baixaEstoque(quantidade);
    }
}

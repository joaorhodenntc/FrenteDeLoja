public class ItemEstoque {
   private Produto produto;
   private int quantidadeDisponivel;

    public ItemEstoque(Produto produto, int quantidadeInicial) {
        this.produto = produto;
        this.quantidadeDisponivel = quantidadeInicial;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public boolean baixaEstoque(int quantidade) {
        if (quantidade < 0)
            return false;
        
        if (quantidade > quantidadeDisponivel)
            return false;

        quantidadeDisponivel -= quantidade;
        return true;
    }

    public boolean reposicaoEstoque(int quantidade) {
        if (quantidade < 0)
            return false;
        
        quantidadeDisponivel += quantidade;
        return true;
    }

   
}

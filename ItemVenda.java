public class ItemVenda {
    private int numero;
    private Produto produto;
    private double precoUnitarioCobrado;
    private int quantidade;

    public ItemVenda(int numero, Produto produto, int quantidade) {
        this.numero = numero;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getNumero() {
        return numero;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getPrecoUnitarioCobrado(){
        return precoUnitarioCobrado;
    }

    public double getValorItem(){
        return precoUnitarioCobrado*quantidade;
    }

    @Override
    public String toString() {
        return "ItemVenda [numero=" + numero + ", precoUnitarioCobrado=" + precoUnitarioCobrado + ", produto=" + produto
                + ", quantidade=" + quantidade + "]";
    }

    
}

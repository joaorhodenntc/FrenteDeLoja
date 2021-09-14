import java.util.ArrayList;
public class Venda {
    private int numero;
    private ArrayList<ItemVenda> itens;
    private final double imposto = 0.25;
    private double valorTotal;
    private double desconto;
    private double valorComDesconto;

    public Venda (int numero) {
        this.numero = numero;
        itens = new ArrayList<ItemVenda>();
    }

    public int getNumero(int numero) {
        for (ItemVenda item: itens) {
            if (item.getNumero()==numero) 
                return numero;
        } return -1;
    }

    public boolean InsereItem (Produto produto, int quantidade){
        // if (produto == null)
        //     return false;

        // if (quantidade < 0)
        //     return false;    

        // return itens.add(new ItemVenda(numero, produto, quantidade));
    }

    public boolean removeItem (int numero) {
        for (ItemVenda item: itens) {
            if (item.getNumero()==numero) 
                 itens.remove(numero);
    }
    return false;
    }

    public double getTotal(){
        for (ItemVenda item : itens) {
         valorTotal  = item.getValorItem();
        }
        return valorTotal;
    }

    public double getImposto() {
        return getTotal()*imposto;
    }

    public double getDesconto() {
        if (getTotal()<250)
        return 0;
        if (getTotal()>250)
        desconto = getTotal()* 0.10;
        return desconto;
    }
        
    public double getValorVenda() {
        return getTotal()+getDesconto()+getImposto();
    }
}

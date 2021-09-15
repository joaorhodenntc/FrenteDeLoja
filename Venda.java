import java.util.ArrayList;
public class Venda {

    private int numero;
    private ArrayList<ItemVenda> itens;
    private final double imposto = 0.25;
    private double valorTotal;
    private double valorSemDesconto;

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

         if (produto == null)
             return false;

         if (quantidade < 0)
             return false;       

         ItemEstoque itemEstoque = new ItemEstoque(produto, quantidade);
        if (quantidade > itemEstoque.getQuantidadeDisponivel())
            return false;
          return itens.add(new ItemVenda(numero, produto, quantidade));
    }

    public boolean removeItem (int numero) {
        for (ItemVenda item: itens) {
            if (item.getNumero()==numero) 
                 itens.remove(numero);
            if (item.getNumero()!=numero)
                return false;
    }
    return true;
    }

    public double getTotal(){
         for (ItemVenda item : itens) {
         valorTotal = item.getValorItem();
             }
         
        return valorTotal;
    }

     public double getImposto() {
         return imposto;
     }

    public double getDesconto_imposto() {
        if (getTotal()<250) {
            valorSemDesconto = getTotal()*getImposto();
            return getTotal()+valorSemDesconto;}
        double valorComDesconto = getTotal()*0.10;
        double total = (getTotal()-valorComDesconto) * getImposto();
        return getTotal() + total;
    }

    public double getValorVenda() {
        return getDesconto_imposto();
    }

   }



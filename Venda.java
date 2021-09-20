import java.util.ArrayList;
public class Venda {

    private int numero;
    private ArrayList<ItemVenda> itens;
    private final double imposto = 0.25;
    private double valorTotal;

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

    public boolean conclui () {
        if (itens.size()<1) 
            return false;
        imprimeRecibo();
        return true;
    }

    public void imprimeRecibo() {
        System.out.println("Numero da venda: " + getNumero(numero));
        System.out.println("Valor do item " + getTotal());
        System.out.println("Valor total da venda: " + getValorVenda());     
    }


    public double getTotal(){
         for (ItemVenda item : itens) {
         valorTotal = item.getValorItem();
             }
        return valorTotal;
    }

    public double getImposto () {
        return imposto;
    }

    public double getDesconto () {
        if (getTotal()<250)
            return 0;
        double valorDesconto = getTotal()*0.10;
        return valorDesconto;
    }

    public double getValorVenda() {
       double valorComDesconto = (getTotal()-getDesconto());
       double valorComImposto =  valorComDesconto * getImposto();
       double valorFinalcomImposto =  valorComDesconto + valorComImposto;
       return valorFinalcomImposto;
    }

   }



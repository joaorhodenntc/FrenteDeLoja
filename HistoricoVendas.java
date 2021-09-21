import java.util.ArrayList;
public class HistoricoVendas {
    private ArrayList<Venda> vendas;
    private int numero;
    

public boolean adicionaVenda (Venda venda){
    vendas = new ArrayList<Venda>();
    return vendas.add(venda);
}

public Venda getVenda (int numero) {
    for (Venda venda: vendas) {
        if (venda.getNumero(numero)== numero)
                return venda;
    }
return null;
}

public Venda getUltimasVendas() {
    for (int i=0; i<vendas.size();) {
        return getVenda(numero);
    }
    return null;
}

}
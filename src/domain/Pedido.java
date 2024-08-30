package domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Integer id;
    private Date data;
    private Cliente cliente;
    private List<ItemPedido> itensPedido;
    
    public Pedido(Integer id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }

    public Double calculaValorPedido() {
        Double valorTotal = 0.0;
        for (ItemPedido item: itensPedido){
            valorTotal += item.calculaValorItemPedido();
        }
        return valorTotal;
    }

    public void addItem(ItemPedido item) {
        if (itensPedido == null){
            itensPedido = new ArrayList<>();
        }
        itensPedido.add(item);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

}

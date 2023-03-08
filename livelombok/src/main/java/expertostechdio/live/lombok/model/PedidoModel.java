package expertostechdio.live.lombok.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "pedido")
public class PedidoModel {
    @Id
    @Column(columnDefinition = "varchar(255)")
    private String id;
    @ManyToOne(cascade = CascadeType.ALL)
    private ClienteModel cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<PedidoItenModel> itens;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public List<PedidoItenModel> getItens() {
        return itens;
    }

    public void setItens(List<PedidoItenModel> itens) {
        this.itens = itens;
    }
}

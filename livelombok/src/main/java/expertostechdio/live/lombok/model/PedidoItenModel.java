package expertostechdio.live.lombok.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "PEDIDO_ITEN")
public class PedidoItenModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    private ProdutoModel produto;
    private BigDecimal valor;

    public Integer getId() {
        return id;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}

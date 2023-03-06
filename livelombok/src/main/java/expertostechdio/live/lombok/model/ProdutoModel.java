package expertostechdio.live.lombok.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;
@NoArgsConstructor
@Entity(name="produto")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String declaracao;
    private BigDecimal valor;

    public ProdutoModel(String declaracao, BigDecimal valor) {
        this.declaracao = declaracao;
        this.valor = valor;
    }


    public ProdutoModel(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }


    public String getDeclaracao() {
        return declaracao;
    }

    public void setDeclaracao(String declaracao) {
        this.declaracao = declaracao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoModel that = (ProdutoModel) o;
        return Objects.equals(id, that.id) && Objects.equals(declaracao, that.declaracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, declaracao);
    }
}

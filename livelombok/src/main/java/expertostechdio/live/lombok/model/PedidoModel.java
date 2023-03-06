package expertostechdio.live.lombok.model;

import jakarta.persistence.Id;

import java.util.List;

public class PedidoModel {
    @Id
    private String id;

    private ClienteModel cliente;

    private List<PedidoItenModel> itens;

}

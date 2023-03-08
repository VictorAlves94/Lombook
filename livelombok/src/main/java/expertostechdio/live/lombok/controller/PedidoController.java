package expertostechdio.live.lombok.controller;

import expertostechdio.live.lombok.model.PedidoModel;
import expertostechdio.live.lombok.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    @Autowired
    private final PedidoRepository repository;

    public PedidoController(PedidoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/listartodos")
    public ResponseEntity<List<PedidoModel>> listarTodos() {

        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salvar")
    public ResponseEntity<PedidoModel> salvar(@RequestBody PedidoModel pedido) {
        if(pedido.getId() == null ||pedido.getId().isEmpty()){
            pedido.setId(UUID.randomUUID().toString());
        }


        return ResponseEntity.ok(repository.save(pedido));


    }
}

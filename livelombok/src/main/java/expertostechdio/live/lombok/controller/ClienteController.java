package expertostechdio.live.lombok.controller;

import expertostechdio.live.lombok.model.ClienteModel;
import expertostechdio.live.lombok.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private final ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/listartodos")
    public ResponseEntity <List<ClienteModel>> listarTodos(){

        return ResponseEntity.ok(repository.findAll());
    }




}

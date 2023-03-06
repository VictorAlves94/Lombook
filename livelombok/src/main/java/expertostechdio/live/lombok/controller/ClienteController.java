package expertostechdio.live.lombok.controller;

import expertostechdio.live.lombok.model.ClienteModel;
import expertostechdio.live.lombok.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/salvar")
    public ResponseEntity <ClienteModel> salvar(@RequestBody ClienteModel cliente){
        return ResponseEntity.ok(repository.save(cliente));


    }






}

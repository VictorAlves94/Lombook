package expertostechdio.live.lombok.controller;

import expertostechdio.live.lombok.model.ProdutoModel;
import expertostechdio.live.lombok.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
    @Autowired
    private final ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }


//@RequestMapping(value = "/listartodos", method = RequestMethod.GET)
@GetMapping("/listartodos")
    public ResponseEntity<List<ProdutoModel>> listarTodos() {

        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salvar")
   // @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    public ResponseEntity<ProdutoModel> salvar(@RequestBody ProdutoModel produto) {
        return ResponseEntity.ok(repository.save(produto));


    }
}

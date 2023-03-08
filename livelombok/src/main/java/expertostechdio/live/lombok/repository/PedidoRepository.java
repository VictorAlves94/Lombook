package expertostechdio.live.lombok.repository;

import expertostechdio.live.lombok.model.ClienteModel;
import expertostechdio.live.lombok.model.PedidoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PedidoRepository extends JpaRepository<PedidoModel, String> {


}

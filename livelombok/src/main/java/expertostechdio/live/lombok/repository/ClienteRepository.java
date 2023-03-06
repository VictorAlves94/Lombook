package expertostechdio.live.lombok.repository;

import expertostechdio.live.lombok.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {

}

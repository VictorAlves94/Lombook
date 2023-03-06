package expertostechdio.live.lombok.repository;

import expertostechdio.live.lombok.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {

}

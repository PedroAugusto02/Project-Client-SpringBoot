package pedro.clients.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedro.clients.model.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    
}

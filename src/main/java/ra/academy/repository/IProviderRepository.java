package ra.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.academy.model.Provider;

@Repository
public interface IProviderRepository extends JpaRepository<Provider,Long> {
}

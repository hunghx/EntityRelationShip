package ra.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.academy.model.Product;
@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
}

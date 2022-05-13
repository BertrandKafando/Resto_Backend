package ma.enset.restaurant_backend.repositories;

import ma.enset.restaurant_backend.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categorie,Long> {
}

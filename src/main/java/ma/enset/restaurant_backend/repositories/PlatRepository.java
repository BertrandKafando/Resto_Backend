package ma.enset.restaurant_backend.repositories;

import ma.enset.restaurant_backend.entities.Plat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatRepository extends JpaRepository<Plat,Long> {
}

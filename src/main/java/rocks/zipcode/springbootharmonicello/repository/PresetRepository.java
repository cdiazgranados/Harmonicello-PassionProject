package rocks.zipcode.springbootharmonicello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rocks.zipcode.springbootharmonicello.model.Preset;

public interface PresetRepository extends JpaRepository<Preset, Integer> {
}

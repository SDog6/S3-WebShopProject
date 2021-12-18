package project.DBAccessInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import project.Models.product_class.GPU;

public interface IGPURepo extends JpaRepository<GPU, Long> {
    GPU getGPUByName(String name);
}

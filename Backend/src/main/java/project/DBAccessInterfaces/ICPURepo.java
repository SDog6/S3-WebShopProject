package project.DBAccessInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.Models.product_class.CPU;

public interface ICPURepo extends JpaRepository<CPU, Long> {
    @Query("FROM CPU WHERE name = ?1")
    CPU GetCPUByName(String name);

}

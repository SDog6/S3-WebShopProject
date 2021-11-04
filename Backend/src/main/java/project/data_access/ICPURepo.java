package project.data_access;

import org.springframework.data.jpa.repository.JpaRepository;
import project.classes.product_class.CPU;

public interface ICPURepo extends JpaRepository<CPU, Long> {

}

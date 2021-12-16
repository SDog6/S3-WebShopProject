package project.DBAccessInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import project.Models.product_class.parent_class.BasicProduct;

public interface IBasicProductRepo extends JpaRepository<BasicProduct, Long> {

}

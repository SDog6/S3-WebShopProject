package project.DBAccessInterfaces.productAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import project.Models.product_class.parent_class.BasicProduct;

public interface IBasicProduct extends JpaRepository<BasicProduct, Long> {
BasicProduct getBasicProductByName(String name);
}

package project.DBAccessInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import project.Models.PInventory;

public interface IInventoryRepo extends JpaRepository<PInventory,Long> {
    PInventory getByProduct_Id(Long id);
}

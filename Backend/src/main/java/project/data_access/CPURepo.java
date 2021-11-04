package project.data_access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.classes.product_class.CPU;

import java.util.List;

@Repository
public class CPURepo {

        @Autowired
        ICPURepo repo;



        public List<CPU> getAllCountries() {
            return repo.findAll();
        }

        public void addCountry(CPU country) {
            repo.save(country);
        }

}



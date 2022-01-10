//package project.repository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import project.DBAccessInterfaces.productAccess.IGPURepo;
//import project.Models.product_class.GPU;
//import project.repositoryInterfaces.IGPUData;
//
//import java.util.List;
//
//@Repository
//public class Storage implements IGPUData {
//
//    @Autowired
//    IGPURepo repo;
//
//    @Override
//    public boolean AddGPU(GPU product) {
//        repo.save(product);
//        return true;
//    }
//
//    @Override
//    public boolean RemoveGPU(GPU product) {
//        repo.delete(product);
//        return true;
//    }
//
//    @Override
//    public List<GPU> GetAllGPUs() {
//        return repo.findAll();
//    }
//
//    @Override
//    public GPU GetGPUByName(String name) {
//        return repo.getGPUByName(name);
//    }
//}

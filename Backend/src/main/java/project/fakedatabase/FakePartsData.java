package project.fakedatabase;

import project.classes.*;
import project.classes.SupportClasses.ProductInfo;

import java.util.ArrayList;
import java.util.List;

public class FakePartsData {

    private final List<CPU> CPUList = new ArrayList<>();
    private final List<CPUCooling> CPUCList = new ArrayList<>();
    private final List<GPU> GPUList = new ArrayList<>();
    private final List<Motherboard> MotherbList = new ArrayList<>();
    private final List<Powersupply> PowersupplyList = new ArrayList<>();
    private final List<RAM> RAMList = new ArrayList<>();
    private final List<Storage> StorageList = new ArrayList<>();


    public FakePartsData() {
        CPU Ryzen5600 = new CPU(new ProductInfo("AMD Ryzen 5 5600X", "AMD", 289, 2), 3.7, 65, "AM4", 8, 12);
        CPU Intel5 = new CPU(new ProductInfo("Intel Core i5-10600KF", "Intel", 300, 3), 4.1, 125, "Socket 1200", 6, 12);


        CPUCooling Cooler = new CPUCooling(new ProductInfo("CoolerMaster Hyper 212 Black Edition","Cooler Master",43.99,2),12);

        GPU RTX3070 = new GPU(new ProductInfo("NVIDIA GeForce RTX 3070 Ti","NVIDIA",699,2),1800,8,316,121,56,1,3,3);

        Motherboard MPGB550 = new Motherboard(new ProductInfo("MSI MPG B550 GAMING PLUS - Motherboard - ATX - Socket AM4 ","MSI",139,5),"AMD B550",false);

        Powersupply SuperS = new Powersupply(new ProductInfo("650W V2.3 Super Silent Series Power Supply","LC-Power",63,2),650);

        RAM Corsair = new RAM(new ProductInfo("Corsair 32GB, DDR4, 3200MHz 32GB DDR4 3200MHz Memory Module","Corsair",749,999),32,3200);

        Storage S = new Storage(new ProductInfo("Samsung 870 EVO - 2.5 Internal SSD - 500GB","Samsung",70,5),"SSD",500,560);

        CPUList.add(Ryzen5600);
        CPUList.add(Intel5);

        CPUCList.add(Cooler);
        GPUList.add(RTX3070);
        MotherbList.add(MPGB550);
        PowersupplyList.add(SuperS);
        RAMList.add(Corsair);
        StorageList.add(S);

    }

    public List<CPU> GetAllCPUs(){
        return this.CPUList;
    }

    public List<CPUCooling> GetAllCoolers(){return CPUCList;}

    public List<GPU> GetAllGPUs(){return GPUList;}

    public List<Motherboard> GetAllMotherboards(){return MotherbList;}

    public List<Powersupply> GetAllPowersupplies(){return PowersupplyList;}

    public List<RAM> GetAllRAMs(){return RAMList;}

    public List<Storage> GetAllStorages(){return StorageList;}
    
    public List<CPU> SearchCPUByName(String name){
        List<CPU> temp = new ArrayList<>();
        for (CPU s : CPUList)
        {
            if(s.getBasicinfo().getName().contains(name)){
                temp.add(s);
            }
        }
        return temp;
    }

    public List<CPU> SearchCPUByBrand(String brand){
        List<CPU> temp = new ArrayList<>();
        for (CPU s : CPUList)
        {
            if(s.getBasicinfo().getName().contains(brand)){
                temp.add(s);
            }
        }
        return temp;
    }

}

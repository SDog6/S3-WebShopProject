package project.fakedatabase;

import project.Models.product_class.CPU;
import project.repositoryInterfaces.ICPUData;

import java.util.ArrayList;
import java.util.List;

public class FakeCPUData implements ICPUData {

    private final List<CPU> CPUList;

    public FakeCPUData() {
        CPUList =  new ArrayList<>();

        CPU Ryzen5600 = new CPU("AMD Ryzen 5 5600X", "AMD", 289, 2,"s",0, 3.7, 65, "AM4", 8, 12);
        CPU Intel5 = new CPU("Intel Core i5-10600KF", "Intel", 300, 3,"s",0 ,4.1, 125, "Socket 1200", 6, 12);

        CPUList.add(Ryzen5600);
        CPUList.add(Intel5);
    }


    @Override
    public boolean AddCPU(CPU Product) {
        if (Product!=null){
            CPUList.add((CPU)Product);
            return true;
        }
        return false;
    }

    @Override
    public boolean RemoveCPU(CPU Product) {
        if (Product!=null){
            CPUList.remove((CPU)Product);
            return true;
        }
        return false;
    }

    @Override
    public List<CPU> GetAllCPUs() {
        return CPUList;
    }

    @Override
    public CPU GetCPUByName(String name) {
        for (CPU cpu: CPUList) {
            if (cpu.getName().equals(name)) {
                return cpu;
            }
        }
        return null;
    }
}

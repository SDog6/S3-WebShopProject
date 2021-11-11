package project.interfaces;

import project.classes.product_class.CPU;

import java.util.List;

public interface ICPUData {
    public boolean AddCPU(CPU product);
    public boolean RemoveCPU(CPU product);
    public List<CPU> GetAllCPUs();
    public CPU GetCPUByName(String name);
}

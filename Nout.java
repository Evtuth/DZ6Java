public class Nout {
    private String name;
    private String capacityRAM;
    private String brandCPU;
    private String capacityHD;
    private String operatingSystem;
    private String color;

    public Nout(String name, String capacityRAM, String brandCPU, 
    String capacityHD, String operatingSystem, String color) {
        this.name = name;
        this.capacityRAM = capacityRAM;
        this.brandCPU = brandCPU;
        this.capacityHD = capacityHD;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getCapacityRAM() {
        return capacityRAM;
    }

    public String getBrandCPU() {
        return brandCPU;
    }

    public String getCapacityHD() {
        return capacityHD;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return " \nNout {" +
                "name='" + name + '\'' +
                ", capacityRAM='" + capacityRAM + '\'' +
                ", brandCPU='" + brandCPU + '\'' +
                ", capacityHD='" + capacityHD + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Nout)){
            return false;
        }
        Nout nout = (Nout) obj;
        return name.equals(nout.name) && capacityRAM.equals(nout.capacityRAM) && brandCPU.equals(nout.brandCPU)
         && capacityHD.equals(nout.capacityHD) && operatingSystem.equals(nout.operatingSystem) && color.equals(nout.color);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*capacityRAM.hashCode() + 8*brandCPU.hashCode()
         + 9*capacityHD.hashCode() + 11*operatingSystem.hashCode() + 13*color.hashCode();
    }
}


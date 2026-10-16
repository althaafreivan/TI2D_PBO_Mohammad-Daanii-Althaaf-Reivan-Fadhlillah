public class Komputer {
    protected String Merk;
    protected int KapasitasMemory;
    protected int KecepatanCPU;

    public Komputer(String merk, int memory, int cpu) {
        this.Merk = merk;
        this.KapasitasMemory = memory;
        this.KecepatanCPU = cpu;
    }

    public void showInfo() {
        System.out.println("Merk             : " + Merk);
        System.out.println("Kapasitas Memory : " + KapasitasMemory + " GB");
        System.out.println("Kecepatan CPU    : " + KecepatanCPU + " GHz");
    }

    public void nyalakanKomputer() {
        System.out.println("Komputer " + Merk + " dinyalakan.");
    }
}

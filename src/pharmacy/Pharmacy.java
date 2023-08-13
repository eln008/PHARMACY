public class Pharmacy {
    private String name;
    private  int address;
    private Medicine[] medicines;
    private Worker[] workers ;

    public Pharmacy(String name,int address, Medicine[] medicines , Worker[] workers) {
        this.name = name;
        this.address=address;
        this.medicines=medicines;
        this.workers=workers;

    }

    public String getName() {
        return name;
    }

    public int getAddress() {
        return address;
    }

    public Medicine[] getMedicines() {
        return medicines;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public void setMedicines(Medicine[] medicines) {
        this.medicines = medicines;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }
    
}

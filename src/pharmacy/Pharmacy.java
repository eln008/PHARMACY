package pharmacy;

import java.util.Arrays;

public class Pharmacy {
    private String name;
    private  String address;
    private Medicine[] medicines;
    private Worker[] workers ;

    public Pharmacy(String name,String address, Medicine[] medicines , Worker[] workers) {
        this.name = name;
        this.address=address;
        this.medicines=medicines;
        this.workers=workers;

    }

    public Pharmacy() {

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMedicines(Medicine[] medicines) {
        this.medicines = medicines;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }


    public Medicine updateMedicinePrice(String medicineName, int newPrice) {
        for (int i = 0; i < medicines.length; i++) {
            if (medicines[i].getName().equals(medicineName)) {
                medicines[i].setPrice(newPrice);
                return medicines[i];
            }
        }

        return null;
    }

    String deleteWorkerByName(String workerName) {
        int indexToRemove = -1;

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().equals(workerName)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            Worker[] newWorkers = new Worker[workers.length - 1];
            int newIndex = 0;

            for (int i = 0; i < workers.length; i++) {
                if (i != indexToRemove) {
                    newWorkers[newIndex] = workers[i];
                    newIndex++;
                }
            }

            workers = newWorkers;
            return "Работник удален!";
        } else {
            return "Работник с таким именем не найден.";
        }
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", medicines=" + Arrays.toString(medicines) +
                ", workers=" + Arrays.toString(workers) +
                '}';
    }
}



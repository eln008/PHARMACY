package pharmacy;

import java.util.Arrays;
import java.util.Comparator;

public class DateBase {
    private Pharmacy[] pharmacies;
    public DateBase (Pharmacy [] pharmacies){
        this.pharmacies=pharmacies;
    }

    public Pharmacy[] getPharmacies(){
        return pharmacies;
    }
    public void setPharmacies (Pharmacy[] pharmacies) {
        this.pharmacies=pharmacies;
    }

    public Medicine[] getAllMedicineByPharmacyName(String pharmacyName){
        for (Pharmacy p: pharmacies) {
            if(p.getName().equals(pharmacyName)){
                return p.getMedicines();
            }
        }
        return null;
    }
    public Pharmacy getAllSortedWorkersByPharmacyAddress(String address) {
        for (Pharmacy pharmacy : pharmacies) {
            if (pharmacy.getAddress().equals(address)) {
                Worker[] sortedWorkers = pharmacy.getWorkers();
                Arrays.sort(sortedWorkers, Comparator.comparing(Worker::getName));
                pharmacy.setWorkers(sortedWorkers);
                return pharmacy;
            }
        }
        return null;
    }


public String addMedicineToPharmacy(String pharmacyName, Medicine medicine) {
    for (Pharmacy pharmacy : pharmacies) {
        if (pharmacy.getName().equals(pharmacyName)) {
            Medicine[] medicines = pharmacy.getMedicines();
            for (Medicine m : medicines) {
                if (m.getName().equals(medicine.getName())) {
                    return "Такое лекарство уже есть в этой аптеке.";
                }
            }

            Medicine[] newMedicines = Arrays.copyOf(medicines, medicines.length + 1);
            newMedicines[medicines.length] = medicine;
            pharmacy.setMedicines(newMedicines);

            return "Новое лекарство успешно добавлено!";
        }
    }
    return "Аптека с таким именем не найдена.";
}



    public String getPharmacyByWorkersName(String workerName) {
        for (Pharmacy pharmacy : pharmacies) {
            Worker[] workers = pharmacy.getWorkers();

            for (Worker worker : workers) {
                if (worker.getName().equals(workerName)) {
                    return "Apteka " + pharmacy.getName();
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "DateBase{" +
                "pharmacies=" + Arrays.toString(pharmacies) +
                '}';
    }
}

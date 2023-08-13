package pharmacy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Daisy",34,"aak@dkfj");
        Worker worker2 = new Worker("Anna",23,"aak@dkfj");
        Worker worker3 = new Worker("Maria",24,"jf@gfj");
        Worker worker4 = new Worker("Kate",50,"aak@d");
        Worker worker5 = new Worker("Azamat",45,"aak@dllj");
        Worker worker6 = new Worker("Meerim",20,"aak@lll");
        Worker worker7 = new Worker("Marat",40,"aak@dpp");
        Worker worker8 = new Worker("Moana",42,"aak@rrr");
        Worker [] workerArr1 = {worker1, worker2,worker3};
        Worker [] workerArr2= {worker4, worker5, worker6};
        Worker [] workerArr3= {worker7, worker8};

        Medicine medicine = new Medicine();
        Medicine medicine1 = new Medicine("adalat",45,23);
        Medicine medicine2= new Medicine("adenozin",60,10);
        Medicine medicine3 = new Medicine("adefovir",30,100);
        Medicine medicine4 = new Medicine("nongripp",15,34);
        Medicine medicine5 = new Medicine("ketonal",50,50);
        Medicine medicine6 = new Medicine("flemoksin",20,20);
        Medicine medicine7 = new Medicine("vitamin a",70,60);
        Medicine [] mediciArr1 = {medicine1, medicine2, medicine3};
        Medicine [] mediciArr2 = {medicine4, medicine5};
        Medicine [] mediciArr3 = {medicine6, medicine7};


        Pharmacy pharmacy1 = new Pharmacy("neman", "chingiz aitmatov ", mediciArr1,workerArr2);
        Pharmacy pharmacy2 = new Pharmacy("farmamir", "toktogul 45", mediciArr2,workerArr1);
        Pharmacy pharmacy3 = new Pharmacy("aibolit", "covetskaya 345 ", mediciArr3,workerArr3);

        Pharmacy pharmacy = new Pharmacy();


        DateBase dateBase = new DateBase(new Pharmacy[] { pharmacy1, pharmacy2, pharmacy3 });


        System.out.println(dateBase.getPharmacyByWorkersName("Kate"));
        System.out.println(Arrays.toString(dateBase.getAllMedicineByPharmacyName("neman")));
        System.out.println(dateBase.getAllSortedWorkersByPharmacyAddress("chingiz aitmatov"));
        System.out.println(dateBase.addMedicineToPharmacy("neman", new Medicine("new medicine", 23, 100)));
        System.out.println(pharmacy.updateMedicinePrice("flemoksin",1899));
        System.out.println(pharmacy.deleteWorkerByName("Moana"));


    }
}
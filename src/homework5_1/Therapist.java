package homework5_1;

public class Therapist extends Doctors {
    @Override
    public void trests() {
        System.out.println("Терапевт проводит общее лечение");
    }

    public void assignDoctor(Patient patient) {
        if (patient.treatmentPlan == 1) {
            Surgeon surgeon = new Surgeon();
            patient.doctor = "Хирург";
            System.out.println("Пациента лечит " + patient.doctor);
            surgeon.trests(); //хирур проводит операцию
        } else if (patient.treatmentPlan == 2) {
            Dentist dentist = new Dentist();
            patient.doctor = "Дантист";
            System.out.println("Пациента лечит " + patient.doctor);
            dentist.trests(); //дантист лечит зубы
        } else {
            patient.doctor = "Терапевт";
            System.out.println("Пациента лечит " + patient.doctor);
            this.trests();//терапевт назначет себя и проводит общее лечение
        }
    }
}
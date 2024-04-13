public class Therapist extends Doctor {
    public void heal() {
        System.out.println("Терапевт проводит терапию");
    }
    public Doctor assignDoctor(int patientHealPlan) {
        if (patientHealPlan == 1) {
            return new Surgeon();
        } else if (patientHealPlan == 2) {
            return new Dentist();
        } else {
            return new Therapist();
        }
    }


}

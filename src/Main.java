public class Main {



    public static void main(String[] args) {
        Patient patient = new Patient();
        Therapist therapist = new Therapist();

        patient.setTreatmentPlan(2);    // Ввести код как по условию задачи
        patient.setDoctor(therapist.assignDoctor(patient.getTreatmentPlan()));
        patient.getDoctor().heal();

        //Изменил поле color с помощью конструктора в классе Apple
        Apple apple = new Apple("blue");


    }
}
abstract class Vaccine {

    int age;
    String nationality;
    boolean firstDoseCompleted = false;

    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("Your First dose Successfully Done. Now you have to pay 250 Rs");
            firstDoseCompleted = true;
        } else {
            System.out.println("You are not eligible for First Dose");
        }
    }

    public void secondDose() {
        if (firstDoseCompleted) {
            System.out.println("Your Second dose Successfully Done");
        } else {
            System.out.println("Second dose not allowed without First dose");
        }
    }

    abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    public void boosterDose() {
        if (firstDoseCompleted) {
            System.out.println("Your Booster dose Successfully Done");
        }
    }
}

public class Vaccination {
    public static void main(String[] args) {

        Vaccine v = new VaccinationSuccessful(18, "Indian");

        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}

import java.util.ArrayList;

public class Patients {
    private String name;
    private String lastName;
    private int age;
    private double hemoglobinLevel;
    private char gender;
    private ArrayList<Patients> patients = new ArrayList<> ();
    private HasAnemia anemia = new HasAnemia ();

    public Patients () {

    }

    public Patients (String name, String lastName, int age, double hemoglobinLevel, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.hemoglobinLevel = hemoglobinLevel;
        this.gender = gender;
    }

    public void AddPatient (String name, String lastName, int age, double hemoglobinLevel, char gender) {
        Patients patient = new Patients (name, lastName, age, hemoglobinLevel, gender);
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.hemoglobinLevel = hemoglobinLevel;
        this.gender = gender;
        patients.add (patient);
    }


    public void getPatientsInfo () {
        for (Patients p : patients) {
            System.out.println (p.toString ());
            String positive = anemia.HasAnemia (p) ? "This person has anemia" : "This person doesn't have anemia";
            System.out.println (positive);
        }
    }

    public Patients validateFullName () {

        return null;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public double getHemoglobinLevel () {
        return hemoglobinLevel;
    }

    public void setHemoglobinLevel (double hemoglobinLevel) {
        this.hemoglobinLevel = hemoglobinLevel;
    }

    public char getGender () {
        return gender;
    }

    public void setGender (char gender) {
        this.gender = gender;
    }

    @Override
    public String toString () {
        return ("{" + name + ',' + lastName + ',' + age + ',' + hemoglobinLevel + "," + gender + '}');
    }
}



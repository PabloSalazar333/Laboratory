import javax.swing.*;

public class Main {
    public static void main (String[] args) {
        String name = "";
        String lastName = "";
        int age = 0;
        double hemoglobinLevel = 0.0;
        char gender;
        Patients person = new Patients ();
        HasAnemia anemia = new HasAnemia ();

        while (true) {
            name = JOptionPane.showInputDialog ("Add your Name: ");
            if (name.isEmpty ()) {
                break;
            }
            lastName = JOptionPane.showInputDialog ("Add your Last Name: ");
            age = Integer.parseInt ((JOptionPane.showInputDialog ("Add your Age: ")));
            hemoglobinLevel = Double.parseDouble (JOptionPane.showInputDialog ("Add your Hemoglobin Level: "));
            gender = JOptionPane.showInputDialog ("Add your Gender: ").charAt (0);


            person.AddPatient (name, lastName, age, hemoglobinLevel, gender);

        }

        person.getPatientsInfo ();



    }
}

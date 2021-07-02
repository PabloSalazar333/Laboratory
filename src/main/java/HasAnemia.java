import java.util.ArrayList;

public class HasAnemia {

    public Boolean HasAnemia (Patients patients) {

        if (!(patients.getAge() <= 5) && (patients.getHemoglobinLevel () >= 11.5) && (patients.getHemoglobinLevel () <= 15.0)) {
            return true;

        } else if (!(patients.getAge() > 5) && (patients.getAge () <= 10) && (patients.getHemoglobinLevel () >= 12.6) && (patients.getHemoglobinLevel () <= 15.5)) {
            return true;

        } else if (!(patients.getAge () > 10) && (patients.getAge () <= 15) && (patients.getHemoglobinLevel () >= 13.0) && (patients.getHemoglobinLevel () <= 15.5)) {
            return true;

        } else if (!(patients.getGender() == 'f' || patients.getGender () == 'F') && (patients.getAge() > 15) && (patients.getHemoglobinLevel () >= 12.0) && (patients.getHemoglobinLevel () <= 16.0)) {
            return true;
        } else if (!(patients.getGender () == 'm' || patients.getGender () == 'M') && (patients.getAge () > 15) && (patients.getHemoglobinLevel () >= 14.0) && (patients.getHemoglobinLevel () <= 18.0)) {
            return true;
        } else {
            return false;
        }

    }

}

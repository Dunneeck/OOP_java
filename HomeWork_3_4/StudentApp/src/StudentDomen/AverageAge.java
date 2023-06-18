package StudentDomen;

import java.util.List;

public class AverageAge<T extends Person> {
    private List<T> persons;

    public AverageAge(List<T> persons) {
        this.persons = persons;
    }

    public double getAverageAge() {
        double sum = 0;
        for (T person : persons) {
            sum += (double) person.getAge();
        }
        return sum / persons.size();
    }

    public void showAverageAge() {
     switch (persons.get(0).getClass().getSimpleName()) {
    case "Student":
        System.out.println("Average age of Students " + getAverageAge() + " years");
        break;
    case "Emploee":
        System.out.println("Average age of EmploeeS " + getAverageAge() + " years");
        break;
    case "Teacher":
        System.out.println("Average age of TeacherS " + getAverageAge() + " years");
        break;
    default:
        System.out.println("The average age is " + getAverageAge());
        break;
}

    }
}

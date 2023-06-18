package Controllers;

import Services.TeacherService;
import StudentDomen.Teacher;

public class TeacherController implements iPersonController<Teacher>{

    private final TeacherService teacherServ = new TeacherService();
    
    @Override
    public void create(String firstName, String secondName, int age) {
        teacherServ.create(firstName, secondName, age);
    }

    static public <T extends Teacher> void paySalary(T person)
    {
        System.out.println((person).getFirstName() + " выплачена зарплата 20000р.");
    }


}

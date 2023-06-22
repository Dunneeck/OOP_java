package View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;


public class ViewEng implements iGetView {

    public void printAllStudents(List<Student> students)
    {
        System.out.println("-----list of students-----");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("-----end of list-----");
    }

    @Override
    public String promptString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public int promptInteger(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextInt();
    }
    
    /**
     * показ всех студентов в hashMap
     * @param hashStud список студентов в hashMap
     */
    public void printAllStudentsHashMap(HashMap<Long, Student> hashStud){
        for (Map.Entry<Long, Student> student : hashStud.entrySet()) {
         System.out.println("Key " + student.getKey() + " - " +  student.getValue());
      }
    }
}
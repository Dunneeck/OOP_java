import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Person;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        Person man = new Person("Денис", "Криницын", 35);
        //System.out.println(man.toString());

        Student pers1 = new Student("Денис", "Криницын", 35, 1);
        //System.out.println(pers1.toString());

        Student s1 = new Student("Сергей", "Иванов", 22, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 141);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(pers1);

        StudentGroup group1 = new StudentGroup(listStud1, 1);
        // System.out.println(group1.toString() + listStud1.toString());

        // Collections.sort(group1.getGroup());

        // System.out.println(group1.toString());

        // for(Student stud:group1)
        // {
        //     System.out.println(stud.toString());
        // }

        
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);

        StudentGroup group2 = new StudentGroup(listStud2, 2);

        // System.out.println(group2.toString());/

        // for(Student stud:group2)
        // {
        //     System.out.println(stud.toString());
        // }


        List<StudentGroup> listStudGroup = new ArrayList<StudentGroup>();
         listStudGroup.add(group1);
         listStudGroup.add(group2);
        StudentSteam steam1 = new StudentSteam(listStudGroup, 1);

            // Вываод через итератор
         for (StudentGroup gr: steam1){
           System.out.println("id = " + gr.getIdGroup());
           for (Student st: gr){
               System.out.println(st.toString());
           }
           System.out.println("-------------");
         }

         System.out.println("---------------");

        //  сортировка
        Collections.sort(steam1.getSteamStud());

        for(StudentGroup gr: steam1){
          System.out.println("id= " + gr.getIdGroup());
          for (Student st : gr){
              System.out.println(st.toString());
          }
        }
         for(Student stud:group1)
         {
            System.out.println(stud.toString());
         }

         System.out.println("===============================");
         Collections.sort(group1.getGroup());

         for(Student stud:group1)
         {
            System.out.println(stud.toString());
         }


    }


}

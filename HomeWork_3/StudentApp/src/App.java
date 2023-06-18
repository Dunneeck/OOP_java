import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.TeacherController;
import Services.TeacherService;
import StudentDomen.AverageAge;
import StudentDomen.Person;
import StudentDomen.PersonComparator;
// import StudentDomen.SGIterator;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;

public class App {
  public static void main(String[] args) throws Exception {

    // HomeWork_3();

    Student s1 = new Student("Сергей", "Иванов", 20, 101);
    Student s2 = new Student("Андрей", "Сидоров", 18, 141);
    // PersonComparator<Student> compS = new PersonComparator<>();
    // compS.compare(s1, s2);

    Teacher t1 = new Teacher("Сергей", "Иванов", 40, "Физик");
    Teacher t2 = new Teacher("Андрей", "Сидоров", 30, "Химик");
    // PersonComparator<Teacher> compT = new PersonComparator<>();
    // compT.compare(t1, t2);

    // compT.compare(t1, s1); //не сработает надо использовать полиморфизм. ниже

    // Person s3 = new Student("Сергей", "Иванов", 22, 101);
    // Person t3 = new Teacher("Сергей", "Иванов", 22, "Физик");
    // PersonComparator<Person> compP = new PersonComparator<>();
    // compS.compare(s1, (Student) s3);
    // compP.compare(s3, t3);

    System.out.println("  TeacherService до сортировки ");

    TeacherService teacherService = new TeacherService();
    teacherService.create("Даниил", "Навицкий", 26);
    teacherService.create("Александр", "Навицкий", 30);
    teacherService.create("Иван", "Навицкий", 30);

    for (Teacher person : teacherService.getAll()) {
      System.out.println(person);
    }

    System.out.println("================   после сортировки");


    for (Teacher person : teacherService.getSortedByFIOTeacherList()) {
      System.out.println(person);
    }


    System.out.println("\n================  TeacherController ");
    
    TeacherController.paySalary(t1);
    
    
    System.out.println("\n================  Средний возраст ");

    List<Student> listStuds = new ArrayList<>();
    listStuds.add(s2);
    listStuds.add(s1);
    AverageAge<Student> groupStuds = new AverageAge<Student>(listStuds);
    // System.out.println(groupStuds.getAverageAge());
    groupStuds.showAverageAge();    
    
    List<Teacher>  listTeachers = new ArrayList<>();
    listTeachers.add(t1);
    listTeachers.add(t2);
    
    AverageAge<Teacher> groupTeachers = new AverageAge<Teacher>(listTeachers);

    groupTeachers.showAverageAge();
  }





  
  public static void HomeWork_3() {
    Person man = new Person("Денис", "Криницын", 35);
    // System.out.println(man.toString());

    Student pers1 = new Student("Денис", "Криницын", 35, 1);
    // System.out.println(pers1.toString());

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
    // System.out.println(stud.toString());
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
    // System.out.println(stud.toString());
    // }

    List<StudentGroup> listStudGroup = new ArrayList<StudentGroup>();
    listStudGroup.add(group1);
    listStudGroup.add(group2);
    StudentSteam steam1 = new StudentSteam(listStudGroup, 1);

    // Вываод через итератор
    System.out.println("--------------- вывод потоков и их групп");
    for (StudentGroup gr : steam1) {
      System.out.println("id = " + gr.getIdGroup());
      for (Student st : gr) {
        System.out.println(st.toString());
      }
    }

    System.out.println("\n---------------сортировка потоков");

    // сортировка
    Collections.sort(steam1.getSteamStud());

    for (StudentGroup gr : steam1) {
      System.out.println("id= " + gr.getIdGroup());
      for (Student st : gr) {
        System.out.println(st.toString());
      }
    }
    System.out.println("\n=============================== Сортировка группы");
    for (Student stud : group1) {
      System.out.println(stud.toString());
    }

    System.out.println("=============================== после сортировки");
    Collections.sort(group1.getGroup());

    for (Student stud : group1) {
      System.out.println(stud.toString());
    }
  }

}

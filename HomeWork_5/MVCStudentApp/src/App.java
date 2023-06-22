import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.RowFilter.Entry;

// import javax.jws.WebParam.Mode;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileModel;
import Model.HashModel;
import Model.Model;
import Model.PersonsIterator;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
   public static void main(String[] args) throws Exception {
      List<Student> students = new ArrayList<Student>();
      Student s1 = new Student("Сергей", "Иванов", 21, 101);
      Student s2 = new Student("Андрей", "Сидоров", 22, 111);
      Student s3 = new Student("Иван", "Петров", 22, 121);
      Student s4 = new Student("Игорь", "Иванов", 23, 301);
      Student s5 = new Student("Даша", "Цветкова", 25, 171);
      Student s6 = new Student("Лена", "Незабудкина", 23, 104);
      students.add(s1);
      students.add(s2);
      students.add(s3);
      students.add(s4);
      students.add(s5);
      students.add(s6);
      // FileModel fModel = new
      // FileModel("./HomeWork_5/MVCStudentApp/src/StudentsDB.txt");
      // fModel.saveAllStudentToFile(students);

      // // iGetModel model = new Model(students);
      iGetModel newFModel = new Model(students);
      iGetView view = new View();

      Controller controller = new Controller(view, newFModel);
      // Controller controller = new Controller(view, model);
      // controller.update();
      controller.run();

      System.out.println("================= HashMap students and view Eng");

      Student h1 = new Student("Сергей", "Иванов", 21, 101);
      Student h2 = new Student("Андрей", "Сидоров", 22, 111);
      Student h3 = new Student("Иван", "Петров", 22, 121);
      Student h4 = new Student("Игорь", "Иванов", 23, 301);
      HashMap<Long, Student> hashStud = new HashMap<Long, Student>();
      hashStud.put(1L, h1);
      hashStud.put(2L, h2);
      hashStud.put(3L, h3);
      hashStud.put(4L, h4);

      ViewEng viewEng = new ViewEng();
      HashModel hashModel = new HashModel(hashStud);
      Controller controllerEng = new Controller(viewEng, hashModel);

      controllerEng.updateEng();

   }
}

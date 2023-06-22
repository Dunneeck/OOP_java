package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Model.HashModel;
import Model.Model;
import Model.Student;
import View.View;
import View.ViewEng;

public class Controller{
    private iGetView view;
    private iGetModel model;
    private List<Student> students;
    
    private ViewEng viewEng;
    private HashModel hashModel;
    private HashMap<Long, Student> hashStudents;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }
    public Controller(ViewEng viewEng, HashModel hashModel){
        this.viewEng = viewEng;
        this.hashModel = hashModel;
        this.students = new ArrayList<Student>();
    }

    public void getAllStudents() {
        students = model.getAllStudents();
    }

    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
    public void update() {
        //MVP
        getAllStudents();
        if(testData())
        {
            view.printAllStudents(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.promptString("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                case DELETE:
                    if(students == null){
                        getAllStudents();
                    }
                    int deleteStud = view.promptInteger("Введите Id студента для удаления из списка");
                    model.deleteStudentById(deleteStud);
                    break;
            }

        }
    }

    /**
     * показывает основные команды 
     */
    public void updateEng(){

        this.students = hashModel.getAllStudents();
        hashStudents = hashModel.addStudensToHashMap(students);

        viewEng.printAllStudentsHashMap(hashStudents);
    }
}

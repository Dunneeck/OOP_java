package Model;

import java.util.Iterator;
import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void deleteStudentById(int idStudent) {
        if (students.removeIf(item -> item.getId() == idStudent)) {
            System.out.println("Студент с ID " + idStudent + " был удалён!");
        } else {
            System.out.println("Не удалось удалить студента с таким ID " + idStudent);
        }
    }

}

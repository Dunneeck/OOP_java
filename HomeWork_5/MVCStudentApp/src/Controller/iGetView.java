package Controller;

import java.util.List;

import Model.Student;

public interface iGetView {
    void printAllStudents(List<Student> students);
    String promptString(String message);
    int promptInteger(String message);
}

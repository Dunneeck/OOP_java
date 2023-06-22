package Controller;

import java.util.List;

import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudents();

    /**
     * удаление студента по id
     * @param idPerson id для удаления
     */
    public void deleteStudentById(int idPerson);
    
}

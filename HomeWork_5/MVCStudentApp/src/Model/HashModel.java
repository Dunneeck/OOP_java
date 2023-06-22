package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class HashModel implements iGetModel {
    private HashMap<Long, Student> hashStudents;

    public HashModel(HashMap<Long, Student> hashStudents){
        this.hashStudents = hashStudents;
    }
    
    @Override
    public List<Student> getAllStudents() {
       return new ArrayList<Student>(hashStudents.values());
    }

    @Override
    public void deleteStudentById(int idStudent) {
         if (hashStudents.values().removeIf(item -> item.getId() == idStudent)) {
            System.out.println("Student with ID " + idStudent + " has been removed successfully!");
        } else {
            System.out.println("Failed to remove student with ID " + idStudent);
        }
    }
    
    /**
     * добавление студентов со списка в hashMap
     * @param students students 
     * @return hashMap students
     */
    public HashMap<Long, Student> addStudensToHashMap(List<Student> students){
        Long key = 0L;
        for (Student student : students) {
            hashStudents.put(key, student);
            key++;
        }
        return hashStudents;
    }
        

    
}

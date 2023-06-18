package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.PersonComparator;

public class TeacherService implements iPersonService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher per = new Teacher(firstName, secondName, age, "basic");
        teachers.add(per);
    }

    public List<Teacher> getSortedByFIOTeacherList() {
        List<Teacher> newTeacherList = new ArrayList<Teacher>(teachers);
        newTeacherList.sort(new PersonComparator<Teacher>());
        return newTeacherList;
    }

}

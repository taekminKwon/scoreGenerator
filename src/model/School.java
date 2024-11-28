package model;

import java.util.ArrayList;

public class School {
    private static School instance = new School();
    private static String SCHOOL_NAME = "Good School";
    private ArrayList<Student> studentArrayList = new ArrayList<>();
    private ArrayList<Subject> subjectArrayList = new ArrayList<>();
    private School(){}
    public static School getInstance(){
        if(instance == null)
            instance = new School();
        return instance;
    }

    public ArrayList<Student> getStudentArrayList(){
        return studentArrayList;
    }

    public ArrayList<Subject> getSubjectArrayList(){
        return subjectArrayList;
    }

    public void addStudent(Student student){
        studentArrayList.add(student);
    }
    public void addSubject(Subject subject){
        subjectArrayList.add(subject);
    }
}

package model;

import constant.Define;
import evaluation.BasicEvaluation;
import evaluation.GradeEvaluation;
import evaluation.MajorEvaluation;
import evaluation.PassFailEvaluation;

import java.util.ArrayList;

public class Subject {
    private int subjectId;
    private String subjectName;
    private int gradeType;
    private ArrayList<Student> studentList;

    public Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.gradeType = Define.AB_TYPE;
        this.studentList = new ArrayList<>();
        if(subjectId > 3000){
            setGradeType(Define.PF_TYPE);
        }
    }

    public void register(Student student){
        studentList.add(student);
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public void addStudentList(Student student){
        studentList.add(student);
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}

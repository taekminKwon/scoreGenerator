package model;

import java.util.ArrayList;

public class Student {
    private String name;
    private int studentId;
    private Subject majorSubject;
    private ArrayList<Score> scoreList;
    public Student(String name, int studentId, Subject majorSubject) {
        this.name = name;
        this.studentId = studentId;
        this.majorSubject = majorSubject;
        this.scoreList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }

    public void addSubjectScore(Score score){
        scoreList.add(score);
    }
}

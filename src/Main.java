import constant.Define;
import model.*;

import java.util.ArrayList;

public class Main {
    static School goodSchool = School.getInstance();
    Subject korean;
    Subject math;
    Subject dance;

    public static void main(String[] args) {
        Main test = new Main();
        test.createSubject();
        test.createStudent();
        generateAllScore(goodSchool.getSubjectArrayList());
    }

    public static void addScore(Student student, Subject subject, int point){
        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);
        subject.addStudentList(student);
    };

    public void createSubject(){
        korean = new Subject(Define.KOREAN,"국어");
        math = new Subject(Define.MATH, "수학");
        dance = new Subject(Define.DANCE, "방송댄스");

        goodSchool.addSubject(korean);
        goodSchool.addSubject(math);
        goodSchool.addSubject(dance);
    }

    public void createStudent(){
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("강감찬", 211213, korean));
        studentList.add(new Student("김유신", 212330, math));
        studentList.add(new Student("신사임당", 201518, korean));
        studentList.add(new Student("이순신", 202360, korean));
        studentList.add(new Student("홍길동", 201290, math));

        for (int i = 0; i < studentList.size(); i++) {
            goodSchool.addStudent(studentList.get(i));
        }

        addScore(studentList.get(0),korean,95);
        addScore(studentList.get(1),korean,95);
        addScore(studentList.get(2),korean,100);
        addScore(studentList.get(3),korean,89);
        addScore(studentList.get(4),korean,85);

        addScore(studentList.get(0),math,56);
        addScore(studentList.get(1),math,95);
        addScore(studentList.get(2),math,88);
        addScore(studentList.get(3),math,95);
        addScore(studentList.get(4),math,56);

        addScore(studentList.get(0),dance, 95);
        addScore(studentList.get(1),dance, 85);
        addScore(studentList.get(2),dance, 55);
    }

    public static void generateAllScore(ArrayList<Subject> subjectArrayList){
        for (int i = 0; i < subjectArrayList.size(); i++) {
            System.out.println(GenerateGradeReport.generate(subjectArrayList.get(i)));
        }
    }
}


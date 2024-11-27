package model;

import constant.Define;
import evaluation.BasicEvaluation;
import evaluation.GradeEvaluation;
import evaluation.MajorEvaluation;
import evaluation.PassFailEvaluation;

import java.util.ArrayList;

public class GenerateGradeReport {
    public static final String TITLE = " 수강생 학점\n";
    public static final String HEADER = " 이름  |  학번  |중점과목| 점수   \n";
    public static final String LINE = "-------------------------------------\n";
    private static StringBuffer buffer = new StringBuffer();
    public static void generate(Subject subject){
        makeHeader(subject);
        makeBody(subject);
    }
    public static void makeHeader(Subject subject){
        buffer.append(subject.getSubjectName())
                .append(" ")
                .append(TITLE)
                .append(HEADER)
                .append(LINE);
    }
    public static void makeBody (Subject subject){
        ArrayList<Student> studentArrayList = subject.getStudentList();
        for (int i = 0; i < studentArrayList.size(); i++) {
            gradeReturn(studentArrayList.get(i),subject);
        }
    }
    public static void gradeReturn (Student student, Subject subject){
        GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};
        ArrayList<Score> scoreList = student.getScoreList();
        for (int i = 0; i < scoreList.size(); i++) {
            String grade;
            Score score = scoreList.get(i);
            if(subject.getSubjectId() == score.getSubject().getSubjectId()){ // 매개 변수로 받은 subject 의 score 일 때,
                if(subject.getGradeType() == Define.PF_TYPE) { // PF_TYPE 인지 먼저 확인
                    grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint());
                } else{
                    if(score.getSubject().getSubjectId() == student.getStudentId()){ // 중점 과목일 때,
                        grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
                    }else
                        grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
                }
                buffer.append(" ").append(student.getName()).append("  |  ").append(student.getStudentId())
                        .append("  |").append(student.getMajorSubject()).append("|  ").append(grade).append('\n');
                buffer.append(LINE);
            }
        }
    }

}

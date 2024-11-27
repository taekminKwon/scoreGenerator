import model.Score;
import model.Student;
import model.Subject;

public class Main {
    public static void main(String[] args) {

    }

    public static void addScore(Student student, Subject subject, int point){
        Score score = new Score(student.getStudentId(),subject,point);
        student.addSubjectScore(score);
    };
}


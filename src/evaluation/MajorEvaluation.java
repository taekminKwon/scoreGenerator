package evaluation;

public class MajorEvaluation implements GradeEvaluation{

    @Override
    public String getGrade(int point) {
        if(95<=point&&point<=100){
            return "S";
        }else if(90<=point){
            return "A";
        }else if(80<=point){
            return "B";
        }else if(70<=point){
            return "C";
        }else if(60<=point){
            return "D";
        }else
            return "F";
    }
}

package evaluation;

import evaluation.GradeEvaluation;

public class BasicEvaluation implements GradeEvaluation {
    @Override
    public String getGrade(int point) {
        if(90<=point&&point<=100){
            return "A";
        }else if(80<=point){
            return "B";
        }else if(70<=point){
            return "C";
        }else if(55<=point){
            return "D";
        }else
            return "F";
    }
}

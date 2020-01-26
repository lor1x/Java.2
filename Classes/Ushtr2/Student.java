package Classes.Ushtr2;

public class Student {
    private String name;
    private int totalScore;
    private int quizNr;

    public Student(String n, int qN) {
        this.name = n;
        this.quizNr = qN;
    }

    public String getName() {
        return this.name;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    public void addQuiz(int sc) {
        this.totalScore += sc;
    }

    public double getAvgScore() {
        return this.totalScore / (quizNr * 1.0);
    }
}
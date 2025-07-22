package Ex05;

class Student extends Person {
    int javaScore;
    int dbmsScore;
    int htmlScore;
    Major major;

    Student(String name, Major major, int javaScore, int dbmsScore, int htmlScore) {
        super(name);
        this.major = major;
        this.javaScore = javaScore;
        this.dbmsScore = dbmsScore;
        this.htmlScore = htmlScore;
    }

    int getTotalScore() {
        return javaScore + dbmsScore + htmlScore;
    }

    int getAverageScore() {
        return getTotalScore() / 3;
    }

    Major getMajor() {
        return major;
    }
}

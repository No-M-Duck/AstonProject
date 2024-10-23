package org.example.models;

public class Student {

    private final int numberGroup;
    private final double avgScore;
    private final int recordBookNumber;


    public Student(StudentBuilder studentBuilder) {
        this.numberGroup = studentBuilder.numberGroup;
        this.avgScore = studentBuilder.avgScore;
        this.recordBookNumber = studentBuilder.recordBookNumber;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public int getRecordBookNumber() {
        return recordBookNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numberGroup=" + numberGroup +
                ", avgScore=" + avgScore +
                ", recordBookNumber=" + recordBookNumber +
                '}';
    }

    public static class StudentBuilder {
        private int numberGroup;
        private double avgScore;
        private int recordBookNumber;

        public StudentBuilder setNumberGroup(int numberGroup){
            this.numberGroup = numberGroup;
            return this;
        }
        public StudentBuilder setAvgScore(double avgScore){
            this.avgScore = avgScore;
            return this;
        }
        public StudentBuilder setRecordBookNumber(int recordBookNumber){
            this.recordBookNumber = recordBookNumber;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}

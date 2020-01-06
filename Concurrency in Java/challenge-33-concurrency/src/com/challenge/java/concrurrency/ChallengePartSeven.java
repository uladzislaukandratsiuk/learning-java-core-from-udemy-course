package com.challenge.java.concrurrency;

public class ChallengePartSeven {

    public static void main(String[] args) {
        Tutor tutor = new Tutor();
        Student student = new Student(tutor);
        tutor.setStudent(student);

       new Thread(tutor::studyTime).start();

       new Thread(student::handInAssignment).start();
    }
}

class Tutor {

    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void studyTime() {
        System.out.println("Tutor has arrived");
        try {
            // wait for student to arrive and hand in assignment
            Thread.sleep(300);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        student.startStudy();
        System.out.println("Tutor is studying with student");
    }

    public void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}

class Student {

    private Tutor tutor;

    Student(Tutor tutor) {
        this.tutor = tutor;
    }

    public void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public void handInAssignment() {
        tutor.getProgressReport();
        System.out.println("Student handed in assignment");
    }
}

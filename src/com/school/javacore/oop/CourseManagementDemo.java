package com.school.javacore.oop;

public class CourseManagementDemo {
    public static void main(String[] args){

        Student john = new Student("John", "Smith", "john_smith@gmail.com");
        Course courseJava =new Course("Java Programming", 9, 0);
        Course courseSoftSkills = new Course("Soft Skills", 3, 0);
        Course courseTools = new Course("Tools", 3, 0);

        john.addCourse(courseJava);
        john.addCourse(courseSoftSkills);
        john.addCourse(courseTools);

        System.out.println(john);

        john.updateGrade(courseJava, 95);
        john.updateGrade(courseSoftSkills, 50);
        john.updateGrade(courseTools, 45);

        System.out.println(john);

        System.out.println("Average is "+john.calculateGradeAverage());
    }
}

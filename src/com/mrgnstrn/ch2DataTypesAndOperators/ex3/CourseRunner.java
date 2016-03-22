package com.mrgnstrn.ch2DataTypesAndOperators.ex3;

/**
 * Created by mrgns on 14.03.2016.
 */
public class CourseRunner {
    public static void main(String[] args) {
        Course course = new Course();
        BaseCourse baseCourse = new BaseCourse();
        FreeCourse freeCourse = new FreeCourse();
        OptionalCourse optionalCourse = new OptionalCourse();

        System.out.println("course instanceof Course " + (course instanceof Course));
        System.out.println("basecourse instanceof Course " + (baseCourse instanceof Course));
        System.out.println("freecourse instanceof Course " + (freeCourse instanceof Course));
        System.out.println("optionalcourse instanceof Course " + (optionalCourse instanceof Course));

        //System.out.println("optionalcourse instanceof Course " + (optionalCourse instanceof BaseCourse));
        System.out.println("course instanceof Course " + (course instanceof Course));


    }
}

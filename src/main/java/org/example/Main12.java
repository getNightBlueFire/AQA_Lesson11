package org.example;

import java.util.*;
import java.util.function.IntFunction;

public class Main12 {
    public static void main(String[] args) {
        List<Student> group = new ArrayList<>();
        List<Student> theSecondCourse = new ArrayList<>();

        Student dima = new Student("dima", 10, List.of(64, 3, 4, 5, 6));
        Student duplicateDima = new Student("dima", 10, List.of(6, 3, 4, 5, 6));
        Student ivan = new Student("ivan", 10, List.of(7, 8, 8, 7, 5));

        group.add(dima);
        group.add(ivan);


        for (Student s: group){
            System.out.println(s.name);
            float avg = 0;
            for (Integer rate : s.rates) {
                avg += rate / (float)s.rates.size();
            }

            System.out.println(avg + "< avg");
            if (avg > 5.0){

                theSecondCourse.add(s);
            }

        }

        group.removeAll(theSecondCourse);
        System.out.println(group.size());
        System.out.println(theSecondCourse.size());

        List<String> a = List.of("A", "A", "B", "C");
        HashSet<String> nonDuplicate = new HashSet<>();

        nonDuplicate.addAll(a);

        for (String s : nonDuplicate) {
            System.out.println(s);
        }

        nonDuplicate.contains("A");

        Set<Student> students = new HashSet<>();

        students.add(dima);
        students.add(duplicateDima);
        students.add(ivan);

        for (Student s: students){

            System.out.println(s);
        }



    }
}

class Student{
    public String name;
    public Integer age;
    public List<Integer> rates;

    public Student(String name, Integer age, List<Integer> rates) {
        this.name = name;
        this.age = age;
        this.rates = rates;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("rates=" + rates)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}

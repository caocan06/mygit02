package com.sy.demo11;

/**
 * @Title: Student
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/10 0010 13:41
 */
public class Student {

    private String name;

    private Integer age;

    private Double score;

    public Student() {
    }

    public Student(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

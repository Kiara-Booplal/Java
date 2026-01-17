package ClassAndObjectsBasics.StudentAverage;

public class StudentAverageDemo {
    public static void main (String [] args){
        Student stu = new Student("Jamie", new int[]{15, 24, 67, 87, 90});
        System.out.println(stu.average());
        stu.grade();

        Student stu2 = new Student("Chris", new int[]{90,97,87,100,77});
        System.out.println(stu2.average());
        stu2.grade();
    }
}

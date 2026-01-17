package ClassAndObjectsBasics.ClassRoomRegister;

public class StudentDemo {
    public static void main(String [] args){
        Student [] students = new Student[5];

        students[0] = new Student();
        students[0].id = 1;
        students[0].name = "Jack";
        students[0].age = 16;

        students[1] = new Student();
        students[1].id = 2;
        students[1].name = "Julie";
        students[1].age = 15;

        students[2] = new Student();
        students[2].id = 3;
        students[2].name = "Smithy";
        students[2].age = 14;

        students[3] = new Student();
        students[3].id = 4;
        students[3].name = "James";
        students[3].age = 18;

        students[4] = new Student();
        students[4].id = 5;
        students[4].name = "Happy";
        students[4].age = 12;

        int maxAge = 0;
        String name = "";

        for (Student student : students) {
            System.out.println("ID: " + student.id);
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println();
        }

        for (int i = 0 ; i< students.length; i++) {
            if (students[i].age > maxAge) {
                maxAge = students[i].age;
                name = students[i].name;
            }
        }
        System.out.println("The oldest student is " + name + " at age " + maxAge);
        System.out.println();

        int searchId = 2;
        for(Student student : students){
            if(student.id == searchId){
                System.out.println("ID: " + student.id);
                System.out.println("Name: " + student.name);
                System.out.println("Age: " + student.age);
            }
        }
    }
}

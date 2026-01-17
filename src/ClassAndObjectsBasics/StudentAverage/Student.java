package ClassAndObjectsBasics.StudentAverage;

public class Student {
    private String name;
    private int [] marks = new int[5];

    public Student(String name, int [] marks){
        this.name = name;
        this.marks = marks;
    }

    public int average(){
        int result = 0;
        for (int mark : marks) {
            result = result + mark;
        }
        return result/ marks.length;
    }

    public void grade(){
        if(average() >= 90){
            System.out.println("A");
        }
        else if(average() >= 70 && average() >= 79){
            System.out.println("B");
        }
        else if(average() >= 60 && average() <= 69 ){
            System.out.println("C");
        }
        else if(average() >= 50 && average() <= 59){
            System.out.println("D");
        }
        else if (average() < 50){
            System.out.println("F");
        }
    }
}

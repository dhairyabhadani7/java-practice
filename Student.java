package JavaPractice;

public class Student {
    private int age;
    private String name;
    private double marks;

    public Student(int age, String name, double marks){
        this.name=name;
        setAge(age);
        setMarks(marks);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<=100){
           this.age=age;
        }
        else{
            System.out.println("Invalid age! Setting default value 18.");
            this.age=18;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if(marks>0 && marks <=100){
          this.marks = marks;
        }
        else{
            System.out.println("Invalid marks! Setting default to 0.");
            this.marks=0;
        }
    }
        public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("---------------------");
        }
    
}

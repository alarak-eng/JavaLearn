public class Student{
    private double age,stature,weight,ID;
    public Student(double length){
        this.length=length;
    }
    public Student(double width){
        this.width=width;
    }
    public Student(double age){
        this.age=age;
    }
    public Student(double ID){
        this.ID=ID;
    }
    public double getAge(){
        return this.age;
    }
    public double getStature(){
        return this.stature;
    }
    public double getWeght(){
        return this.weight;
    }
    public void getAge(double age){
        this.age=age;
    }
    public void getStature(double stature){
        this.stature=stature;
    }
    public void getWeght(double weight){
        this.weight=weight;
    }

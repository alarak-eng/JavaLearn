public class Square{
    private double length,width;
    public Square(double length){
        this.length=length;
    }
    public Square(double width){
        this.width=width;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
}

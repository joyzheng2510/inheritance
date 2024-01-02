public class Triangle extends Shape{
  public Triangle(int h, int w) {
    height = h;
    width = w;
    type = "Triangle";
  }
  public void calculateArea(){
    this.area = (this.height * this.width)/2;
    this.printShape();
  }
}
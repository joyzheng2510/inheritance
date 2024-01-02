public class Rectangle extends Shape{
  public Rectangle(int h, int w) {
    height = h;
    width = w;
    type = "Rectangle";
  }
  public void calculateArea(){
    this.area = this.height * this.width;
    this.printShape();
  }
}
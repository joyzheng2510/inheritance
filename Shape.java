public class Shape {
  int height;
  int width;
  int area;
  String type;

  public Shape(){
    
  }
  
  public Shape(int h, int w) {
    height = h;
    width = w;
  }
  public void printShape(){
    System.out.println("Shape: "+this.type);
    System.out.println("Height: "+this.height);
    System.out.println("Width: "+this.width);
    System.out.println("Area: "+this.area);
  }
  public void calculateArea(){
    System.out.println("Cannot calculate area for this shape");
  }
}
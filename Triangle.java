public class Triangle {
    int side1;
    int side2;
    int side3;
    int getPerimeter(){
        return side1+side2+side3;
    }
    double getAreaOfTriangle(){
        return 0.5*side1*side2*side3;
    }

    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.side1=3;
        triangle.side2=4;
        triangle.side3=5;
        System.out.println("perimeter if triangle"+triangle.getPerimeter());
        System.out.println("area of triangle"+ triangle.getAreaOfTriangle());

    }
}

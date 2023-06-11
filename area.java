import java.util.Scanner;
public class area {
    int length,breadth;
    void setDim(int l,int b)
    {
        length=l;
        breadth=b;
    }
    int getArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int length,breadth;
        System.out.println("enter length :");
        length =obj.nextInt();
        System.out.println("enter breadth");
        breadth=obj.nextInt();
        area react=new area();
        react.setDim(length,breadth);
        System.out.println("area is :"+ react.getArea());
        obj.close();

    }
}


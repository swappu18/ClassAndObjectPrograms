public class Complex {
    int value;
    int sum(){
        return 0;
    }
    int difference(){
        return 0;
    }
    int product(){
        return 0;
    }

    public static void main(String[] args) {
        Complex  complex = new Complex();
        complex.value=100;


        Complex complex2=new Complex();
        complex2.value=200;


        System.out.println("sum of two complex number"+(complex.sum()));
        System.out.println("difference of two complex number"+(complex.difference()));
        System.out.println("product of two complex number"+(complex.product()));


    }

}

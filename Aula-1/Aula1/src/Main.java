public class Main {
    public static void main(String[] args) {
       
        int a = 1;
        int b = a; // b = copia o valor
        System.out.println("A = " + a + " B = " + b);
        a = 2;
        System.out.println("A = " + a + " B = " + b);

        myObj objA = new myObj(1);
        myObj objB = objA; // objB = copia a referencia de memoria

        System.out.println("ObjA = " + objA + " ObjB = " + objB);
        objA.setNun(2);
        System.out.println("ObjA = " + objA + " ObjB = " + objB);
    }
}

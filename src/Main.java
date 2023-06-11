public class Main {
    public static void main(String[] args) {
//        int x = 5;
//        int y = 10;

        IntRef x = new IntRef(5);
        IntRef y = new IntRef(10);
        System.out.println("x : " + x.value);
        System.out.println("y : " + y.value);
        swap(x,y);
        System.out.println("x : " +x.value);
        System.out.println("y : " +y.value);
    }
    public static void swap(IntRef x,IntRef y){
        int tmp = x.value;
        x.value = y.value;
        y.value = tmp;
    }
}

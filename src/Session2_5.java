public class Session2_5 {
    public static void main(String[] args) {
        printTosan();
        System.out.println(add(1, 6));
        System.out.println("Task2");
        System.out.println("Task3");
        System.out.println("Task4");
        System.out.println("Task5");
        System.out.println(add(10,8));
        printTosan();
    }

    static int add(int i, int j){
        int k = i + j;
//        System.out.println(k);
        return k;
    }
    //Access Modifier
    //non-access modifier
    static void printTosan(){
        System.out.println("Tosan");
    }
}

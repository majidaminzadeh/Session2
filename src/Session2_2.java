public class Session2_2 {
    public static void main(String[] args) {
        /*
         1- check the condition
          1.1- enter into loop -> if condition is true
          1.2- out of loop -> if condition is false
         2- check teh condition
         ...
         */
        int i=0;
        while(i<10){
            System.out.println("YES");
            i++;
        }
        int j=0;

        /*
            1- enter into loop
            2- check the condition
             2.1- enter into loop -> if condition is true
             2.2- out of loop -> if  condition is false
         */
        do{
            System.out.println("Do While");
            j++;
        }while (j<10);

//        while(true){
//            System.out.println("Test Break");
//            break;
//        }
        // break
        // continue
    }
}

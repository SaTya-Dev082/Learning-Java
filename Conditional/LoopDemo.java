package Conditional;

public class LoopDemo {
    // public static void main(String[] args) {
    //     int i = 0;
    //     while (i < 5) {
    //         System.out.println("Hello Java" + i);
    //         i++;
    //     }
    // }


    // public static void main(String[] args) {
    //     int i = 0;
    //     do {
    //         System.out.println("Hello Java" + i);
    //         i++;
    //     } while (i < 5);
    // }

    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Hello Java" + i);
        // }

        // for (int i=0;i<100;i++){
        //     if (i%2==0){
        //         System.out.println(i + " is Even number," );
        //     }else{
        //         System.out.println(i + " is Odd number," );
        //     }
        // }
        
        for(int i=0;i<20;i++){
            if (i==14||i==17){
                continue;
            }
            System.out.println(i);
        }
    }
}

package OOP.OverloadOverride.Exercise;

public class VarAgrs {
    public  int findMaxValue(int... numbers){
        
        if(numbers.length==0) {
            System.out.println("The number is invalid, please input the number now.");
            return 0;
        }
        int max=numbers[0];
        for(int number : numbers){
            if(number>max){
                max=number;
            }
        }
        System.out.println("Max value is "+max);
        return max;
    }
}

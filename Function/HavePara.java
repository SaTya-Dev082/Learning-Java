package Function;

public class HavePara {
    
    public static void main(String[] args){
        String name="Jave";
        haveParaMethod(name,10);

        HavePara obj=new HavePara();
        obj.testParaMethod(name, 0);
        // testParaMethod(name,10);

        
    }
    void testParaMethod(String str, int num){
        System.out.println(str + " " + num);
    }

    public static void haveParaMethod(String str, int num){
        System.out.println(str + " " + num);
    }

}

import java.util.Scanner;

public class SimpleFactory {
    public static void main(String[] args){
        System.out.println("SimpleFactory patterns");
        System.out.println("你想喝点啥？");
        Scanner scan = new Scanner(System.in);
        String drink = scan.next();
        Drink obj = Factory.createDrink(drink);
        obj.hello();
    }
}

class Factory {
    public static Drink drinkObj = null;
    public static Drink createDrink(String drink){
        if("tea".equals(drink)){
            drinkObj = new Tea();
//            drinkObj.hello(drink);
        }else if("milk".equals(drink)){
            drinkObj = new Milk();
//            drinkObj.hello(drink);
        }
        return drinkObj;
    }
}

abstract class Drink{
    public void hello(){
        System.out.print("好喝吗?");
    }
}

class Tea extends Drink{
    public Tea(){
        System.out.println("给你茶");
    }
    public void hello(){
        super.hello();
        System.out.print("茶苦吗？");
    }

}

class Milk extends Drink{
    public Milk(){
        System.out.println("给你奶");
    }
    public void hello(){
        super.hello();
        System.out.print("奶甜吗？");
    }
}
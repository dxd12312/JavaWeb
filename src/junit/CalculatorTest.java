package junit;

public class CalculatorTest {
    public static void main(String[] args){
    //    创建对象
        Calculator c = new Calculator();
    //    调用add方法
        int result = c.add(1,2);
        System.out.println(result);

    //    调用sub方法
        int result2 = c.sub(1,1);
        System.out.println(result2);
    }
}

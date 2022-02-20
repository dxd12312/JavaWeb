package test;


import junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    /**
     * 初始化方法
     * 用于资源申请，所有测试方法在执行之前都会先执行该方法
     */
    public void init(){
        System.out.println("init...");
    }

    /**
     * 释放资源方法
     * 在所有方法都执行完毕后，自动执行该方法
     */
    public void close(){
        System.out.println("close...");
    }
    /**
     * 测试add方法
     */
    @Test
    public  void  testAdd() {
        System.out.println("我被执行了");
        System.out.println("testAdd...");
    //    1.创建计算器对象
        Calculator c = new Calculator();
    //    2.调用add方法
        int result = c.add(1,2);
        System.out.println(result);
    //    3.断言：判断结果为3
        Assert.assertEquals(3,result);
    }

    /**
     * 调用sub方法
     */
    @Test
    public void  testSub() {
        System.out.println("我被执行了");
        System.out.println("testAdd...");
        //    1.创建计算器对象
        Calculator c = new Calculator();
        //    2.调用add方法
        int result = c.sub(1,2);
        System.out.println(result);
        //    3.断言：判断结果为3
        Assert.assertEquals(-1,result);
    }

}

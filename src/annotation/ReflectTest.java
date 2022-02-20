package annotation;

import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Class<?> reflectTestClass = ReflectTest.class;



        Pro an = reflectTestClass.getAnnotation(Pro.class);
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className + "," + methodName);

        Class<?> cls = Class.forName(className);
        Object obj = cls.getConstructor().newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);

    }
}

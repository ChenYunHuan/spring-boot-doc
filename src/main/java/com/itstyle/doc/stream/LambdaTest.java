package com.itstyle.doc.stream;


import org.junit.jupiter.api.Test;

public class LambdaTest {
    public static void main(String args[]) {
        LambdaTest tester = new LambdaTest();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }

    @Test
    public void testAddOperation() {
        AddOperation operation = (int a, int b, int c) -> a + b + c;
        int operation1 = operation.operation(1, 2, 3);
        System.out.println(operation1);

        GreetingService service = message -> System.out.println("hello " + message);
        service.sayMessage("world");

        int num = 1;
        Converter converter = param -> System.out.println(param + num);
        converter.convert(1);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    interface AddOperation {
        int operation(int a, int b, int c);
    }
    public interface Converter<T1, T2> {
        void convert(int i);
    }


}

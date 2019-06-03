package com.example.webService;

import com.example.webService.AutoGeneratedCode.HelloWorldService;

/**
 * 测试web service
 *
 * @author lazy cat
 * @since 2019-05-08
 **/
public class TestHelloWorld {

    public static void main(String[] args) {
        HelloWorldService helloWorldService = new HelloWorldService();
        String result = helloWorldService.getHelloWorldPort().sayHello("zzy");
        System.out.println(result);
    }
}

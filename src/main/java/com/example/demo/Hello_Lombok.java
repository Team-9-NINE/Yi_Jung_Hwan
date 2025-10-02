package com.example.demo;


import lombok.Getter;

@Getter
public class Hello_Lombok {
    private final String hello;
    private final int lombok;

    // 생성자 직접 작성
    public Hello_Lombok(String hello, int lombok) {
        this.hello = hello;
        this.lombok = lombok;
    }

    public static void main(String[] args) {
        Hello_Lombok helloLombok = new Hello_Lombok("헬로", 5);

        // @Getter 덕분에 getter 메서드가 자동 생성됨
        System.out.println(helloLombok.getHello());   // 출력: 헬로
        System.out.println(helloLombok.getLombok());  // 출력: 5
    }
}

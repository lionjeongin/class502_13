package chapter6.q6;

public class Company {

    private static Company instance = new Company(); // 1. 생성자를 private으로 만들기 / 2. 클래스 내부에 static으로 유일한 인스턴스 생성하기

    private Company(){}

    public static Company getInstance(){ // 3. 외부에서 참조할 수 있는 public 메서드 만들기
        if(instance == null){
            instance = new Company();
        }
        return instance; //3_1. 유일하게 생성한 인스턴스 반환
    }// 3_2. 인스턴스를 외부에서 참조할 수 있도록 public get()메서드 구현
}
/*
# 싱글톤 패턴

싱글톤 패턴이란?

        **필요할 때 하나만 생성하고 공유하는 패턴**

 */
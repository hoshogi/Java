# 과제 4
1. 주어진 main method를 수행했을 경우 실행결과가 다음과 같다. 인터페이스와 클래스를 정의하시오.

- 주어진 main method
```java
public class SmartPhoneTest {
    public static void main(String[] args) {
        MobilePhone p = new SmartPhone();
        p.sendCall();
        ((MP3)p).play();
        System.out.println(((PDA)p).calculate(3, 5));
        ((SmartPhone)p).scheduler();
    }
}
```

```java
public class SmartPhoneTest {
    public static void main(String[] args){
        SmartPhone p = new SmartPhone();
        p.sendCall();
        p.play();
        System.out.println(p.calculate(3,5));
        p.scheduler();
    }
}
```
- 실행결과
```
전화 걸기
음악 재생
8
일정 관리
```  
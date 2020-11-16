package day02;
// 논리연산자
// 논리연산자는 2개의 boolean 값 혹은 1개의 boolean 값에 대한 연산을 한다.
// && || !

// && : AND 연산자, 2개의 boolean값이 모두 true일 때에만 true가 된다.
//      만약 앞의 boolean이 false일 경우, 뒤의 boolean는 아예 연산 혹은 계산하지않고
//      곧장 false가 결과값이 나온다

// || : OR연산자, 2개의 boolean 증 한개라도 true이면 true가 된다
//      즉 2개다 false일 때에만 false가 된다.
//      만약 앞의 boolean이 true일 경우, 뒤의 boolean은 아예 연산 혹은 계산하지않고
//      곧장 true가 결과값으로 나온다.

// ! : NOT연산자, 1개의 boolean 값을 반대값으로 뒤집는다.
//     즉, true는 false로, false는 true로 바꾼다.

public class Ex02Operator04 {
    public static void main(String[] args) {
        
        System.out.println("-------------&&-------------" );
        System.out.println("true && true:" +(true && true));
        System.out.println("true && false:" +(true && false));
        System.out.println("false && true:" +(false && true));
        System.out.println("false && false:" +(false && false));
        System.out.println("--------------------------" );
        
        
        System.out.println("-------------||-------------" );
        System.out.println("true || true:" +(true || true));
        System.out.println("true || false:" +(true || false));
        System.out.println("false || true:" +(false || true));
        System.out.println("false || false:" +(false || false));
        System.out.println("--------------------------" );
        
        
        System.out.println("-------------!-------------" );
        System.out.println("!true:" +(!true));
        System.out.println("!false:" +(!false));
        System.out.println("--------------------------" );
        
        
        int number = 5;
        System.out.println("number > 0 && number < 10:" +(number > 0 && number < 10));
        
        number = -1;
        System.out.println("number < 0 || number > 100:" +(number < 0 || number > 100));
        String password = "1q2w3e4r";
        String userpassword = "12345";
        System.out.println("password.equals(userpassword) :"+password.equals(userpassword));
        System.out.println("!password.equals(userpassword) :"+!password.equals(userpassword));
        
    
    
    }

}

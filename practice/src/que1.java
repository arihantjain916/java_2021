// WAP to check if the given number is prime or not and
//  prime number is a natural number greater than
// 1 that has no +ve division other than 1 and itself.
// for eg: 3,5,7,11,13 are prime numbers whereas 2,4,9,15 are not

class A{
    void prime(int num){
        int flag = 0;
        if(num == 0 || num == 1){
            System.out.println("Number is not prime");
        }
        else{
            for(int i=2; i<num; i++){
                if(num%i ==0){
                    flag = 1;
                }
            }
        }
        if(flag == 1){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is prime");
        }
    }
}
public class que1 {
    public static void main(String[] args) {
        A a = new A();
        a.prime(4);
    }
}

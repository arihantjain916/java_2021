// When we want to make class which is used once then we have to make anonyoums class.

// interface lam{
//     public void lam1();
//     public void lam2();
// }

// public class lambda {
//     public static void main(String[] args) {
//         // lam l = new lam(){
//         //     @Override
//         //     public void lam1() {
//         //         System.out.println("1");
//         //     }
//         //     @Override
//         //     public void lam2() {
//         //         System.out.println("2");
//         //     }
//         // };
//         // l.lam1();
//         // l.lam2();
//     }
// }

// Using Lambda Function

@FunctionalInterface
interface lamd{
    public void lamd1();
}

public class lambda {
    public static void main(String[] args) {
        lamd la = () -> {System.out.println("I am lamd1 which is made by lambda function");};
        la.lamd1();

    }
}

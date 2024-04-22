package exam13;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return 0;
            }
        };

        int result = cal.add(10, 20);
        System.out.println(result );
    }
}

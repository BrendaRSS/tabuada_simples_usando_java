public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tabuada do 1 ao 10 usando Java:");

        for(int i =1; i<=10; i++){
            for(int j =1; j<=10; j++){
                int result = i * j;
                 System.out.println(i + "x" + j + " = " + result);
            }
        }
    }
}

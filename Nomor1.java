import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        fizzbuzz(n);


        /* Pekerjaan anda berakhir sini */

        input.close();
        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }

    public static void fizzbuzz(int n){
    for(int i = 0; i <= n; i++){
        if(i % 3 == 0 && i % 5 == 0){
            System.out.print(i + " " + "FizzBuzz");
        }
        else if(i % 3 == 0){
            System.out.print(i + " " + "Fizz");
        }
        else if(i % 5 == 0){
            System.out.print(i + " " + "Buzz");
        }
        else{
            System.out.print(i + " ");
        }
    }
}
}

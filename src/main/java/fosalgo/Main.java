package fosalgo;

import java.util.Scanner;

/**
 *
 * @author Sugiarto Cokrowibowo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //TULISKAN KODEMU DIBAWAH INI
        String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.println("========");
        System.out.println("Output: ");
        if ((n >= 1) && (n <= 12)) {
            // index array = 0
            n--;
            System.out.println(namabulan[n % 12]);
            System.out.println(namabulan[(n + 1) %12]);
            System.out.println(namabulan[(n + 2) %12]);
            System.out.println(namabulan[(n + 3) %12]);
        } else {
            System.out.println("Input tidak valid");
        }
        
        
        
    }

}
        
        
    



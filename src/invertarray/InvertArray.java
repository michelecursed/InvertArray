package invertarray;

import java.util.Scanner;

public class InvertArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci la lunghezza dell'array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0;i<N;i++) {
            System.out.print("Inserisci il valore: ");
            arr[i] = sc.nextInt();
        }
        
        int temp;
        for(int i=0;i<N/2;i++) {
            temp = arr[i];
            arr[i]=arr[N-1-i];
            arr[N-1-i]=temp;
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Il vettore ha i seguenti valori: ");
        for(int i=0;i<N;i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);
    }
}

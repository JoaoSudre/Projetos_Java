import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        int numeros[] = new int [8];
        int numerosP[] = new int [8];
        int numerosN[] = new int [8];

        System.out.println("Digite 8 numeros inteiros: ");
        Scanner sc = new Scanner(System.in);

        int iPos = 0, iNeg = 0;
     for (int i = 0; i < numeros.length; i++) { 
     numeros[i] = sc.nextInt();
     if (numeros[i] >= 0) {
        numerosP[iPos] = numeros[i];
        iPos++;
    } else {
        numerosN[iNeg] = numeros[i];
        iNeg++;
    }
    sc. close();
}
System.out.printf("foram encontrados %d números positivos\n", iPos);
for (int i = 0; i < iPos; i++) {
    System.out.println(numerosP[i]);
}
System.out.printf("foram encontrados %d números negativos\n", iNeg);
for (int i = 0; i < iNeg; i++) {
    System.out.println(numerosN[i]);
}
}
}
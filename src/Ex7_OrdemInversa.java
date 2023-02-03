public class Ex7_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {14, -5, 15, 30, 8, 2};

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){

            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");

        }

    }
}

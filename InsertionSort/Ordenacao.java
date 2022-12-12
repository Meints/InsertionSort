package InsertionSort;

public class Ordenacao {
    private int vet[] = {9,8,5,6,3,4,7,0,2,1};


    public void insertionSort(){
        int pos, it, j;

        for (it = 1; it < vet.length; it++) {
            pos = vet[it];
            for (j = it-1; (j>=0) && vet[j] > pos; j--) {
                vet[j+1] = vet[j];
            }
            vet[j+1] = pos;
            System.out.println("---------> Final da " + it + "º interação <---------");
            mostraVet();
        }
    }

    public void mostraVet(){
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+ " ");
        }
        System.out.println("");
    }
}

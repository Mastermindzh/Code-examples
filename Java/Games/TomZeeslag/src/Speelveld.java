/**
 * Created by mastermindzh on 12/14/15.
 */
public class Speelveld {

    private int[][] velden = new int[10][10];
    private final int mis = 1;
    private final int raak = 2;
    private final int leeg = -1;

    public Speelveld() {
        leegVelden();
    }

    private void leegVelden(){
        //voor elke rij
        for(int[] ia: velden){
            //voor elke kolom
            for(int i: ia){
               i = mis;
            }
        }
    }


    /**
     * Methode om een speelveld te tekenen
     */
    public void printVelden(){
        for(int i = 0; i<= velden.length; i++){
            System.out.print(i+" ");
            for(int j = 0; j<=velden[i].length; j++){
                if(i == 0){
                    System.out.print(j+ " ");
                }else{

                }

            }
            System.out.println();
        }
    }


    public void printVelden2(){
        int numbercount = 0;
        int lettercount = 91;
        for(int[] ia: velden){
            System.out.print(numbercount+" ");

            //voor elke kolom
            for(int i: ia){
                if(numbercount == 0){
                    System.out.print(lettercount);
                }else{
                    switch(i){
                        case 1:
                            System.out.print("O ");
                            break;
                        case 2:
                            System.out.print("X ");
                            break;
                        default:
                            System.out.print("~ ");
                            break;
                    }
                }


            }
            System.out.println();
            numbercount++;
        }
    }

    public int[][] getVelden() {
        return velden;
    }
}

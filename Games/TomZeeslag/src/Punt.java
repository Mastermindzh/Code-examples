/**
 * Created by mastermindzh on 12/14/15.
 */
public class Punt {

    /**
     *
     */
    private char x;
    /**
     *
     */
    private int y;

    private final int laagsteNummer = 1;
    private final int hoogsteNummer = 10;


    /**
     * Array van letters die gebruikt worden bij zeeslag
     */
    private final char[] letters = {'A','B','C','D','E','F','G','H','I','L'};

    /**
     *
     * @param x
     * @param y
     */
    public Punt(char x, int y) {
        setX(x);
        setY(y);
    }


    public char getX() {
        return x;
    }

    /**
     * Zet de globale x variabele als deze voorkomt in de array van toegestane letters.
     * @param x
     */
    public void setX(char x) {
        //Variabele die nodig is om te kijken of x valide is
        boolean valid = false;

        for(char c:letters){
            if(c == x){
                valid = true;
                break;
            }
        }
        if(valid) {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    /**
     * Zet de globale y coordinaat als deze tussen de toegestane limit is.
     * @param y
     */
    public void setY(int y) {
        if((y>=this.laagsteNummer) && (y<this.hoogsteNummer)){
            this.y = y;
        }
    }
}

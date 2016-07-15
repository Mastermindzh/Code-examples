/**
 * Created by mastermindzh on 12/14/15.
 */
abstract class Schip {

    private Punt voorKant;
    private Punt achterKant;

    /**
     * Maak een schip en zet de punten correct
     * @param voorKant
     * @param achterKant
     */
    public Schip(Punt voorKant, Punt achterKant) {
        this.voorKant = voorKant;
        this.achterKant = achterKant;
    }

    public Punt getVoorKant() {
        return voorKant;
    }

    public void setVoorKant(Punt voorKant) {
        this.voorKant = voorKant;
    }

    public Punt getAchterKant() {
        return achterKant;
    }

    public void setAchterKant(Punt achterKant) {
        this.achterKant = achterKant;
    }
}



public class Meteo {
    Boolean ilPleut = false;

    public Boolean getPluie () {
        return ilPleut ;
    }

    /**
     * La méthode setPluie() renvoie vrai s'il pleut actuellement
     */
    public void setPluie() {
        if ( Course.random.nextInt(100) + 1 < 30){
           ilPleut = true;
        } else {
           ilPleut = false;
        }
    }
}

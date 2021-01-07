

import java.util.Arrays;
import java.util.List;

public class Voiture extends Vehicule   {

    private List<String> listeNomsPossibles = Arrays.asList(
            "Vol",
            "P0",
            "BW0",
            "FER99",
            "Mc90",
            "M890",
            "Msb",
            "Nupmn",
            "Alp",
            "Sub");

    public Voiture(CarType carType, int numOfCars) {
        super(carType);
        this.nom = listeNomsPossibles.get(Course.random.nextInt(9) + 1) +
                listeNomsPossibles.get(Course.random.nextInt(9) + 1) + // stocke le nom de la voiture composé
                // de deux mots aléatoires de la liste ci-dessus
                String.valueOf(numOfCars);
        vitesseMaximale = Course.random.nextInt(30) + 80; // stocke la vitesse normale de
        // la voiture, fixée à un nombre aléatoire dans le constructeur entre 80 et 110 km/h
    }

    @Override
    //Cette méthode est utilisée pour régler la vitesse réelle utilisée pour la manche en cours
    public Boolean preparePourManche(Course course) {
        if (checkForFacteurRalentissement(course)) {
            vitesseCourante = 75;
            // vitesse de la voiture s'il y'a un drapeau jaune aka facteur ralentisseur (un camion sur la voie)
            return true;
        }
        vitesseCourante = vitesseMaximale; // sinon la vitesse reste la meme
        return false;
    }

    @Override
    protected Boolean checkForFacteurRalentissement(Course course) { // check si un camion empanne est sur la voie
        if (course.getcamionEmpanne()) {
            return true;
        }
        return false;


    }

}

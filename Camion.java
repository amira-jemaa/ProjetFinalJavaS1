



public class Camion extends Vehicule implements Empanne {

    private int empanneTourneAGauche = 0; // tient combien de temps il est encore en panne.

    public Camion (CarType carType, int numOfcamions) {
        super(carType);
        nom = String.valueOf(numOfcamions); //La propriété du nom stocke le nom. Les camionneurs sont ennuyeux,
        // ils appellent leurs camions sur un
        // nombre aléatoire entre 0 et 10
        vitesseMaximale = 100; // La vitesse d'un camion est de 100 km/h ou 0 en cas de panne
    }
    //Cette méthode est utilisée pour régler la vitesse réelle utilisée pour la manche en cours
    @Override
    public Boolean preparePourManche(Course course ) {
        collision(course);
        if (checkForFacteurRalentissement(course)){
            vitesseCourante = 0; // en cas de panne la vitesse est de 0 km
            return true;
        }
        vitesseCourante = vitesseMaximale; // sinon la vitesse reste la même
        return false;
    }
    /**
     * La méthode checkForFacteurRalentissement() renvoie vrai si le camion tombe empanne sinon false
     */
    @Override
    protected Boolean checkForFacteurRalentissement(Course course) {
        if (empanneTourneAGauche > 0){
            empanneTourneAGauche -= 1;
            if (empanneTourneAGauche == 0){
                course.setcamionEmpanne(false);
            }
            return true;
        }
        return false;
    }
//Les camions ont 5% de chance de tomber en panne pendant 2 heures
    @Override
    public void collision(Course course) {
        if (Course.random.nextInt(100) + 1 < 5){
            empanneTourneAGauche = 2;
            course.setcamionEmpanne(true);
        }
    }
}





public class Moto extends Vehicule {

    public Moto (CarType carType, int numOfMoto) {
        super(carType);
        nom = String.valueOf(carType) + numOfMoto; //Les motos sont appelées "Moto 1", "Moto 2", "Moto 3",...
// Il s'agit d'une valeur unique basée sur l'ordre de création,
// et stockée dans la propriété du nom
        vitesseMaximale = 100;
        // la vitesse normale de la moto
    }
    //Cette méthode est utilisée pour régler la vitesse réelle utilisée pour la manche en cours
    @Override
    public Boolean preparePourManche(Course course ) {
        //Sous la pluie, les motos ralentissent d'une valeur aléatoire entre 5 et 50 km/h.
        if (checkForFacteurRalentissement(course)){
            vitesseCourante = vitesseMaximale - (course.random.nextInt(45) + 5);
            return true;
        }
        vitesseCourante = vitesseCourante;
        return false;
    }

    @Override
    // methode qui check si il y'a de la pluie
    protected Boolean checkForFacteurRalentissement(Course course ) {
        if (course.getMeteo().getPluie()){
            return true;
        }
        return false;
    }
}

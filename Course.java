

import java.util.*;
import java.util.function.ToLongFunction;

public class Course {
    public static final java.util.Random random = new Random();
    private Boolean camionEmpanne = false;
    private List<Vehicule> listeDesVehicules = new ArrayList<>();
    private Meteo meteo  = new Meteo ();

    public Course () {
        creeVehicules();
        simulerCourse();
    }


    public List<Vehicule> getListeDesVehicules() {
        return listeDesVehicules;
    }

    private int getNumOfCars() {
        return listeDesVehicules.size();
    } //nombre des vehicules

    public Boolean getcamionEmpanne() {
        return camionEmpanne;
    }

    public Meteo  getMeteo() {
        return meteo;
    } //si il pleut ou pas

    public void setcamionEmpanne(Boolean camionEmpanne) {
        this.camionEmpanne  = camionEmpanne;
    }

    /**
     * Creation de 10 voitures , motos et camions
     **/
    private void creeVehicules(){
        Menu.startCreationVehicule();
        for (int i = 1; i <= 10; i++) {

            Voiture voiture = new Voiture((CarType.VOITURE), i);
            listeDesVehicules.add(voiture);
            Menu.vehiculeCree(voiture);

            Moto  moto  = new Moto ((CarType.MOTO), i);
            listeDesVehicules.add(moto );
            Menu.vehiculeCree(moto);


            Camion camion = new Camion ((CarType.CAMION), i);
            listeDesVehicules.add(camion);
            Menu.vehiculeCree(camion);

        }
    }
    /**
     * Simule le passage du temps en avançant le temps et
     * le déplacement des véhicules pendant toute la durée d'une course.
     */

    private void simulerCourse(){
        Menu.startCourse();
        for (int i = 1; i <= 50; i++) {
            Menu.newManche(i);
            for (Vehicule vehicule : listeDesVehicules) {
                meteo.setPluie();
                Boolean status = vehicule.preparePourManche (this);
                Menu.StatusCourrante(vehicule, status);
                vehicule.moveForUneHeure();
                Menu.positionCourante(vehicule);
            }
        }
        afficherResultatCourse();
    }
    /**
     * Imprime l'état de tous les véhicules. Appelé à la fin de la
     course.
     **/
    private void afficherResultatCourse(){
        // Une fonction de comparaison, qui impose un ordre total sur une certaine collection d'objets (les vehicules)
        Comparator <Vehicule> vehiculeComparator = new Comparator <Vehicule>() {

            /**
             * Methode qui compare les distances parcourus et
             * affiche les classements.
             */
            @Override
            // compare entre chaque vehicule
            public int compare (Vehicule o1, Vehicule o2) {
                if (o1.getDistanceParcouru() < o2.getDistanceParcouru()){
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(listeDesVehicules, vehiculeComparator);
        //affiche la liste finale
        Menu.resultatCourse(listeDesVehicules);
    }


    private void printResultatCourse(){} // affiche le nom des vehicule la distance parcouru et le type .

}






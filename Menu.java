



import java.util.List;


public class Menu {

    public static void startCreationVehicule(){ //creation des  vehicules
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        +"\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^B I E N V E N U E ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n"
                        +"Hello ! Bienvenue sur le simulateur de course. Commençons par créer quelques véhicules."
                        + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
    }


    public static void vehiculeCree (Vehicule vehicule){ //affichage des vehicules cree
        System.out.println("Nouveau véhicule de type : " + vehicule.getCarType() + " cree. Le modele est: " + vehicule.getNom() + "."
                + "\n**************************************************************************************************");
    }


    public static void startCourse(){ //commence la course
        System.out.println(
                        "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        +"\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^LA COURSE COMMENCE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n"
                        +"Tous les véhicules sont prêts à faire la course. Commençons !"
                                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
    }


    public static void StatusCourrante(Vehicule vehicule, Boolean bool){ //affiche si un vehicule est ralenti à cause d'un facteur ralentisseur
        if (bool){
            switch (vehicule.getCarType()) {
                case VOITURE:
                    System.out.println("Oh non!!! Vehicule " + vehicule.getNom() + "(" + vehicule.getCarType() + ")" + " est ralentie à cause d'un camion en panne. Vitesse Courrante : " + vehicule.getVitesseCourante());
                    break;
                case MOTO:
                    System.out.println("Oh non!!! Vehicule " + vehicule.getNom() + "(" + vehicule.getCarType() + ")" + " est ralentie à cause de la pluie. Vitesse Courrante : " + vehicule.getVitesseCourante());
                    break;
                case CAMION:
                    System.out.println("Oh non!!! Vehicule " + vehicule.getNom() + "(" + vehicule.getCarType() + ")" + " est ralentie à cause d'un accident. Vitesse Courrante : " + vehicule.getVitesseCourante());
                    break;
            }
        } else { //sinon s'il n'ya pas de facteurs affiche :
            System.out.println("Tout va bien. Conduite à vitesse maximale.");
        }
    }


    public static void positionCourante(Vehicule vehicule){ //affiche le resultat final de la course
        System.out.println("Vehicule de type: " + vehicule.getCarType() + " , nom : " + vehicule.getNom() + " a parcouru : " + vehicule.getDistanceParcouru() + " km."
                + "\n**************************************************************************************************");
    }


    public static void newManche(int i){ // nouvelle manche
        System.out.println("\nManche #" + i + " Commence ! "
                        + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        +"\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^NOUVELLE MANCHE^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
    }

    public static void resultatCourse(List<Vehicule> sortedListeDesVehicules){ // resulat TOTAL de la course
        System.out.println(
                        "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        +"\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^R E S U L T A T S^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                        + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");

        for (int i = 0; i < sortedListeDesVehicules.size(); i++) {
            System.out.println("^^^ Place #" + String.valueOf(i + 1) + " Type: " + sortedListeDesVehicules.get(i).getCarType() + " Nom: " + sortedListeDesVehicules.get(i).getNom()
                    + "avec distance parcouru : " + sortedListeDesVehicules.get(i).getDistanceParcouru() + "!!!"
                    + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }
    }


}

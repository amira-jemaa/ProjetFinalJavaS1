


public abstract class Vehicule {



        protected String nom;
        protected CarType carType;
        protected int vitesseMaximale;
        protected int vitesseCourante;
        protected int distanceParcouru = 0;

        public Vehicule( CarType carType) {
            this.carType = carType;
        }

        public String getNom() {
            return nom;
        }

        public  CarType getCarType() {
            return carType;
        }

        public int getVitesseMaximale() {
            return vitesseMaximale;
        }

        public int getVitesseCourante() {
            return vitesseCourante;
        }

        public int getDistanceParcouru() {
            return distanceParcouru;
        }

        public void moveForUneHeure(){
            distanceParcouru += vitesseCourante;
        }

        public abstract Boolean preparePourManche(Course Course);

        protected abstract Boolean checkForFacteurRalentissement(Course Course );



    }


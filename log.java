

    import java.util.Scanner;
    public class log {
        static Scanner scanner = new Scanner(System.in);

        public static int handleInputInt(String outputMessage){
            System.out.print(outputMessage + " ");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            return userInput;
        }
        public static void run() {


                int menuOptions = handleInputInt("\n Taper 1 pour commencer le programme:");
                if ( menuOptions != 1) {

                    try {
                        throw new NumeroInvalideException();
                    } catch (NumeroInvalideException e) {
                        e.printStackTrace();
                    }
                }
                switch (menuOptions) {
                    case 1:
                        Course course = new Course();
                        break;

                }


        }
    }


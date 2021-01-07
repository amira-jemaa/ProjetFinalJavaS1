public class NumeroInvalideException extends Exception {

    public  NumeroInvalideException ()
    {
        super("NumeroInvalideException veuillez mettre le numero correspondant!");
    }

    public NumeroInvalideException (String message)
    {
        super(message);
    }

}

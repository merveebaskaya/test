package day37exceptionsenums;

public class IllegalAgeException extends RuntimeException{

    /*
    1)Eger RuntTime Custom Exveption uretmek isterseniz RunTimeException Class a extends etmelisiniz.
     */

    public IllegalAgeException(){
        super();
    }
    public IllegalAgeException(String message){
        super(message);
    }


}

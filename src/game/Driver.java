package game;

public class Driver {
    public static void main(String[] args)
    {
        new Thread(new Display()).start();
    }
}

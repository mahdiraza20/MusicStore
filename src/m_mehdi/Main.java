package m_mehdi;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        for (int i = 0; i < 3; i++) {
            System.out.println("enter name of song number " + (i+1) + " :");
            pop.addFile(scanner.next());
        }

    }
}

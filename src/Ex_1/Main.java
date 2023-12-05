package Ex_1;

import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static org.slf4j.Logger log= LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {


        Scanner elementNumberInput = new Scanner(System.in);
        log.info("inserisci il numero di parole");
        int elemntNumber=Integer.parseInt(elementNumberInput.nextLine());

        Set<String> stringSet= new HashSet<>();

        for(int i=0; i<elemntNumber;i++){
            Scanner stringInput= new Scanner(System.in);
            log.info("inserisci la parola numero "+i+1);
            String string =stringInput.nextLine();
            stringSet.add(string);
        }
        log.info("il numero di parole scelto e' "+ stringSet.size());

        for(String u:stringSet){
            log.info(u);
        }
    }
}
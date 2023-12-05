package Ex_3;

import Ex_3.Entities.SingleContect;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;


public class Main {
    private static org.slf4j.Logger log= LoggerFactory.getLogger(Ex_1.Main.class);
    public static void main(String[] args) {

        SingleContect mario= new SingleContect("mario");
        SingleContect paolo= new SingleContect("paolo");
        SingleContect seba= new SingleContect("seba");
        SingleContect jessica= new SingleContect("jessica");
//        System.out.println(mario);
        Map<String,String> library= new HashMap();
        mario.addContact(library);
        paolo.addContact(library);
        seba.addContact(library);
        jessica.addContact(library);
        System.out.println(library);
        removeContact(library,jessica.getNumber());
        System.out.println(library);
        searchFromNumber(library, mario.getNumber());
        searchFromName(library,"paolo");


    }

    private static void removeContact(Map library ,String num){
//        String string= Integer.toString(num);
        library.remove(num);
    }
    private static void searchFromNumber(Map library ,String num){
            System.out.println(library.get(num));
        }
    private static void searchFromName(Map library ,String name){
    //        String string= Integer.toString(num);
            System.out.println(library.get(name));
        }


}

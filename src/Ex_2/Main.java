package Ex_2;

import org.slf4j.LoggerFactory;

import java.util.*;

public class Main {
    private static org.slf4j.Logger log= LoggerFactory.getLogger(Ex_1.Main.class);
    public static void main(String[] args){
        boolean a= false;
        while (!a){
            Scanner elementNumberInput = new Scanner(System.in);
            log.info("inserisci il numero di numeri o zero per uscire");
            boolean ok=false;
            int elemntNumber=0;
            while(!ok){
            try{
                 elemntNumber=Integer.parseInt(elementNumberInput.nextLine());
                 ok=true;
                }
            catch (NumberFormatException e){
                log.error("valore non corretto riprova");
            }
//
            }
            if(elemntNumber==0){
                a=true;
            }
//            orederedCasualNumber(elemntNumber);
            orederedCasualNumberWhitouthTreeSet(elemntNumber);

        reversePrint();

        useEvenAndOdd(false);
        }
    }

        //methods




        public static void orederedCasualNumber(int num){
            Set<Integer> intSet= new TreeSet<>();
            for(int i=0;i<num;i++){
                Random rnd= new Random();
                int randomNumber= rnd.nextInt(0,1000);
                intSet.add(randomNumber);
            }
            System.out.println(intSet);
        }
        public static void orederedCasualNumberWhitouthTreeSet(int num){
            List<Integer> numbers = new ArrayList<>();
            for(int i=0;i<num;i++){
                Random rnd= new Random();
                int randomNumber= rnd.nextInt(0,1000);
                numbers.add(randomNumber);
            }
            Collections.sort(numbers);
            System.out.println(numbers);
        }
        public static void reverseOrder(List<String> list){
            List<String> reverseList = new ArrayList<>();
            List<String> originalList = new ArrayList<>();
            reverseList.addAll(list);
            originalList.addAll(list);
            Collections.reverse(reverseList);
            originalList.addAll(reverseList);
            System.out.println(originalList);
        }
        public  static void reversePrint(){
            List<String> list1= new ArrayList<>();
            list1.add("primo");
            list1.add("secondo");
            list1.add("terzo");
            list1.add("quarto");
            list1.add("quinto");
            reverseOrder(list1);
        }
        public static void evenAndOdd( List<String> list, boolean bol){
        int i=0;
        if (bol){log.info("stampo i pari");}else{log.info("stampo i dispari");}
           for(String elem: list){
               if(bol){
                    if(i%2==0){
                        log.info(elem);
                    }
               }else{
                    if(i%2!=0){
                        log.info(elem);
                    }
               }
               i++;
            }
        }

        public static void useEvenAndOdd(boolean bol){
            List<String> list1= new ArrayList<>();
            list1.add("0");
            list1.add("1");
            list1.add("2");
            list1.add("3");
            list1.add("4");
            list1.add("5");
            list1.add("6");
            log.info(list1.toString());
            evenAndOdd(list1,bol);

        }

    }




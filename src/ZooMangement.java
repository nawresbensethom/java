import java.util.Scanner;
public class ZooMangement {
    public static void main(String[] args) {
            int nbrCages = 20;
            String zooName = "My zoo";
            System.out.println(zooName + " comporte " + nbrCages + " cages ");
            Scanner scanner = new Scanner (System.in);
            boolean isValidName = false;
            while (!isValidName){
                System.out.println("Entrez le nom du zoo:(minimum 10 caracteres)");
                zooName = scanner.nextLine();
                if (zooName.length()<10){
                    isValidName = false;
                }else{
                    isValidName = true;
                }
            }
            boolean isValidNumber = false;
            while (!isValidNumber){
                System.out.println("Entrez le nombre de cages:");
                if(scanner.hasNextInt()){
                    nbrCages = scanner.nextInt();
                    if(nbrCages>0){
                        isValidNumber = true;
                    }
                }else{
                    isValidNumber = false;
                }
            }

            scanner.close();
        System.out.println(zooName + " comporte " + nbrCages + " cages ");
        }
    }

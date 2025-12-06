import java.util.Scanner;

public class ex2_2 {

    public static int getAgeCap() {
        Scanner sc = new Scanner(System.in);
        int age = 0;

        try {
            System.out.print("Entrez l'âge du capitaine : ");
            age = sc.nextInt();

            if (age < 18 || age > 65) {
                throw new AgeCapException(age);
            }
        }
        catch (AgeCapException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Entrée invalide !");
        }

        return age; // valeur (peut être fausse) mais pas d’exception propagée
    }

    public static void main(String[] args) {
        int age = getAgeCap();
        System.out.println("Âge retourné = " + age);
    }
}

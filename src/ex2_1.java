import java.util.Scanner;

public class ex2_1 {

    public static int getAgeCap() throws AgeCapException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez l'âge du capitaine : ");
        int age = sc.nextInt();

        if (age < 18 || age > 65) {
            throw new AgeCapException(age);
        }

        return age;
    }

    public static void main(String[] args) {
        try {
            int age = getAgeCap();
            System.out.println("Âge valide : " + age);
        }
        catch (AgeCapException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Autre erreur détectée !");
        }
    }
}
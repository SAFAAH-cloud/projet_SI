package capitaine;

import java.util.Scanner;

public class Capitaine {

    public static int getAgeCap() throws Exception {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        try {
            System.out.print("Entrez l'âge du capitaine : ");
            age = sc.nextInt();
            if (age < 18 || age > 65) {
                throw new AgeCapException(age + " ans n'est pas un âge valide");
            }
        } catch (AgeCapException e) {
            System.out.println("Erreur détectée : " + e.getMessage());
            throw new Exception("Une erreur s'est produite dans getAgeCap()");
        } catch (Exception e) {
            System.out.println("Erreur inattendue : " + e.getMessage());
            throw new Exception("Erreur inattendue dans getAgeCap()");
        }
        return age;
    }

    public static void main(String[] args) {
        int tentativesInvalides = 0;
        while (true) {
            try {
                int age = getAgeCap();
                System.out.println("Âge du capitaine : " + age);
                break;
            } catch (Exception e) {
                tentativesInvalides++;
                System.out.println("Tentative invalide #" + tentativesInvalides);
            }
        }
    }
}

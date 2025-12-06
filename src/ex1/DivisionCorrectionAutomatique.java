package ex1;/*
public class DivisionSansException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int resultat = a / b; // division par zéro
        System.out.println("Résultat : " + resultat);
    }
}
class DivisionAvecTryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int resultat = a / b;
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            System.out.println("Une exception a été levée !");
        }
    }
}

class DivisionAvecMessage {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int resultat = a / b;
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro impossible !");
        }
    }
}*/

 class DivisionCorrectionAutomatique {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int resultat = a / b;
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            System.out.println("Division par zéro détectée, le diviseur sera remplacé par 1.");
            int resultat = a / 1;
            System.out.println("Résultat corrigé : " + resultat);
        }finally {
            System.out.println("Le programme execute quelque soit la situation");
        }
        System.out.println("Le programme est terminer!");
    }
}


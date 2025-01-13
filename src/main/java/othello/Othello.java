package othello;

public class Othello {
    public static void main(String[] args) {
        Partie partie = new Partie(8);

        partie.afficher();
        partie.choix();
    }
}

package tp1;

public class point {
    private int abscisse;
    private int ordonnee;
    public point(int x, int y) {
        abscisse = x;
        ordonnee = y;
    }
    public point(int x) {
        abscisse = x;
        ordonnee = 2*x;
    }
    void transHor(int d) {
        abscisse = abscisse + d;
    }
    void transVer(int d) {
        ordonnee = ordonnee + d;
    }

    void affiche() {
        System.out.println("(" + abscisse + "," + ordonnee + ")");
    }
    public static void main(String[] args) {
        point p1 = new point(2, 3);
        p1.affiche();
        p1.transHor(5);
        p1.affiche();
        p1.transVer(4);
        p1.affiche();
        point p2 = new point(7);
        p2.affiche();
    }
}
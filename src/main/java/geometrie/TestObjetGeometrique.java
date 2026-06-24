package geometrie;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] objets = new ObjetGeometrique[2];
        objets[0] = new Cercle(3.0);
        objets[1] = new Rectangle(4.0, 5.0);

        for (ObjetGeometrique objet : objets) {
            System.out.println("perimetre : " + objet.perimetre() + " - surface : " + objet.surface());
        }
    }
}

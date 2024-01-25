import java.util.UUID;

public class PermisConduir {
    private UUID id;
    private String nom;
    private String tipus;
    private int punts;
    public PermisConduir(String nom, String tipus, int punts) {
        this.id = UUID.randomUUID();
        this.nom = nom;
        this.tipus = tipus;
        this.punts = punts;
    }

    public String imprimirPermis() {
        return "PermisConduir{" +
                "id='" + id + '\'' +
                "nom='" + nom + '\'' +
                ", tipus='" + tipus + '\'' +
                ", punts=" + punts +
                '}';
    }
    public void restarPunts(int puntsRestar){
        this.punts = this.punts - puntsRestar;
    }
}

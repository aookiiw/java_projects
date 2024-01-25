import java.util.Scanner;

public class CotxeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Model de cotxe1");
        String modelCotxe1 = input.nextLine();
        System.out.println("Matriculade cotxe1");
        String matriculaCotxe1 = input.nextLine();


        System.out.println("Model de cotxe2");
        String modelCotxe2 = input.nextLine();
        System.out.println("Matriculade cotxe2");
        String matriculaCotxe2 = input.nextLine();

        Cotxe cotxe1 = new Cotxe();
        Cotxe cotxe2 = new Cotxe();

        cotxe1.setModel(modelCotxe1);
        cotxe1.setMatricula(matriculaCotxe1);

        cotxe2.setModel(modelCotxe2);
        cotxe2.setMatricula(matriculaCotxe2);

        System.out.println("El model de cotxe 1 es " + cotxe1.getModel() + " i la matricula es " + cotxe1.getMatricula());
        System.out.println("El model de cotxe 2 es " + cotxe2.getModel() + " i la matricula es " + cotxe2.getMatricula());

    }
}

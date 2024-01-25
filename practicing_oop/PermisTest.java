import java.util.ArrayList;
public class PermisTest {

    public static void main(String[] args) {
        ArrayList<PermisConduir> permisConduirList = new ArrayList<>();
        String name1 = "Karim";
        String tipus1 = "CarnetA";
        int punts1 = 30;

        PermisConduir newPermis = new PermisConduir(name1, tipus1, punts1);
        permisConduirList.add(newPermis);

        name1 = "Mirak";
        tipus1 = "Atenrac";
        punts1 = 28;

        PermisConduir newPermis2 = new PermisConduir(name1, tipus1, punts1);
        permisConduirList.add(newPermis2);

        for (PermisConduir permisConduir: permisConduirList){
            System.out.println(permisConduir.imprimirPermis());
        }

        for (PermisConduir permisConduir: permisConduirList) {
            permisConduir.restarPunts(15);
        }
        System.out.println("- - - - - - - - - - - AFTER MAKING CHANGES - - - - - - - - - - -");
        for (PermisConduir permisConduir: permisConduirList){
            System.out.println(permisConduir.imprimirPermis());
        }

    }

}

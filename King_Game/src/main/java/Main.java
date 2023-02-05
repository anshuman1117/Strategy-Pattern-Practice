import Behaviours.WeaponBehaviour;
import Model.King;
import Model.Knight;
import Model.Queen;
import Weapons.AxeBehaviour;
import Weapons.KnifeBehaviour;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start the knight game!");

        King marcusAurelius = new King();
        Queen raniChennama = new Queen();
        Knight chetakHorse = new Knight();

        WeaponBehaviour weapon = new AxeBehaviour();
        marcusAurelius.setWeaponBehaviour(weapon);

        marcusAurelius.deployWeapon();

        System.out.println("Okay Bye!");

        weapon = new KnifeBehaviour();
        marcusAurelius.setWeaponBehaviour(weapon);

        marcusAurelius.deployWeapon();

        System.out.println("Final bye!");
    }
}
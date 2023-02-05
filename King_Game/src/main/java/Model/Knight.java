package Model;

import Behaviours.WeaponBehaviour;

public class Knight {

    WeaponBehaviour weaponBehaviour;

    public Knight() {
    }

    public Knight(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public void deployWeapon(){
        weaponBehaviour.useWeapon();
    }

    public WeaponBehaviour getWeaponBehaviour() {
        return weaponBehaviour;
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

}

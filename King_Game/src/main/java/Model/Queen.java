package Model;

import Behaviours.WeaponBehaviour;

public class Queen {

    WeaponBehaviour weaponBehaviour;

    public Queen() {
    }

    public Queen(WeaponBehaviour weaponBehaviour) {
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


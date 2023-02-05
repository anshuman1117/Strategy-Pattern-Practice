package Model;

import Behaviours.WeaponBehaviour;

public class King {
    WeaponBehaviour weaponBehaviour;

    public King() {
    }

    public King(WeaponBehaviour weaponBehaviour) {
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

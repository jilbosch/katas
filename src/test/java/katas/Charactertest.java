package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Charactertest {

    @Test
    public void characteStartsWithCorredAtributes() {
        var fighter = new Character();
        assertEquals(1000, fighter.getHealth());
        assertEquals(1, fighter.getLevel());
        assertTrue(fighter.isAlive());
    }


    @Test
    void characterCanHealAnotherCharacter() {
        var attacker = new Character();
        var victim = new Character();
        attacker.attacksOther(victim, 50);
        attacker.healOther(victim, 10);
        assertEquals(960, victim.getHealth());
    }

    private void assertEquals(int i, int health) {
    }

    @Test
    void characterAttacksAnotherCaracterAndSubstractFromHealth() {
        var attacker = new Character();
        var victim = new Character();
        attacker.attacksOther(victim, 50);
        assertEquals(950, victim.getHealth());
    }

    @Test
    void deadCharacterCannotBeHealed() {
        var attacker = new Character();
        var victim = new Character();
        attacker.attacksOther(victim, 1500);

        attacker.healOther(victim, 600);
        assertEquals(950, victim.getHealth());
    }

    @Test
    void CharacterNotRize1000Health() {
        var attacker = new Character();
        var victim = new Character();
        attacker.attacksOther(victim, 500);

        attacker.healOther(victim, 600);
        assertEquals(1000, victim.getHealth());
    }

    @Test
    void CharacterCanNotDamageItSelf() {
        var attacker = new Character();

        attacker.attacksOther(attacker, 500);

        assertEquals(1000, attacker.getHealth());
    }

    @Test
    void CharacterCanOnlyHealItSelf() {
        var attacker = new Character();
        var victim = new Character();

        attacker.attacksOther(attacker, 500);

        assertEquals(1000, attacker.getHealth());
    }

    @Test
    void CharacterLevel5orMajDamageReduced50Percent() {
        var attacker = new Character();
        var victim = new Character();
        victim.setLevel(8);

        attacker.attacksOther(victim, 100);

        assertEquals(950, victim.getHealth());
    }

    @Test
    void CharacterAttackMaxRange() {
        var fighter = new Character();
        assertEquals(1000, fighter.getHealth());
        assertEquals(1, fighter.getLevel());
        assertEquals(fighter.MaxRange, fighter.getMaxRange());
        assertTrue(fighter.isAlive());
    }

}
package pattern.behavioral.strategy;

import pattern.behavioral.strategy.attack.MissileStrategy;
import pattern.behavioral.strategy.attack.PunchStrategy;
import pattern.behavioral.strategy.moving.FlyingStrategy;
import pattern.behavioral.strategy.moving.WalkingStrategy;
import pattern.behavioral.strategy.robot.Atom;
import pattern.behavioral.strategy.robot.Robot;
import pattern.behavioral.strategy.robot.TaekwonV;

public class StrategyMain {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        /* 수정된 부분: 전략 변경 방법 */
        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());
        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        /* 아래부터는 동일 */
        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();
        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}

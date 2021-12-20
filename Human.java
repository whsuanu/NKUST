public class Human {
    public static void main(String[] args) {
        human_struction cleo = new human_struction("弓箭手");
        cleo.HP=20000;
        cleo.MP=30000;
        cleo.Att=50000;
        cleo.performance();
        cleo.skill("攻擊");
        cleo.skill("詠唱","咒語卡 捆繩");
        cleo.wearing("巫師長袍");
        System.out.println();
    }
}

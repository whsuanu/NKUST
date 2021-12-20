import java.util.ArrayList;
import java.util.List;

public class human_struction {
    int HP = 0;
    int MP = 0;
    int Att = 0;
    String Equipment_name;
    private List<String> weapons = new ArrayList<String>();

    human_struction(String name){Equipment_name = name;}
    public void wearing(String wp_name){
        weapons.add(wp_name);
        System.out.println(call_value("name")+"==>新增裝備"+wp_name);
        performance();
    }
    public void skill(String type){
        if(type=="攻擊")
            System.out.printf("%s!發動攻擊\n",call_value("name"));
        else
            System.out.printf("技能錯誤");
    }
    public void skill(String type,String skillname){
        if(type=="詠唱"&&!(skillname.isEmpty()))
        System.out.printf("%s使用%s!\n",call_value("name"),(skillname));
        else
            System.out.printf("技能錯誤\n");

    }
    public void performance(){
        System.out.printf("%s(HP=%s,Att=%s)",
                call_value("name"),call_value("HP"),call_value("MP"),call_value("Att"));
        System.out.printf("目前裝備");
        for(String x : weapons)
            System.out.printf(x +"");
        System.out.println();
    }
private String call_value(String value){
        switch (value){
            case "name":
                return this.Equipment_name;
            case "HP":
                return String.valueOf(this.HP);
            case"MP":
                return String.valueOf(this.MP);
            case "Att":
                return String.valueOf(this.Att);
            default:
                break;
        }
        return "ERROR";
}

}

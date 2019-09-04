import java.util.ArrayList;

public class No3 {
    public static ArrayList<String> list = new ArrayList();

    public static void main(String[] args){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("["+i+"] " + list.get(i));
        }
    }

    private void method(String in){
        list.add(in);
    }
}

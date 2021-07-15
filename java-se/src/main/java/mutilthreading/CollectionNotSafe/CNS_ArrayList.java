package mutilthreading.CollectionNotSafe;

import java.util.ArrayList;
import java.util.UUID;

/**
 * @author by yorua
 * @classname CNS_ArrayList
 * @description TODO
 * @date 2021/1/18 7:45 下午
 */
public class CNS_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                arrayList.add(UUID.randomUUID().toString().substring(0, 5));
                System.out.println(arrayList);
            }, String.valueOf(i)).start();
        }
    }
}

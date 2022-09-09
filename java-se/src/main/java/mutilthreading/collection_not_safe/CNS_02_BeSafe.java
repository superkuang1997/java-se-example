package mutilthreading.collection_not_safe;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author by yorua
 * @classname CNS_02_BeSafe
 * @description TODO
 * @date 2021/1/18 8:04 下午
 */
public class CNS_02_BeSafe {
    public static void main(String[] args) {
        Collections.synchronizedList(new ArrayList<>());
    }
}

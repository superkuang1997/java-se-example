package mutilthreading.Volatile;

/**
 * @author by yorua
 * @classname Volatile_02
 * @description TODO
 * @date 2021/1/24 11:59
 */
public class Volatile_02 {
    volatile boolean shuntDownRequested;

    public void shutdown() {
        shuntDownRequested = true;
    }

    public void doWork() {
        while (!shuntDownRequested) {
            System.out.println("test");
        }
    }
}

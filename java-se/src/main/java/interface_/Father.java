package interface_;

/**
 * @author by yorua
 * @classname Father
 * @description TODO
 * @date 2021/6/20 16:03
 */
public interface Father {

    void query();

    default void showStatus() {
        System.out.println("...");
    }

}

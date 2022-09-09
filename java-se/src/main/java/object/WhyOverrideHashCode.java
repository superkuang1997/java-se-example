package object;

import commons.bean.User;

import java.util.HashSet;
import java.util.Set;

/**
 * @author by yorua
 * @date 2021/9/16 22:07
 */
public class WhyOverrideHashCode {
    public static void main(String[] args) {
        User user1 = new User(1, "老哥", 18);
        User user2 = new User(1, "老哥", 18);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        Set<User> set = new HashSet<>();
        System.out.println(set.add(user1));
        System.out.println(set.add(user2));
    }
}

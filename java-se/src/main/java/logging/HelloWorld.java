package logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author by yorua
 * @classname HelloWorld
 * @description TODO
 * @date 2021/5/20 10:18
 */
public class HelloWorld {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("hello world");
    }
}

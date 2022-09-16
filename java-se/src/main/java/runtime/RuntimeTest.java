package runtime;

import org.junit.Test;

import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author by yorua
 * @date 2022/9/16 20:27
 */
public class RuntimeTest {
    @Test
    public void runShell() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.getProperty("user.dir"))
                .append("/src/main/resources")
                .append("/test.sh");
        List<String> strList = new ArrayList<>();
        try {
            System.out.println(Arrays.toString(new String[]{"/bin/sh", "-c", sb.toString()}));
            Process process = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", sb.toString()}, null, null);
            InputStreamReader ir = new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8);
            LineNumberReader input = new LineNumberReader(ir);
            process.waitFor();
            String line;
            while ((line = input.readLine()) != null) {
                strList.add(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(strList);
    }

    @Test
    public void runPython() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.getProperty("user.dir"))
                .append("/src/main/resources")
                .append("/test.py");
        List<String> strList = new ArrayList<>();
        try {
            System.out.println(Arrays.toString(new String[]{"python", sb.toString()}));
            Process process = Runtime.getRuntime().exec(new String[]{"python", sb.toString()}, null, null);
            InputStreamReader ir = new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8);
            LineNumberReader input = new LineNumberReader(ir);
            process.waitFor();
            String line;
            while ((line = input.readLine()) != null) {
                strList.add(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(strList);
    }
}

package test.ai.cloud.matcher;

import com.ai.cloud.skywalking.plugin.PluginBootstrap;

public class ExclusionMatcherTest {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        new PluginBootstrap().start();
        TestMatcherClass testMatcherClass = (TestMatcherClass) Class.forName("test.ai.cloud.matcher.TestMatcherClass").newInstance();

        testMatcherClass.set();
        testMatcherClass.seta("a");
        testMatcherClass.get("a");
        testMatcherClass.find();
    }

}

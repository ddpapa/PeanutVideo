package org.peanutvideo.initiator;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ShellCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MyBatisGeneratorInitiator {
    @Test
    public void InitGenerator() throws IOException, XMLParserException, SQLException, InterruptedException, InvalidConfigurationException {
        // 放置生成过程中警告信息的集合对象
        List<String> warnings = new ArrayList<>();
        // 加载配置文件
        File configFile = new File("src/main/resources/mybatis-generator.xml");
        // 配置解析类
        ConfigurationParser cp = new ConfigurationParser(warnings);
        // 配置解析类解析配置文件并生成Configuration配置对象
        Configuration config = cp.parseConfiguration(configFile);
        // 负责如何处理重复文件
        ShellCallback callback = new DefaultShellCallback(true);
        // 逆向工程对象
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        // 执行逆向文件生成操作
        myBatisGenerator.generate(null);
    }
}

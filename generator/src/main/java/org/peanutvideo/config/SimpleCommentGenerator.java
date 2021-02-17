package org.peanutvideo.config;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * 自定义生成注释生成规则
 */
public class SimpleCommentGenerator implements CommentGenerator {
    /**
     * 属性，即配置在 commentGenerator 标签之内的 Property 标签
     */
    private Properties properties = new Properties();
    /**
     * 是否取消生成日期
     */
    private boolean suppressDate = false;
    /**
     * 是否取消生成注释
     */
    private boolean suppressAllComments = false;
    /**
     * 是否生成数据库注释
     */
    private boolean addRemarkComments = true;
    /**
     * 日期格式化
     */
    private SimpleDateFormat dateFormat;

    public SimpleCommentGenerator() {
    }

    @Override
    public void addConfigurationProperties(Properties properties) {
        this.properties.putAll(properties);
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (this.addRemarkComments && !this.suppressAllComments) {
            String remarks = introspectedColumn.getRemarks();
            field.addJavaDocLine("/** " + remarks + " */");
        }
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if (!this.suppressAllComments && this.addRemarkComments) {
            String author = properties.getProperty("author");
            String dateFormat = properties.getProperty("dateFormat", "yyyy-MM-dd");
            SimpleDateFormat dateFormatter = new SimpleDateFormat(dateFormat);

            // 获取表注释
            String remarks = introspectedTable.getRemarks();

            topLevelClass.addJavaDocLine("/**");
            topLevelClass.addJavaDocLine("* " + remarks + "\t" + introspectedTable.getFullyQualifiedTable());
            topLevelClass.addJavaDocLine("*");
            topLevelClass.addJavaDocLine("* @author " + author);
            topLevelClass.addJavaDocLine("* @date " + dateFormatter.format(new Date()));
            topLevelClass.addJavaDocLine("*/");
        }
    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        if (!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            innerClass.addJavaDocLine("/**");
            innerClass.addJavaDocLine(" * ");
            sb.append(introspectedTable.getFullyQualifiedTable() + " 对象");
            innerClass.addJavaDocLine(sb.toString());
            this.addJavadocTag(innerClass);
            innerClass.addJavaDocLine(" */");
        }
    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean b) {

    }

    @Override
    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {

    }

    @Override
    public void addComment(XmlElement xmlElement) {

    }

    @Override
    public void addRootComment(XmlElement xmlElement) {

    }

    protected void addJavadocTag(JavaElement javaElement) {

    }
}

package com.dxh.generator;
  
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.Plugin.ModelClassType;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
  
/** 
 * @author pan.wei 
 * @date 2011-11-30 下午08:36:11 
 */  
public class OraclePaginationPlugin extends PluginAdapter {  

	@Override  
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,  
            IntrospectedTable introspectedTable) { 
    	CreateOrCriteria(topLevelClass, introspectedTable);  
    	List<Method> methods = topLevelClass.getMethods();
    	for(Method method:methods){
    		String name = method.getName();
			if("or".equals(name)){
				method.addBodyLine(1, "if(this.oredCriteria.size()>1){");
				method.addBodyLine(2, "criteria.setLogicType(\"or\");");
				method.addBodyLine(3, "}");
    		}else if("createCriteria".equals(name)){
    			List<String> body=new ArrayList<String>();
    			body.add("Criteria criteria = createCriteriaInternal();");
    			body.add("oredCriteria.add(criteria);");
    			body.add("if(this.oredCriteria.size()>1){");
    			body.add("criteria.setLogicType(\"and\");");
    			body.add("}"); 
    			body.add("return criteria;");
    			List<String> bodyLines = method.getBodyLines();
    			while(bodyLines.size()>0){
    				bodyLines.remove(bodyLines.size()-1);
    			}
    			bodyLines.addAll(body);
    		}
    	}
        return super.modelExampleClassGenerated(topLevelClass,  
                introspectedTable);  
    }

	private void CreateOrCriteria(TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		List<InnerClass> innerClasses = topLevelClass.getInnerClasses();
    	List<Method> newCriteriaMethods=new ArrayList<Method>();
    	List<Method> newGeneratedMethods=new ArrayList<Method>();
    	InnerClass criteriaInnerClass=null;
    	InnerClass generatedCriteria=null;
    	InnerClass criterionInnerClass=null;
    	for(InnerClass clazz:innerClasses){
    		if("Criteria".equals(clazz.getType().toString())){
    			criteriaInnerClass=clazz;
    			List<Method> methods = clazz.getMethods();
    			for(Method method:methods){
    				String name = method.getName();
    				if("Criteria".equals(name)||!name.startsWith("and")){
    	    			continue;
    	    		}
    				
    				List<Parameter> parameters = method.getParameters();
    				List<String> bodyLines = method.getBodyLines();
    				FullyQualifiedJavaType returnType = method.getReturnType();
    				Method orMethod=new Method();
    				orMethod.setVisibility(JavaVisibility.PUBLIC); 
    				orMethod.setName("or"+name.substring(3));
    				orMethod.setReturnType(returnType);
    				orMethod.addBodyLines(bodyLines);
    				orMethod.addBodyLine(1, "if(this.getAllCriteria().size()>1){");
    				orMethod.addBodyLine(2, "Criterion criterion = this.getAllCriteria().get(this.getAllCriteria().size()-1);");
    				orMethod.addBodyLine(3, "criterion.setLogicType(\"or\");");
    				orMethod.addBodyLine(4, "}");
    				for(Parameter p:parameters){
    					orMethod.addParameter(p);
    				}
    				newCriteriaMethods.add(orMethod);
    				
    				method.addBodyLine(1, "if(this.getAllCriteria().size()>1){");
    				method.addBodyLine(2, "Criterion criterion = this.getAllCriteria().get(this.getAllCriteria().size()-1);");
    				method.addBodyLine(3, "criterion.setLogicType(\"and\");");
    				method.addBodyLine(4, "}");
    			}
    		}
    		
    		if("GeneratedCriteria".equals(clazz.getType().toString())){
    			generatedCriteria=clazz;
    			List<Method> methods = clazz.getMethods();
    			for(Method method:methods){
    				String name = method.getName();
    				if("GeneratedCriteria".equals(name)||!name.startsWith("and")){
    	    			continue;
    	    		}
    				
    				List<Parameter> parameters = method.getParameters();
    				List<String> bodyLines = method.getBodyLines();
    				FullyQualifiedJavaType returnType = method.getReturnType();
    				Method orMethod=new Method();
    				orMethod.setVisibility(JavaVisibility.PUBLIC); 
    				orMethod.setName("or"+name.substring(3));
    				orMethod.setReturnType(returnType);
    				orMethod.addBodyLines(bodyLines);
    				orMethod.addBodyLine(1, "if(this.getAllCriteria().size()>1){");
    				orMethod.addBodyLine(2, "Criterion criterion = this.getAllCriteria().get(this.getAllCriteria().size()-1);");
    				orMethod.addBodyLine(3, "criterion.setLogicType(\"or\");");
    				orMethod.addBodyLine(4, "}");
    				for(Parameter p:parameters){
    					orMethod.addParameter(p);
    				}
    				newGeneratedMethods.add(orMethod);
    				
    				method.addBodyLine(1, "if(this.getAllCriteria().size()>1){");
    				method.addBodyLine(2, "Criterion criterion = this.getAllCriteria().get(this.getAllCriteria().size()-1);");
    				method.addBodyLine(3, "criterion.setLogicType(\"and\");");
    				method.addBodyLine(4, "}");
    			}
    		}
    		
    		if("Criterion".equals(clazz.getType().toString())){
    			criterionInnerClass=clazz;
    		}
    	}
    	for(Method m:newCriteriaMethods){
    		criteriaInnerClass.addMethod(m);
    	}
    	
    	for(Method m:newGeneratedMethods){
    		generatedCriteria.addMethod(m);
    	}
    	
    	addLogicTypeMethod(generatedCriteria);
    	addLogicTypeMethod(criterionInnerClass);
		
        addPage(topLevelClass, introspectedTable, "page");  
        addDialect(topLevelClass, introspectedTable, "dialect");
	}

	private void addLogicTypeMethod(InnerClass criterionInnerClass) {
		Field field=new Field();
    	FullyQualifiedJavaType type=new FullyQualifiedJavaType("java.lang.String");
		field.setType(type);
		field.setVisibility(JavaVisibility.PRIVATE);
		field.setName("logicType=\"\"");
		criterionInnerClass.addField(field);
		
		Method setmethod=new Method();
		setmethod.setName("setLogicType");
		setmethod.addParameter(new Parameter(new FullyQualifiedJavaType("java.lang.String"), "logicType"));
		setmethod.addBodyLine("this.logicType=logicType;");
		criterionInnerClass.addMethod(setmethod);
		
		Method getmethod=new Method();
		getmethod.setName("getLogicType");
		getmethod.addBodyLine("return this.logicType;");
		getmethod.setReturnType(new FullyQualifiedJavaType("java.lang.String"));
		getmethod.setVisibility(JavaVisibility.PUBLIC);
		criterionInnerClass.addMethod(getmethod);
	}  
  
    @Override  
    public boolean sqlMapDocumentGenerated(Document document,  
            IntrospectedTable introspectedTable) {  
        XmlElement parentElement = document.getRootElement(); 
        
        // 产生分页语句前半部分  
        XmlElement paginationPrefixElement = new XmlElement("sql");  
        paginationPrefixElement.addAttribute(new Attribute("id",  
                "OracleDialectPrefix"));  
        XmlElement pageStart = new XmlElement("if");  
        pageStart.addAttribute(new Attribute("test", "page != null"));  
        XmlElement pageDialect1 = new XmlElement("if");  
        pageDialect1.addAttribute(new Attribute("test", "dialect == 'oracle'"));  
        pageStart.addElement(pageDialect1);  
        pageDialect1.addElement(new TextElement(  
                "select * from ( select row_.*, rownum rownum_ from ( "));  
        paginationPrefixElement.addElement(pageStart);  
        parentElement.addElement(paginationPrefixElement);  
  
        // 产生分页语句后半部分  
        XmlElement paginationSuffixElement = new XmlElement("sql");  
        paginationSuffixElement.addAttribute(new Attribute("id",  
                "OracleDialectSuffix"));  
        XmlElement pageEnd = new XmlElement("if");  
        pageEnd.addAttribute(new Attribute("test", "page != null"));  
        XmlElement pageDialect2 = new XmlElement("if");  
        pageDialect2.addAttribute(new Attribute("test", "dialect == 'oracle'"));  
        pageEnd.addElement(pageDialect2);  
        pageDialect2.addElement(new TextElement(  
                "<![CDATA[ ) row_ ) where rownum_ > #{page.startRow} and rownum_ <= #{page.endRow} ]]>"));  
          
        //----- mysql语句。  
        XmlElement mysqlDialect = new XmlElement("if");  
        mysqlDialect.addAttribute(new Attribute("test", "dialect == 'mysql'"));  
        pageEnd.addElement(mysqlDialect);  
        mysqlDialect.addElement(new TextElement(  
                "limit #{page.startRow} , #{page.endRow}"));  
        paginationSuffixElement.addElement(pageEnd);  
          
        parentElement.addElement(paginationSuffixElement);  
  
        return super.sqlMapDocumentGenerated(document, introspectedTable);  
    }  

	@Override  
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(  
            XmlElement element, IntrospectedTable introspectedTable) {  
        XmlElement pageStart = new XmlElement("include"); //$NON-NLS-1$     
        pageStart.addAttribute(new Attribute("refid", "OracleDialectPrefix"));  
        element.getElements().add(0, pageStart);  
  
        XmlElement isNotNullElement = new XmlElement("include"); //$NON-NLS-1$     
        isNotNullElement.addAttribute(new Attribute("refid",  
                "OracleDialectSuffix"));  
        element.getElements().add(isNotNullElement);  
  
        return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element,  
                introspectedTable);  
    }  
  
    /** 
     * @param topLevelClass 
     * @param introspectedTable 
     * @param name 
     */  
    private void addDialect(TopLevelClass topLevelClass,  
            IntrospectedTable introspectedTable, String name) {  
        CommentGenerator commentGenerator = context.getCommentGenerator();  
        Field field = new Field();  
        field.setVisibility(JavaVisibility.PRIVATE);  
        field.setType(new FullyQualifiedJavaType("String"));  
        field.setName(name + " = \"mysql\"");  
        commentGenerator.addFieldComment(field, introspectedTable);  
        topLevelClass.addField(field);  
        char c = name.charAt(0);  
        String camel = Character.toUpperCase(c) + name.substring(1);  
        Method method = new Method();  
        method.setVisibility(JavaVisibility.PUBLIC);  
        method.setName("set" + camel);  
        method.addParameter(new Parameter(new FullyQualifiedJavaType(  
                "String"), name));  
        method.addBodyLine("this." + name + "=" + name + ";");  
        commentGenerator.addGeneralMethodComment(method, introspectedTable);  
        topLevelClass.addMethod(method);  
        method = new Method();  
        method.setVisibility(JavaVisibility.PUBLIC);  
        method.setReturnType(new FullyQualifiedJavaType(  
                "String"));  
        method.setName("get" + camel);  
        method.addBodyLine("return " + name + ";");  
        commentGenerator.addGeneralMethodComment(method, introspectedTable);  
        topLevelClass.addMethod(method);  
    }  
      
    /** 
     * @param topLevelClass 
     * @param introspectedTable 
     * @param name 
     */  
    private void addPage(TopLevelClass topLevelClass,  
            IntrospectedTable introspectedTable, String name) {  
        topLevelClass.addImportedType(new FullyQualifiedJavaType(  
                "com.dxh.base.domain.entity.Page"));  
        CommentGenerator commentGenerator = context.getCommentGenerator();  
        Field field = new Field();  
        field.setVisibility(JavaVisibility.PROTECTED);  
        field.setType(new FullyQualifiedJavaType("com.dxh.base.domain.entity.Page"));  
        field.setName(name);  
        commentGenerator.addFieldComment(field, introspectedTable);  
        topLevelClass.addField(field);  
        char c = name.charAt(0);  
        String camel = Character.toUpperCase(c) + name.substring(1);  
        Method method = new Method();  
        method.setVisibility(JavaVisibility.PUBLIC);  
        method.setName("set" + camel);  
        method.addParameter(new Parameter(new FullyQualifiedJavaType(  
                "com.dxh.base.domain.entity.Page"), name));  
        method.addBodyLine("this." + name + "=" + name + ";");  
        commentGenerator.addGeneralMethodComment(method, introspectedTable);  
        topLevelClass.addMethod(method);  
        method = new Method();  
        method.setVisibility(JavaVisibility.PUBLIC);  
        method.setReturnType(new FullyQualifiedJavaType(  
                "com.dxh.base.domain.entity.Page"));  
        method.setName("get" + camel);  
        method.addBodyLine("return " + name + ";");  
        commentGenerator.addGeneralMethodComment(method, introspectedTable);  
        topLevelClass.addMethod(method);  
    }  
  
    /** 
     * This plugin is always valid - no properties are required 
     */  
    public boolean validate(List<String> warnings) {  
        return true;  
    }

	@Override
	public boolean sqlMapExampleWhereClauseElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		List<Element> elements = element.getElements();
		while(elements.size()>0){
			elements.remove(0);
		}
		XmlElement whereElement = new XmlElement("where");
		element.addElement(whereElement);
		
		XmlElement foreachEl=new XmlElement("foreach");
		Attribute collection=new Attribute("collection", "oredCriteria");
		Attribute item=new Attribute("item", "criteria");
		Attribute separator=new Attribute("separator", "");
		foreachEl.addAttribute(collection);
		foreachEl.addAttribute(item);
		foreachEl.addAttribute(separator);
		whereElement.addElement(foreachEl);
		
		XmlElement ifEl=new XmlElement("if");
		Attribute test=new Attribute("test", "criteria.valid");
		ifEl.addAttribute(test);
		foreachEl.addElement(ifEl);
		
		ifEl.addElement(new TextElement("${criteria.logicType}"));
		
		XmlElement trimEl=new XmlElement("trim");
		Attribute prefix=new Attribute("prefix", "(");
		Attribute suffix=new Attribute("suffix", ")");
		Attribute prefixOverrides=new Attribute("prefixOverrides", "");
		trimEl.addAttribute(prefix);
		trimEl.addAttribute(suffix);
		trimEl.addAttribute(prefixOverrides);
		ifEl.addElement(trimEl);
		
		XmlElement foreachInTrimEl=new XmlElement("foreach");
		Attribute collectionTrimEl=new Attribute("collection", "criteria.criteria");
		Attribute itemTrimEl=new Attribute("item", "criterion");
		foreachInTrimEl.addAttribute(collectionTrimEl);
		foreachInTrimEl.addAttribute(itemTrimEl);
		trimEl.addElement(foreachInTrimEl);
		
		XmlElement chooseEl=new XmlElement("choose");
		foreachInTrimEl.addElement(chooseEl);
		
		XmlElement whenEl1=new XmlElement("when");
		Attribute testInWhen1=new Attribute("test", "criterion.noValue");
		whenEl1.addAttribute(testInWhen1);
		whenEl1.addElement(new TextElement("${criterion.logicType} ${criterion.condition}"));
		chooseEl.addElement(whenEl1);
		
		XmlElement whenEl2=new XmlElement("when");
		Attribute testInWhen2=new Attribute("test", "criterion.singleValue");
		whenEl2.addAttribute(testInWhen2);
		whenEl2.addElement(new TextElement("${criterion.logicType} ${criterion.condition} #{criterion.value}"));
		chooseEl.addElement(whenEl2);
		
		XmlElement whenEl3=new XmlElement("when");
		Attribute testInWhen3=new Attribute("test", "criterion.betweenValue");
		whenEl3.addAttribute(testInWhen3);
		whenEl3.addElement(new TextElement("${criterion.logicType} ${criterion.condition} #{criterion.value} and #{criterion.secondValue}"));
		chooseEl.addElement(whenEl3);
		
		XmlElement whenEl4=new XmlElement("when");
		Attribute testInWhen4=new Attribute("test", "criterion.listValue");
		whenEl4.addAttribute(testInWhen4);
		whenEl4.addElement(new TextElement("${criterion.logicType} ${criterion.condition}"));
		chooseEl.addElement(whenEl4);
		
		XmlElement foreachInWhen=new XmlElement("foreach");
		Attribute collectionWhen=new Attribute("collection", "criterion.value");
		Attribute itemWhen=new Attribute("item", "listItem");
		Attribute open=new Attribute("open", "(");
		Attribute close=new Attribute("close", ")");
		Attribute separatorWhen=new Attribute("separator", ",");
		foreachInWhen.addAttribute(collectionWhen);
		foreachInWhen.addAttribute(itemWhen);
		foreachInWhen.addAttribute(open);
		foreachInWhen.addAttribute(close);
		foreachInWhen.addAttribute(separatorWhen);
		whenEl4.addElement(foreachInWhen);
		
		foreachInWhen.addElement(new TextElement("#{listItem}"));
		
		
		return super.sqlMapExampleWhereClauseElementGenerated(element,
				introspectedTable);
	}

	@Override
	public boolean modelFieldGenerated(Field field,
			TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
			IntrospectedTable introspectedTable, ModelClassType modelClassType) {
		// TODO Auto-generated method stub
		field.getJavaDocLines().clear();
		field.getJavaDocLines().add("/**\n	*"+introspectedColumn.getRemarks()+"<br/>\n	**/");;
		return super.modelFieldGenerated(field, topLevelClass, introspectedColumn,
				introspectedTable, modelClassType);
	}

	@Override
	public void initialized(IntrospectedTable introspectedTable) {
		List<IntrospectedColumn> allColumns = introspectedTable.getAllColumns();
		for(IntrospectedColumn column:allColumns){
			String jdbcTypeName = column.getJdbcTypeName();
			if("TINYINT".equals(jdbcTypeName)){
				column.setJdbcTypeName("INTEGER");
				column.setFullyQualifiedJavaType(new FullyQualifiedJavaType("java.lang.Integer"));
			}
		}
		super.initialized(introspectedTable);
	}

	@Override
	public boolean modelGetterMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
			IntrospectedTable introspectedTable, ModelClassType modelClassType) {
		// TODO Auto-generated method stub
		method.getJavaDocLines().clear();
		method.addAnnotation("@Lable(\""+introspectedColumn.getRemarks()+"\")");
		return super.modelGetterMethodGenerated(method, topLevelClass,
				introspectedColumn, introspectedTable, modelClassType);
	}

	@Override
	public boolean modelSetterMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
			IntrospectedTable introspectedTable, ModelClassType modelClassType) {
		method.getJavaDocLines().clear();
		return super.modelSetterMethodGenerated(method, topLevelClass,
				introspectedColumn, introspectedTable, modelClassType);
	}
	
	
}   
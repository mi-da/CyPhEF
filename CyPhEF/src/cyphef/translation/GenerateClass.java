package cyphef.translation;

import java.io.File;
import java.io.IOException;

import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JPackage;

import peersim.core.Node;
import peersim.edsim.EDProtocol;

public class GenerateClass {

    public static void generate(String monitoredName, String protocolName) {
    	
    	// Instantiate a new JCodeModel
        JCodeModel codeModel = new JCodeModel();

        // Create a new package
        JPackage jp = codeModel._package("cyphef.generated."+monitoredName);
        
        // Create a new class
        JDefinedClass jc = null;
		try {
			jc = jp._class(protocolName);
		} catch (JClassAlreadyExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Implement Serializable
        jc._implements(EDProtocol.class);
        

        // Add Javadoc
//        jc.javadoc().add("A JCodeModel example.");

        // Add default constructor
        jc.constructor(JMod.PUBLIC).javadoc().add("Creates a new " + jc.name() + ".");

        // Add constant serializable id
        jc.field(JMod.STATIC | JMod.FINAL, Long.class, "serialVersionUID", JExpr.lit(1L));

        // Add private variable
//        JFieldVar quantity = jc.field(JMod.PRIVATE, Integer.class, "quantity");

//        // Add set method
//        JMethod setter = jc.method(JMod.PUBLIC, codeModel.VOID, "setQuantity");
//        setter.param(quantity.type(), quantity.name());
//        setter.body().assign(JExpr._this().ref(quantity.name()), JExpr.ref(quantity.name()));
//        setter.javadoc().add("Set the quantity.");
//        setter.javadoc().addParam(quantity.name()).add("the new quantity");
        
        // Override processEvent method
        JMethod processEvent = jc.method(JMod.PUBLIC, codeModel.VOID, "processEvent");
    
        processEvent.annotate(java.lang.Override.class);
        
        processEvent.param(codeModel.ref(Node.class),"node");
        processEvent.param(codeModel.INT,"pid");
        processEvent.param(codeModel.ref(Object.class),"event");
        
        // Override clone method
        JMethod clone = jc.method(JMod.PUBLIC, Object.class, "clone");
        
        clone.annotate(java.lang.Override.class);  
        clone.body()._return(JExpr._this());

        // Generate the code
        try {
			codeModel.build(new File("src/"),System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
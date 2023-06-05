import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = visitors.TypeChecker.ARITMETIC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ARITMETIC" + "'", str0, "ARITMETIC");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = visitors.TypeChecker.UMINUSOP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UMINUSOP" + "'", str0, "UMINUSOP");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("ARITMETIC", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione ARITMETIC non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("UMINUSOP", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione UMINUSOP non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str0 = visitors.TypeChecker.DIV;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DIV" + "'", str0, "DIV");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str0 = visitors.TypeChecker.STRINGCONCAT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CONCAT" + "'", str0, "CONCAT");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("CONCAT", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione CONCAT non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str0 = visitors.TypeChecker.BOOLEANOP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BOOLEANOP" + "'", str0, "BOOLEANOP");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione  non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        visitors.ScopingVisitor scopingVisitor0 = new visitors.ScopingVisitor();
        java.lang.Class<?> wildcardClass1 = scopingVisitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("UMINUSOP", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione UMINUSOP non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str0 = visitors.TypeChecker.POW;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "POW" + "'", str0, "POW");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility((int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        visitors.TypeChecker typeChecker0 = new visitors.TypeChecker();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility((int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 10 al tipo 10");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str0 = visitors.TypeChecker.RELOP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RELOP" + "'", str0, "RELOP");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("RELOP", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione RELOP non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility(10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        visitors.ScopingVisitor scopingVisitor0 = new visitors.ScopingVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = scopingVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = scopingVisitor0.visit(abstractSyntaxNode3);
        java.lang.Class<?> wildcardClass5 = scopingVisitor0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione hi! non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("DIV", (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Il tipo 100 e il tipo 100 sono incompatibili");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int int1 = visitors.TypeChecker.getInferenceType("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReadOp(abstractSyntaxNode1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallFunOp(abstractSyntaxNode1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = cVisitor0.visitIdExprNode(abstractSyntaxNode1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitIfStatOp(abstractSyntaxNode1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWhileOp(abstractSyntaxNode1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("CONCAT", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione CONCAT non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = cVisitor0.visitProgramOp(abstractSyntaxNode1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitConstExprNode(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitParDeclOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitIfStatOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWhileOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReturnStatOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cVisitor0.visitParDeclOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.Class<?> wildcardClass1 = cVisitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReturnStatOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitAssignOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitIfStatOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cVisitor0.visitProgramOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReadOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReadOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitFunOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(true);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallFunOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(true);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallParamOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("ERROR", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione ERROR non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cVisitor0.visitIdExprNode(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(true);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallFunOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int int1 = visitors.TypeChecker.getInferenceType("BOOLEANOP");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione hi! non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReadOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitVarDeclOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        int int1 = visitors.TypeChecker.getInferenceType("ARITMETIC");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("DIV", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione DIV non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitBiExprNode(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReadOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        java.lang.Class<?> wildcardClass3 = cVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWriteOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(true);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWriteOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReturnStatOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("UMINUSOP", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione UMINUSOP non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione  non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("BOOLEANOP", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione BOOLEANOP non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList1 = typeVisitor0.getActiveStackScope();
        java.lang.Class<?> wildcardClass2 = typeVisitor0.getClass();
        org.junit.Assert.assertNotNull(symbolTableList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitBiExprNode(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitParDeclOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cVisitor0.visitFunOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        table.SymbolTable[] symbolTableArray7 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList8 = new java.util.Stack<table.SymbolTable>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList8, symbolTableArray7);
        cVisitor0.setActiveStackScope(symbolTableList8);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitAssignOp(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cVisitor0.visitUnExprNode(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = cVisitor0.visit(abstractSyntaxNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitVarDeclOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList1 = typeVisitor0.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList2 = typeVisitor0.getActiveStackScope();
        java.lang.Class<?> wildcardClass3 = symbolTableList2.getClass();
        org.junit.Assert.assertNotNull(symbolTableList1);
        org.junit.Assert.assertNotNull(symbolTableList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cVisitor0.visitBodyOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReturnStatOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = cVisitor0.visit(abstractSyntaxNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitFunOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallParamOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 35 al tipo -1");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        table.SymbolTable[] symbolTableArray7 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList8 = new java.util.Stack<table.SymbolTable>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList8, symbolTableArray7);
        cVisitor0.setActiveStackScope(symbolTableList8);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReadOp(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        table.SymbolTable[] symbolTableArray7 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList8 = new java.util.Stack<table.SymbolTable>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList8, symbolTableArray7);
        cVisitor0.setActiveStackScope(symbolTableList8);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cVisitor0.visitParDeclOp(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("RELOP", (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Il tipo 1 e il tipo -1 sono incompatibili");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = cVisitor0.visit(abstractSyntaxNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitAssignOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitIfStatOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int int1 = visitors.TypeChecker.getInferenceType("CONCAT");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        visitors.ScopingVisitor scopingVisitor0 = new visitors.ScopingVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = scopingVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = scopingVisitor0.visit(abstractSyntaxNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = scopingVisitor0.visit(abstractSyntaxNode5);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWriteOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(true);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitIfStatOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("POW", (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Il tipo 97 e il tipo 100 sono incompatibili");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("\"\"", (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione non consentita");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cVisitor0.visitVarDeclOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        java.lang.Class<?> wildcardClass9 = cVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cVisitor0.visitParDeclOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReadOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("hi!", 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione non consentita");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitBiExprNode(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 32 al tipo 1");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitAssignOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitIdExprNode(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("ARITMETIC", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione ARITMETIC non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitBodyOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = cVisitor0.visit(abstractSyntaxNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitBodyOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        table.SymbolTable[] symbolTableArray7 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList8 = new java.util.Stack<table.SymbolTable>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList8, symbolTableArray7);
        cVisitor0.setActiveStackScope(symbolTableList8);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitBiExprNode(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("ERROR", (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione non consentita");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(true);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWhileOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitProgramOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cVisitor0.visitConstExprNode(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        visitors.TypeVisitor typeVisitor9 = new visitors.TypeVisitor();
        typeVisitor9.setHasReturn(true);
        typeVisitor9.setHasReturn(false);
        typeVisitor9.setHasReturn(false);
        java.util.Stack<table.SymbolTable> symbolTableList16 = typeVisitor9.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList16);
        nodes.AbstractSyntaxNode abstractSyntaxNode18 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolTableList16);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList1 = typeVisitor0.getActiveStackScope();
        visitors.CVisitor cVisitor2 = new visitors.CVisitor();
        java.lang.String str4 = cVisitor2.typeConverter("RELOP");
        nodes.ExprNode exprNode5 = null;
        java.lang.String str6 = cVisitor2.exprStringConverter(exprNode5);
        java.lang.String str8 = cVisitor2.typeConverter("RELOP");
        visitors.TypeVisitor typeVisitor9 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList10 = typeVisitor9.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList11 = typeVisitor9.getActiveStackScope();
        cVisitor2.setActiveStackScope(symbolTableList11);
        typeVisitor0.setActiveStackScope(symbolTableList11);
        nodes.AbstractSyntaxNode abstractSyntaxNode14 = null;
        java.lang.String str15 = typeVisitor0.visit(abstractSyntaxNode14);
        org.junit.Assert.assertNotNull(symbolTableList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR" + "'", str8, "ERROR");
        org.junit.Assert.assertNotNull(symbolTableList10);
        org.junit.Assert.assertNotNull(symbolTableList11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        table.SymbolTable[] symbolTableArray7 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList8 = new java.util.Stack<table.SymbolTable>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList8, symbolTableArray7);
        cVisitor0.setActiveStackScope(symbolTableList8);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cVisitor0.visitConstExprNode(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWriteOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 10 al tipo 1");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        table.SymbolTable[] symbolTableArray1 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList2 = new java.util.Stack<table.SymbolTable>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList2, symbolTableArray1);
        typeVisitor0.setActiveStackScope(symbolTableList2);
        java.lang.Class<?> wildcardClass5 = symbolTableList2.getClass();
        org.junit.Assert.assertNotNull(symbolTableArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        table.SymbolTable[] symbolTableArray8 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList9 = new java.util.Stack<table.SymbolTable>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList9, symbolTableArray8);
        typeVisitor7.setActiveStackScope(symbolTableList9);
        cVisitor0.setActiveStackScope(symbolTableList9);
        nodes.AbstractSyntaxNode abstractSyntaxNode13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWriteOp(abstractSyntaxNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitIdExprNode(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int int1 = visitors.TypeChecker.getInferenceType("ERROR");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("UMINUSOP", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione UMINUSOP non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 97 al tipo 0");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = cVisitor0.visit(abstractSyntaxNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("ERROR", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione non consentita");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitIfStatOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cVisitor0.visitBodyOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        table.SymbolTable[] symbolTableArray8 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList9 = new java.util.Stack<table.SymbolTable>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList9, symbolTableArray8);
        typeVisitor7.setActiveStackScope(symbolTableList9);
        cVisitor0.setActiveStackScope(symbolTableList9);
        nodes.AbstractSyntaxNode abstractSyntaxNode13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cVisitor0.visitUnExprNode(abstractSyntaxNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        int int1 = visitors.TypeChecker.getInferenceType("\"\"");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        table.SymbolTable[] symbolTableArray7 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList8 = new java.util.Stack<table.SymbolTable>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList8, symbolTableArray7);
        cVisitor0.setActiveStackScope(symbolTableList8);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cVisitor0.visitIdExprNode(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        visitors.TypeVisitor typeVisitor9 = new visitors.TypeVisitor();
        typeVisitor9.setHasReturn(true);
        typeVisitor9.setHasReturn(false);
        typeVisitor9.setHasReturn(false);
        java.util.Stack<table.SymbolTable> symbolTableList16 = typeVisitor9.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList16);
        nodes.AbstractSyntaxNode abstractSyntaxNode18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cVisitor0.visitIdExprNode(abstractSyntaxNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolTableList16);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        java.lang.String str10 = cVisitor0.visit(abstractSyntaxNode9);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitAssignOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        table.SymbolTable[] symbolTableArray7 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList8 = new java.util.Stack<table.SymbolTable>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList8, symbolTableArray7);
        cVisitor0.setActiveStackScope(symbolTableList8);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cVisitor0.visitFunOp(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        visitors.TypeVisitor typeVisitor9 = new visitors.TypeVisitor();
        typeVisitor9.setHasReturn(true);
        typeVisitor9.setHasReturn(false);
        typeVisitor9.setHasReturn(false);
        java.util.Stack<table.SymbolTable> symbolTableList16 = typeVisitor9.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList16);
        nodes.AbstractSyntaxNode abstractSyntaxNode18 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitBiExprNode(abstractSyntaxNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolTableList16);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = typeVisitor0.visit(abstractSyntaxNode1);
        java.util.Stack<table.SymbolTable> symbolTableList3 = typeVisitor0.getActiveStackScope();
        visitors.CVisitor cVisitor4 = new visitors.CVisitor();
        java.lang.String str6 = cVisitor4.typeConverter("RELOP");
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList8 = typeVisitor7.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList9 = typeVisitor7.getActiveStackScope();
        cVisitor4.setActiveStackScope(symbolTableList9);
        typeVisitor0.setActiveStackScope(symbolTableList9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(symbolTableList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
        org.junit.Assert.assertNotNull(symbolTableList8);
        org.junit.Assert.assertNotNull(symbolTableList9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        table.SymbolTable[] symbolTableArray8 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList9 = new java.util.Stack<table.SymbolTable>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList9, symbolTableArray8);
        typeVisitor7.setActiveStackScope(symbolTableList9);
        cVisitor0.setActiveStackScope(symbolTableList9);
        nodes.AbstractSyntaxNode abstractSyntaxNode13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        java.lang.String str8 = cVisitor0.typeConverter("");
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cVisitor0.visitVarDeclOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR" + "'", str8, "ERROR");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        java.lang.String str10 = cVisitor0.visit(abstractSyntaxNode9);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cVisitor0.visitBodyOp(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWriteOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cVisitor0.visitIdExprNode(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        java.lang.String str10 = cVisitor0.visit(abstractSyntaxNode9);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cVisitor0.visitFunOp(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cVisitor0.visitFunOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility((int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 35 al tipo 0");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("RELOP", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione RELOP non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        visitors.TypeVisitor typeVisitor9 = new visitors.TypeVisitor();
        typeVisitor9.setHasReturn(true);
        typeVisitor9.setHasReturn(false);
        typeVisitor9.setHasReturn(false);
        java.util.Stack<table.SymbolTable> symbolTableList16 = typeVisitor9.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList16);
        nodes.AbstractSyntaxNode abstractSyntaxNode18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cVisitor0.visitBodyOp(abstractSyntaxNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolTableList16);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione non consentita");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(true);
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        table.SymbolTable[] symbolTableArray8 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList9 = new java.util.Stack<table.SymbolTable>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList9, symbolTableArray8);
        typeVisitor7.setActiveStackScope(symbolTableList9);
        cVisitor0.setActiveStackScope(symbolTableList9);
        nodes.AbstractSyntaxNode abstractSyntaxNode13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitAssignOp(abstractSyntaxNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList1 = typeVisitor0.getActiveStackScope();
        typeVisitor0.setHasReturn(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode4 = null;
        java.lang.String str5 = typeVisitor0.visit(abstractSyntaxNode4);
        org.junit.Assert.assertNotNull(symbolTableList1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitBiExprNode(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallFunOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("\"\"", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione \"\" non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        visitors.ScopingVisitor scopingVisitor0 = new visitors.ScopingVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = scopingVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = scopingVisitor0.visit(abstractSyntaxNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = scopingVisitor0.visit(abstractSyntaxNode5);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWriteOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallParamOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallParamOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("BOOLEANOP", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione non consentita");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cVisitor0.visitVarDeclOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        visitors.TypeVisitor typeVisitor3 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList4 = typeVisitor3.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList5 = typeVisitor3.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cVisitor0.visitVarDeclOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertNotNull(symbolTableList4);
        org.junit.Assert.assertNotNull(symbolTableList5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReadOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitBiExprNode(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList8 = typeVisitor7.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList9 = typeVisitor7.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList9);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cVisitor0.visitConstExprNode(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
        org.junit.Assert.assertNotNull(symbolTableList8);
        org.junit.Assert.assertNotNull(symbolTableList9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 100 al tipo -1");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        typeVisitor0.setHasReturn(true);
        typeVisitor0.setHasReturn(false);
        java.util.Stack<table.SymbolTable> symbolTableList5 = typeVisitor0.getActiveStackScope();
        org.junit.Assert.assertNotNull(symbolTableList5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int int1 = visitors.TypeChecker.getInferenceType("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        visitors.TypeVisitor typeVisitor9 = new visitors.TypeVisitor();
        typeVisitor9.setHasReturn(true);
        typeVisitor9.setHasReturn(false);
        typeVisitor9.setHasReturn(false);
        java.util.Stack<table.SymbolTable> symbolTableList16 = typeVisitor9.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList16);
        nodes.AbstractSyntaxNode abstractSyntaxNode18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cVisitor0.visitFunOp(abstractSyntaxNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolTableList16);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = cVisitor0.visit(abstractSyntaxNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitUnExprNode(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        table.SymbolTable[] symbolTableArray7 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList8 = new java.util.Stack<table.SymbolTable>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList8, symbolTableArray7);
        cVisitor0.setActiveStackScope(symbolTableList8);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cVisitor0.visitUnExprNode(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 10 al tipo 97");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        visitors.TypeVisitor typeVisitor9 = new visitors.TypeVisitor();
        typeVisitor9.setHasReturn(true);
        typeVisitor9.setHasReturn(false);
        typeVisitor9.setHasReturn(false);
        java.util.Stack<table.SymbolTable> symbolTableList16 = typeVisitor9.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList16);
        nodes.AbstractSyntaxNode abstractSyntaxNode18 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReturnStatOp(abstractSyntaxNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolTableList16);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cVisitor0.visitConstExprNode(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("ARITMETIC", (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Il tipo -1 e il tipo 10 sono incompatibili");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWhileOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitParDeclOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("CONCAT", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione CONCAT non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList8 = typeVisitor7.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList9 = typeVisitor7.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList9);
        visitors.TypeVisitor typeVisitor11 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList12 = typeVisitor11.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList13 = typeVisitor11.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList13);
        nodes.AbstractSyntaxNode abstractSyntaxNode15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWriteOp(abstractSyntaxNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
        org.junit.Assert.assertNotNull(symbolTableList8);
        org.junit.Assert.assertNotNull(symbolTableList9);
        org.junit.Assert.assertNotNull(symbolTableList12);
        org.junit.Assert.assertNotNull(symbolTableList13);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitAssignOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        visitors.ScopingVisitor scopingVisitor0 = new visitors.ScopingVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = scopingVisitor0.visit(abstractSyntaxNode1);
        java.lang.Class<?> wildcardClass3 = scopingVisitor0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("POW", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione POW non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        java.lang.Class<?> wildcardClass7 = cVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        table.SymbolTable[] symbolTableArray8 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList9 = new java.util.Stack<table.SymbolTable>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList9, symbolTableArray8);
        typeVisitor7.setActiveStackScope(symbolTableList9);
        cVisitor0.setActiveStackScope(symbolTableList9);
        nodes.AbstractSyntaxNode abstractSyntaxNode13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitIfStatOp(abstractSyntaxNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("UMINUSOP", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione non consentita");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("ARITMETIC", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione ARITMETIC non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitIfStatOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cVisitor0.visitConstExprNode(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("\"\"");
        cVisitor0.setGlobalVarDecl(true);
        visitors.CVisitor cVisitor5 = new visitors.CVisitor();
        java.lang.String str7 = cVisitor5.typeConverter("RELOP");
        visitors.TypeVisitor typeVisitor8 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList9 = typeVisitor8.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList10 = typeVisitor8.getActiveStackScope();
        cVisitor5.setActiveStackScope(symbolTableList10);
        cVisitor0.setActiveStackScope(symbolTableList10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ERROR" + "'", str7, "ERROR");
        org.junit.Assert.assertNotNull(symbolTableList9);
        org.junit.Assert.assertNotNull(symbolTableList10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        int int1 = visitors.TypeChecker.getInferenceType("POW");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility(100, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = cVisitor0.visit(abstractSyntaxNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitBiExprNode(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 0 al tipo 32");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = typeVisitor0.visit(abstractSyntaxNode1);
        java.util.Stack<table.SymbolTable> symbolTableList3 = typeVisitor0.getActiveStackScope();
        nodes.AbstractSyntaxNode abstractSyntaxNode4 = null;
        java.lang.String str5 = typeVisitor0.visit(abstractSyntaxNode4);
        java.util.Stack<table.SymbolTable> symbolTableList6 = typeVisitor0.getActiveStackScope();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(symbolTableList3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(symbolTableList6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(true);
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitVarDeclOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        table.SymbolTable[] symbolTableArray1 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList2 = new java.util.Stack<table.SymbolTable>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList2, symbolTableArray1);
        typeVisitor0.setActiveStackScope(symbolTableList2);
        java.util.Stack<table.SymbolTable> symbolTableList5 = typeVisitor0.getActiveStackScope();
        org.junit.Assert.assertNotNull(symbolTableArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(symbolTableList5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList8 = typeVisitor7.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList9 = typeVisitor7.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList9);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallFunOp(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
        org.junit.Assert.assertNotNull(symbolTableList8);
        org.junit.Assert.assertNotNull(symbolTableList9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.ExprNode exprNode7 = null;
        java.lang.String str8 = cVisitor0.exprStringConverter(exprNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("\"\"");
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cVisitor0.visitUnExprNode(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        visitors.TypeVisitor typeVisitor5 = new visitors.TypeVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode6 = null;
        java.lang.String str7 = typeVisitor5.visit(abstractSyntaxNode6);
        java.util.Stack<table.SymbolTable> symbolTableList8 = typeVisitor5.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList8);
        nodes.ExprNode exprNode10 = null;
        java.lang.String str11 = cVisitor0.exprStringConverter(exprNode10);
        nodes.AbstractSyntaxNode abstractSyntaxNode12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cVisitor0.visitVarDeclOp(abstractSyntaxNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(symbolTableList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"" + "'", str11, "\"\"");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode8 = null;
        java.lang.String str9 = typeVisitor7.visit(abstractSyntaxNode8);
        java.util.Stack<table.SymbolTable> symbolTableList10 = typeVisitor7.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList10);
        nodes.AbstractSyntaxNode abstractSyntaxNode12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitForStatOp(abstractSyntaxNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(symbolTableList10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cVisitor0.visitBodyOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = cVisitor0.visit(abstractSyntaxNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitIfStatOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo -1 al tipo 0");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        int int1 = visitors.TypeChecker.getInferenceType("DIV");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(true);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cVisitor0.visitProgramOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        typeVisitor0.setHasReturn(true);
        visitors.CVisitor cVisitor3 = new visitors.CVisitor();
        java.lang.String str5 = cVisitor3.typeConverter("RELOP");
        nodes.ExprNode exprNode6 = null;
        java.lang.String str7 = cVisitor3.exprStringConverter(exprNode6);
        java.lang.String str9 = cVisitor3.typeConverter("RELOP");
        visitors.TypeVisitor typeVisitor10 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList11 = typeVisitor10.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList12 = typeVisitor10.getActiveStackScope();
        cVisitor3.setActiveStackScope(symbolTableList12);
        visitors.TypeVisitor typeVisitor14 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList15 = typeVisitor14.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList16 = typeVisitor14.getActiveStackScope();
        cVisitor3.setActiveStackScope(symbolTableList16);
        typeVisitor0.setActiveStackScope(symbolTableList16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ERROR" + "'", str5, "ERROR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ERROR" + "'", str9, "ERROR");
        org.junit.Assert.assertNotNull(symbolTableList11);
        org.junit.Assert.assertNotNull(symbolTableList12);
        org.junit.Assert.assertNotNull(symbolTableList15);
        org.junit.Assert.assertNotNull(symbolTableList16);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList1 = typeVisitor0.getActiveStackScope();
        typeVisitor0.setHasReturn(true);
        typeVisitor0.setHasReturn(false);
        java.util.Stack<table.SymbolTable> symbolTableList6 = typeVisitor0.getActiveStackScope();
        org.junit.Assert.assertNotNull(symbolTableList1);
        org.junit.Assert.assertNotNull(symbolTableList6);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode8 = null;
        java.lang.String str9 = typeVisitor7.visit(abstractSyntaxNode8);
        java.util.Stack<table.SymbolTable> symbolTableList10 = typeVisitor7.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList10);
        nodes.AbstractSyntaxNode abstractSyntaxNode12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cVisitor0.visitIdExprNode(abstractSyntaxNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(symbolTableList10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("\"\"");
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitReadOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        visitors.TypeVisitor typeVisitor3 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList4 = typeVisitor3.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList5 = typeVisitor3.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList5);
        java.lang.String str8 = cVisitor0.typeConverter("ERROR");
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cVisitor0.visitConstExprNode(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertNotNull(symbolTableList4);
        org.junit.Assert.assertNotNull(symbolTableList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR" + "'", str8, "ERROR");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        visitors.TypeVisitor typeVisitor5 = new visitors.TypeVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode6 = null;
        java.lang.String str7 = typeVisitor5.visit(abstractSyntaxNode6);
        java.util.Stack<table.SymbolTable> symbolTableList8 = typeVisitor5.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList8);
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitIfStatOp(abstractSyntaxNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(symbolTableList8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = cVisitor0.visitFunOp(abstractSyntaxNode1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cVisitor0.visitIdExprNode(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        visitors.TypeVisitor typeVisitor3 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList4 = typeVisitor3.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList5 = typeVisitor3.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList5);
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList8 = typeVisitor7.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList9 = typeVisitor7.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList10 = typeVisitor7.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList10);
        cVisitor0.setGlobalVarDecl(true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertNotNull(symbolTableList4);
        org.junit.Assert.assertNotNull(symbolTableList5);
        org.junit.Assert.assertNotNull(symbolTableList8);
        org.junit.Assert.assertNotNull(symbolTableList9);
        org.junit.Assert.assertNotNull(symbolTableList10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        java.lang.String str10 = cVisitor0.visit(abstractSyntaxNode9);
        java.lang.Class<?> wildcardClass11 = cVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallParamOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 1 al tipo -1");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList1 = typeVisitor0.getActiveStackScope();
        nodes.AbstractSyntaxNode abstractSyntaxNode2 = null;
        java.lang.String str3 = typeVisitor0.visit(abstractSyntaxNode2);
        typeVisitor0.setHasReturn(false);
        org.junit.Assert.assertNotNull(symbolTableList1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("DIV", 0, 0);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Il tipo 0 e il tipo 0 sono incompatibili");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 35 al tipo -1");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 52 al tipo 35");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        visitors.CVisitor cVisitor3 = new visitors.CVisitor();
        java.lang.String str5 = cVisitor3.typeConverter("RELOP");
        nodes.ExprNode exprNode6 = null;
        java.lang.String str7 = cVisitor3.exprStringConverter(exprNode6);
        nodes.AbstractSyntaxNode abstractSyntaxNode8 = null;
        java.lang.String str9 = cVisitor3.visit(abstractSyntaxNode8);
        table.SymbolTable[] symbolTableArray10 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList11 = new java.util.Stack<table.SymbolTable>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList11, symbolTableArray10);
        cVisitor3.setActiveStackScope(symbolTableList11);
        cVisitor0.setActiveStackScope(symbolTableList11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ERROR" + "'", str5, "ERROR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(symbolTableArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        visitors.TypeVisitor typeVisitor5 = new visitors.TypeVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode6 = null;
        java.lang.String str7 = typeVisitor5.visit(abstractSyntaxNode6);
        java.util.Stack<table.SymbolTable> symbolTableList8 = typeVisitor5.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList8);
        nodes.AbstractSyntaxNode abstractSyntaxNode10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cVisitor0.visitVarDeclOp(abstractSyntaxNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(symbolTableList8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cVisitor0.visitProgramOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        java.lang.String str8 = cVisitor0.typeConverter("");
        java.lang.String str10 = cVisitor0.typeConverter("\"\"");
        java.lang.Class<?> wildcardClass11 = cVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR" + "'", str8, "ERROR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ERROR" + "'", str10, "ERROR");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cVisitor0.visitFunOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWhileOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList1 = typeVisitor0.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList2 = typeVisitor0.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList3 = typeVisitor0.getActiveStackScope();
        nodes.AbstractSyntaxNode abstractSyntaxNode4 = null;
        java.lang.String str5 = typeVisitor0.visit(abstractSyntaxNode4);
        org.junit.Assert.assertNotNull(symbolTableList1);
        org.junit.Assert.assertNotNull(symbolTableList2);
        org.junit.Assert.assertNotNull(symbolTableList3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        java.lang.String str8 = cVisitor0.typeConverter("CONCAT");
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallParamOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR" + "'", str8, "ERROR");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("DIV", 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Il tipo 0 e il tipo 35 sono incompatibili");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("hi!", (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione non consentita");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.unaryOpChecker("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione  non verificabile ");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("\"\"");
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitIfStatOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWhileOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 1 al tipo 0");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList1 = typeVisitor0.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList2 = typeVisitor0.getActiveStackScope();
        visitors.TypeVisitor typeVisitor3 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList4 = typeVisitor3.getActiveStackScope();
        typeVisitor0.setActiveStackScope(symbolTableList4);
        typeVisitor0.setHasReturn(true);
        java.lang.Class<?> wildcardClass8 = typeVisitor0.getClass();
        org.junit.Assert.assertNotNull(symbolTableList1);
        org.junit.Assert.assertNotNull(symbolTableList2);
        org.junit.Assert.assertNotNull(symbolTableList4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        boolean boolean2 = visitors.TypeChecker.typeCompatibility(100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        visitors.TypeVisitor typeVisitor5 = new visitors.TypeVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode6 = null;
        java.lang.String str7 = typeVisitor5.visit(abstractSyntaxNode6);
        java.util.Stack<table.SymbolTable> symbolTableList8 = typeVisitor5.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList8);
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cVisitor0.visitBodyOp(abstractSyntaxNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(symbolTableList8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("RELOP", (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Il tipo 10 e il tipo 1 sono incompatibili");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitAssignOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(true);
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = cVisitor0.visit(abstractSyntaxNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallParamOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        visitors.TypeVisitor typeVisitor7 = new visitors.TypeVisitor();
        table.SymbolTable[] symbolTableArray8 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList9 = new java.util.Stack<table.SymbolTable>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList9, symbolTableArray8);
        typeVisitor7.setActiveStackScope(symbolTableList9);
        cVisitor0.setActiveStackScope(symbolTableList9);
        table.SymbolTable[] symbolTableArray13 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList14 = new java.util.Stack<table.SymbolTable>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList14, symbolTableArray13);
        cVisitor0.setActiveStackScope(symbolTableList14);
        nodes.AbstractSyntaxNode abstractSyntaxNode17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitBiExprNode(abstractSyntaxNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(symbolTableArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(symbolTableArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        java.lang.String str8 = cVisitor0.typeConverter("");
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        java.lang.String str10 = cVisitor0.visit(abstractSyntaxNode9);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cVisitor0.visitBodyOp(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR" + "'", str8, "ERROR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitBiExprNode(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        java.lang.String str10 = cVisitor0.visit(abstractSyntaxNode9);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        java.lang.String str12 = cVisitor0.visit(abstractSyntaxNode11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        java.lang.String str8 = cVisitor0.typeConverter("");
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        java.lang.String str10 = cVisitor0.visit(abstractSyntaxNode9);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        java.lang.String str12 = cVisitor0.visit(abstractSyntaxNode11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR" + "'", str8, "ERROR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        int int1 = visitors.TypeChecker.getInferenceType("RELOP");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList1 = typeVisitor0.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList2 = typeVisitor0.getActiveStackScope();
        typeVisitor0.setHasReturn(true);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = typeVisitor0.visit(abstractSyntaxNode5);
        java.lang.Class<?> wildcardClass7 = typeVisitor0.getClass();
        org.junit.Assert.assertNotNull(symbolTableList1);
        org.junit.Assert.assertNotNull(symbolTableList2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        visitors.TypeVisitor typeVisitor9 = new visitors.TypeVisitor();
        typeVisitor9.setHasReturn(true);
        typeVisitor9.setHasReturn(false);
        typeVisitor9.setHasReturn(false);
        java.util.Stack<table.SymbolTable> symbolTableList16 = typeVisitor9.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList16);
        java.lang.String str19 = cVisitor0.typeConverter("CONCAT");
        nodes.AbstractSyntaxNode abstractSyntaxNode20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cVisitor0.visitVarDeclOp(abstractSyntaxNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolTableList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ERROR" + "'", str19, "ERROR");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        int int1 = visitors.TypeChecker.getInferenceType("UMINUSOP");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallFunOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        java.lang.String str8 = cVisitor0.typeConverter("");
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        java.lang.String str10 = cVisitor0.visit(abstractSyntaxNode9);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallParamOp(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR" + "'", str8, "ERROR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        visitors.TypeVisitor typeVisitor5 = new visitors.TypeVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode6 = null;
        java.lang.String str7 = typeVisitor5.visit(abstractSyntaxNode6);
        java.util.Stack<table.SymbolTable> symbolTableList8 = typeVisitor5.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList8);
        nodes.ExprNode exprNode10 = null;
        java.lang.String str11 = cVisitor0.exprStringConverter(exprNode10);
        cVisitor0.setGlobalVarDecl(false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(symbolTableList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"" + "'", str11, "\"\"");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        visitors.TypeVisitor typeVisitor9 = new visitors.TypeVisitor();
        typeVisitor9.setHasReturn(true);
        typeVisitor9.setHasReturn(false);
        typeVisitor9.setHasReturn(false);
        java.util.Stack<table.SymbolTable> symbolTableList16 = typeVisitor9.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList16);
        java.lang.String str19 = cVisitor0.typeConverter("CONCAT");
        nodes.AbstractSyntaxNode abstractSyntaxNode20 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitIfStatOp(abstractSyntaxNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolTableList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ERROR" + "'", str19, "ERROR");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList1 = typeVisitor0.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList2 = typeVisitor0.getActiveStackScope();
        visitors.CVisitor cVisitor3 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode4 = null;
        java.lang.String str5 = cVisitor3.visit(abstractSyntaxNode4);
        java.lang.String str7 = cVisitor3.typeConverter("DIV");
        visitors.TypeVisitor typeVisitor8 = new visitors.TypeVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        java.lang.String str10 = typeVisitor8.visit(abstractSyntaxNode9);
        java.util.Stack<table.SymbolTable> symbolTableList11 = typeVisitor8.getActiveStackScope();
        cVisitor3.setActiveStackScope(symbolTableList11);
        typeVisitor0.setActiveStackScope(symbolTableList11);
        org.junit.Assert.assertNotNull(symbolTableList1);
        org.junit.Assert.assertNotNull(symbolTableList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ERROR" + "'", str7, "ERROR");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(symbolTableList11);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.ExprNode exprNode7 = null;
        java.lang.String str8 = cVisitor0.exprStringConverter(exprNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitAssignOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        java.lang.String str4 = cVisitor0.visit(abstractSyntaxNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cVisitor0.visitProgramOp(abstractSyntaxNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("RELOP");
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.ExprNode exprNode7 = null;
        java.lang.String str8 = cVisitor0.exprStringConverter(exprNode7);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cVisitor0.visitVarDeclOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cVisitor0.visitVarDeclOp(abstractSyntaxNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(true);
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        cVisitor0.setGlobalVarDecl(false);
        nodes.ExprNode exprNode7 = null;
        java.lang.String str8 = cVisitor0.exprStringConverter(exprNode7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cVisitor0.visitIdExprNode(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList1 = typeVisitor0.getActiveStackScope();
        typeVisitor0.setHasReturn(true);
        typeVisitor0.setHasReturn(false);
        java.lang.Class<?> wildcardClass6 = typeVisitor0.getClass();
        org.junit.Assert.assertNotNull(symbolTableList1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        java.lang.String str2 = cVisitor0.typeConverter("\"\"");
        visitors.TypeVisitor typeVisitor3 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList4 = typeVisitor3.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList5 = typeVisitor3.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cVisitor0.visitIdExprNode(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ERROR" + "'", str2, "ERROR");
        org.junit.Assert.assertNotNull(symbolTableList4);
        org.junit.Assert.assertNotNull(symbolTableList5);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        table.SymbolTable[] symbolTableArray5 = new table.SymbolTable[] {};
        java.util.Stack<table.SymbolTable> symbolTableList6 = new java.util.Stack<table.SymbolTable>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<table.SymbolTable>) symbolTableList6, symbolTableArray5);
        cVisitor0.setActiveStackScope(symbolTableList6);
        java.lang.Class<?> wildcardClass9 = cVisitor0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertNotNull(symbolTableArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        java.lang.String str8 = cVisitor0.typeConverter("");
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        java.lang.String str10 = cVisitor0.visit(abstractSyntaxNode9);
        nodes.AbstractSyntaxNode abstractSyntaxNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitCallFunOp(abstractSyntaxNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR" + "'", str8, "ERROR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        visitors.TypeVisitor typeVisitor0 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList1 = typeVisitor0.getActiveStackScope();
        java.util.Stack<table.SymbolTable> symbolTableList2 = typeVisitor0.getActiveStackScope();
        visitors.TypeVisitor typeVisitor3 = new visitors.TypeVisitor();
        java.util.Stack<table.SymbolTable> symbolTableList4 = typeVisitor3.getActiveStackScope();
        typeVisitor0.setActiveStackScope(symbolTableList4);
        nodes.AbstractSyntaxNode abstractSyntaxNode6 = null;
        java.lang.String str7 = typeVisitor0.visit(abstractSyntaxNode6);
        org.junit.Assert.assertNotNull(symbolTableList1);
        org.junit.Assert.assertNotNull(symbolTableList2);
        org.junit.Assert.assertNotNull(symbolTableList4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        java.lang.String str6 = cVisitor0.typeConverter("RELOP");
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR" + "'", str6, "ERROR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 1 al tipo 0");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        java.lang.String str8 = cVisitor0.visit(abstractSyntaxNode7);
        visitors.TypeVisitor typeVisitor9 = new visitors.TypeVisitor();
        typeVisitor9.setHasReturn(true);
        typeVisitor9.setHasReturn(false);
        typeVisitor9.setHasReturn(false);
        java.util.Stack<table.SymbolTable> symbolTableList16 = typeVisitor9.getActiveStackScope();
        cVisitor0.setActiveStackScope(symbolTableList16);
        java.lang.String str19 = cVisitor0.typeConverter("CONCAT");
        nodes.AbstractSyntaxNode abstractSyntaxNode20 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitBiExprNode(abstractSyntaxNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolTableList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ERROR" + "'", str19, "ERROR");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        nodes.AbstractSyntaxNode abstractSyntaxNode1 = null;
        java.lang.String str2 = cVisitor0.visit(abstractSyntaxNode1);
        java.lang.String str4 = cVisitor0.typeConverter("DIV");
        nodes.AbstractSyntaxNode abstractSyntaxNode5 = null;
        java.lang.String str6 = cVisitor0.visit(abstractSyntaxNode5);
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cVisitor0.visitBodyOp(abstractSyntaxNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR" + "'", str4, "ERROR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        visitors.CVisitor cVisitor0 = new visitors.CVisitor();
        cVisitor0.setGlobalVarDecl(true);
        nodes.ExprNode exprNode3 = null;
        java.lang.String str4 = cVisitor0.exprStringConverter(exprNode3);
        cVisitor0.setGlobalVarDecl(false);
        nodes.AbstractSyntaxNode abstractSyntaxNode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cVisitor0.visitWhileOp(abstractSyntaxNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("hi!", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione non consentita");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = visitors.TypeChecker.AssignOpChecker((int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type exceptions.TypeMismatchException; message: Non e? possibile assegnare il tipo 100 al tipo 32");
        } catch (exceptions.TypeMismatchException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = visitors.TypeChecker.binaryOpChecker("ERROR", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Operazione non consentita");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }
}


package visitors;

import exceptions.TypeMismatchException;
import autogenerated.sym;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeCheckerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetInferenceType() {
        assertEquals(sym.INTEGER, TypeChecker.getInferenceType("INTEGER"));
        assertEquals(sym.REAL, TypeChecker.getInferenceType("REAL"));
        assertEquals(sym.BOOL, TypeChecker.getInferenceType("BOOL"));
        assertEquals(sym.STRING, TypeChecker.getInferenceType("STRING"));
        assertEquals(sym.CHAR, TypeChecker.getInferenceType("CHAR"));
        assertEquals(sym.VOID, TypeChecker.getInferenceType("VOID"));
        assertEquals(sym.error, TypeChecker.getInferenceType("UNKNOWN_TYPE"));
    }

    @Test
    void testBinaryOpChecker() {
        // ARITMETIC
        assertEquals(sym.INTEGER, TypeChecker.binaryOpChecker(TypeChecker.ARITMETIC, sym.INTEGER, sym.INTEGER));
        assertEquals(sym.REAL, TypeChecker.binaryOpChecker(TypeChecker.ARITMETIC, sym.INTEGER, sym.REAL));
        assertEquals(sym.REAL, TypeChecker.binaryOpChecker(TypeChecker.ARITMETIC, sym.REAL, sym.REAL));
        assertEquals(sym.REAL, TypeChecker.binaryOpChecker(TypeChecker.ARITMETIC, sym.REAL, sym.INTEGER));
        assertThrows(TypeMismatchException.class, () -> TypeChecker.binaryOpChecker(TypeChecker.ARITMETIC, sym.BOOL, sym.REAL));

        // DIV
        assertEquals(sym.REAL, TypeChecker.binaryOpChecker(TypeChecker.DIV, sym.INTEGER, sym.INTEGER));
        assertEquals(sym.REAL, TypeChecker.binaryOpChecker(TypeChecker.DIV, sym.INTEGER, sym.REAL));
        assertEquals(sym.REAL, TypeChecker.binaryOpChecker(TypeChecker.DIV, sym.REAL, sym.REAL));
        assertEquals(sym.REAL, TypeChecker.binaryOpChecker(TypeChecker.DIV, sym.REAL, sym.INTEGER));
        assertThrows(TypeMismatchException.class, () -> TypeChecker.binaryOpChecker(TypeChecker.DIV, sym.BOOL, sym.REAL));

        // RELOP
        assertEquals(sym.BOOL, TypeChecker.binaryOpChecker(TypeChecker.RELOP, sym.INTEGER, sym.REAL));
        assertEquals(sym.BOOL, TypeChecker.binaryOpChecker(TypeChecker.RELOP, sym.REAL, sym.INTEGER));
        assertEquals(sym.BOOL, TypeChecker.binaryOpChecker(TypeChecker.RELOP, sym.REAL, sym.REAL));
        assertEquals(sym.BOOL, TypeChecker.binaryOpChecker(TypeChecker.RELOP, sym.INTEGER, sym.INTEGER));
        assertEquals(sym.BOOL, TypeChecker.binaryOpChecker(TypeChecker.RELOP, sym.STRING, sym.CHAR));
        assertEquals(sym.BOOL, TypeChecker.binaryOpChecker(TypeChecker.RELOP, sym.CHAR, sym.CHAR));
        assertThrows(TypeMismatchException.class, () -> TypeChecker.binaryOpChecker(TypeChecker.RELOP, sym.STRING, sym.INTEGER));

        // BOOLEANOP
        assertEquals(sym.BOOL, TypeChecker.binaryOpChecker(TypeChecker.BOOLEANOP, sym.BOOL, sym.BOOL));
        assertThrows(Error.class, () -> TypeChecker.binaryOpChecker(TypeChecker.BOOLEANOP, sym.REAL, sym.BOOL));

        // STRINGCONCAT
        assertEquals(sym.STRING, TypeChecker.binaryOpChecker(TypeChecker.STRINGCONCAT, sym.STRING, sym.STRING));
        assertEquals(sym.STRING, TypeChecker.binaryOpChecker(TypeChecker.STRINGCONCAT, sym.CHAR, sym.CHAR));
        assertEquals(sym.STRING, TypeChecker.binaryOpChecker(TypeChecker.STRINGCONCAT, sym.CHAR, sym.STRING));
        assertEquals(sym.STRING, TypeChecker.binaryOpChecker(TypeChecker.STRINGCONCAT, sym.STRING, sym.CHAR));
        assertThrows(TypeMismatchException.class, () -> TypeChecker.binaryOpChecker(TypeChecker.STRINGCONCAT, sym.INTEGER, sym.VOID));

        // POW
        assertEquals(sym.REAL, TypeChecker.binaryOpChecker(TypeChecker.POW, sym.INTEGER, sym.INTEGER));
        assertEquals(sym.REAL, TypeChecker.binaryOpChecker(TypeChecker.POW, sym.REAL, sym.REAL));
        assertEquals(sym.REAL, TypeChecker.binaryOpChecker(TypeChecker.POW, sym.REAL, sym.INTEGER));
        assertEquals(sym.REAL, TypeChecker.binaryOpChecker(TypeChecker.POW, sym.INTEGER, sym.REAL));
        assertThrows(TypeMismatchException.class, () -> TypeChecker.binaryOpChecker(TypeChecker.POW, sym.STRING, sym.INTEGER));
    }
    @Test
    void testUnaryOpChecker() {
        // Test unary minus operator
        assertEquals(sym.INTEGER, TypeChecker.unaryOpChecker(TypeChecker.UMINUSOP, sym.INTEGER));
        assertEquals(sym.REAL, TypeChecker.unaryOpChecker(TypeChecker.UMINUSOP, sym.REAL));
        assertThrows(Error.class, () -> TypeChecker.unaryOpChecker(TypeChecker.UMINUSOP, sym.STRING));

        // Test boolean negation operator
        assertEquals(sym.BOOL, TypeChecker.unaryOpChecker(TypeChecker.BOOLEANOP, sym.BOOL));
        assertThrows(Error.class, () -> TypeChecker.unaryOpChecker(TypeChecker.BOOLEANOP, sym.STRING));

        assertThrows(Error.class, () -> TypeChecker.unaryOpChecker(TypeChecker.POW,sym.INTEGER));
    }

    @Test
    void testAssignOpChecker() {
        // Test valid assignments
        assertEquals(sym.VOID, TypeChecker.AssignOpChecker(sym.INTEGER, sym.INTEGER));
        assertEquals(sym.VOID, TypeChecker.AssignOpChecker(sym.REAL, sym.INTEGER));
        assertEquals(sym.VOID, TypeChecker.AssignOpChecker(sym.INTEGER, sym.REAL));
        assertEquals(sym.VOID, TypeChecker.AssignOpChecker(sym.REAL, sym.REAL));
        assertEquals(sym.VOID, TypeChecker.AssignOpChecker(sym.STRING, sym.STRING));
        assertEquals(sym.VOID, TypeChecker.AssignOpChecker(sym.BOOL, sym.BOOL));
        assertEquals(sym.VOID, TypeChecker.AssignOpChecker(sym.INTEGER, sym.BOOL));
        assertEquals(sym.VOID, TypeChecker.AssignOpChecker(sym.BOOL, sym.INTEGER));
        assertEquals(sym.VOID, TypeChecker.AssignOpChecker(sym.CHAR, sym.CHAR));

        // Test invalid assignments
        assertThrows(TypeMismatchException.class, () -> TypeChecker.AssignOpChecker(sym.REAL, sym.STRING));
        assertThrows(TypeMismatchException.class, () -> TypeChecker.AssignOpChecker(sym.STRING, sym.INTEGER));
        assertThrows(TypeMismatchException.class, () -> TypeChecker.AssignOpChecker(sym.BOOL, sym.STRING));
        assertThrows(TypeMismatchException.class, () -> TypeChecker.AssignOpChecker(sym.INTEGER, sym.CHAR));
        assertThrows(TypeMismatchException.class, () -> TypeChecker.AssignOpChecker(sym.CHAR, sym.INTEGER));
    }

    @Test
    void testTypeCompatibility() {
        // Test compatible types
        assertTrue(TypeChecker.typeCompatibility(sym.INTEGER, sym.INTEGER));
        assertTrue(TypeChecker.typeCompatibility(sym.REAL, sym.REAL));
        assertTrue(TypeChecker.typeCompatibility(sym.REAL, sym.INTEGER));
        assertTrue(TypeChecker.typeCompatibility(sym.BOOL, sym.BOOL));

        // Test incompatible types
        assertFalse(TypeChecker.typeCompatibility(sym.INTEGER, sym.REAL));
        assertFalse(TypeChecker.typeCompatibility(sym.REAL, sym.BOOL));
        assertFalse(TypeChecker.typeCompatibility(sym.STRING, sym.BOOL));
    }
}
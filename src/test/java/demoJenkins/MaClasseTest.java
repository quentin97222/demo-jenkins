package demoJenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import demoJavaAvecGit.FactorielException;
import demoJavaAvecGit.Maths;

class MaClasseTest {
	Maths fonction;
	
	@BeforeEach
	void beforeEach() {
		fonction = new Maths();
	}
	
	void afterEach() {
		fonction = null;
	}
	
	@Test
	void test() {
		assertEquals(10, fonction.adiition(2, 8));
	}
	
	
	@Test
	void exception() {
		assertThrows(FactorielException.class,()-> fonction.factoriel(-1));
	}
	
	@Test
	void AutreTest() {
		assertEquals(6, fonction.factoriel(3));
	}

}

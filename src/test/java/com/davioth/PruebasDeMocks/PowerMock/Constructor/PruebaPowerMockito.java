package com.davioth.PruebasDeMocks.PowerMock.Constructor;

import static org.mockito.Mockito.doReturn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.davioth.PruebasDeMocks.PowerMock.ClaseIniciada;
import com.davioth.PruebasDeMocks.PowerMock.ClaseMockeada;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ClaseMockeada.class)
public class PruebaPowerMockito {

	ClaseMockeada mockeada = new ClaseMockeada();
	
	@Mock
	ClaseIniciada claseIniciadaMock;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUsandoMock() throws Exception {
		
		String resultadoMock = "Soy un mock no me creas";
		System.out.println("1");
		 doReturn(resultadoMock).when(claseIniciadaMock).getPropiedad();
		 System.out.println("2");
		 PowerMockito.whenNew(ClaseIniciada.class).withNoArguments().thenReturn(claseIniciadaMock);
		 System.out.println("3");
		 
		 mockeada.metodo();
		 
	}
	@Test
	public void testUsandoElReal() throws Exception {
		
		
		mockeada.metodo();
	}

}

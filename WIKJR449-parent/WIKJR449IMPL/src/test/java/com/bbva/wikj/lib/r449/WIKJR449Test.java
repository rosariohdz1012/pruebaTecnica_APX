package com.bbva.wikj.lib.r449;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.domain.transaction.Context;
import com.bbva.elara.domain.transaction.ThreadContext;
import javax.annotation.Resource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/WIKJR449-app.xml",
		"classpath:/META-INF/spring/WIKJR449-app-test.xml",
		"classpath:/META-INF/spring/WIKJR449-arc.xml",
		"classpath:/META-INF/spring/WIKJR449-arc-test.xml" })
public class WIKJR449Test {

	@Spy
	private Context context;

	@Resource(name = "wikjR449")
	private WIKJR449 wikjR449;

	@Resource(name = "applicationConfigurationService")
	private ApplicationConfigurationService applicationConfigurationService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		context = new Context();
		ThreadContext.set(context);
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.wikjR449;
		if(this.wikjR449 instanceof Advised){
			Advised advised = (Advised) this.wikjR449;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		//wikjR449.execute();
		Assert.assertEquals(0, context.getAdviceList().size());
	}
	
}

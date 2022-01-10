package com.liferay.tasks.activator;

 import com.liferay.tasks.activator.service.DemoService;
import com.liferay.tasks.activator.service.impl.DemoServiceImpl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Component;

/**
 * @author Argil DX
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = BundleActivator.class
)
public class BundleActivatorDemo implements BundleActivator {
	
	private ServiceRegistration registration;

	@Override
	public void start(BundleContext context) throws Exception {
		
		registration = context.registerService(DemoService.class.getName(), new DemoServiceImpl(), null);
		DemoService ds = new DemoServiceImpl();
		System.out.println(ds.displayMessage());
		System.out.println("Service registered successfully!!!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		registration.unregister();
		System.out.println("Service Unregistered!!!");
		// TODO Auto-generated method stub
		
	}

	// TODO enter required service methods

}
package parsley.example.logeventstable;

import org.osgi.framework.Bundle;

import org.eclipse.emf.parsley.EmfParsleyExtensionFactory;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;

import com.google.inject.Injector;

public class LogeventstableExecutableExtensionFactory extends
		EmfParsleyExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return LogeventstableActivator.getDefault().getBundle();
	}

	@Override
	protected EmfParsleyGuiceModule getModule() {
		return LogeventstableActivator.getDefault().createModule();
	}

	@Override
	protected Injector getInjector() {
		return LogeventstableActivator.getDefault().getInjector();
	}
}

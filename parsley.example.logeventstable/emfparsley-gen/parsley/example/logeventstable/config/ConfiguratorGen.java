package parsley.example.logeventstable.config;

import logevent.LogeventPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.config.Configurator;
import parsley.example.logeventstable.LogeventstableSaveableTableView;

@SuppressWarnings("all")
public class ConfiguratorGen extends Configurator {
  public URI resourceURI(final LogeventstableSaveableTableView it) {
    String _property = System.getProperty("user.home");
    String _plus = (_property + "/examples/logevent/My.logevent");
    return URI.createFileURI(_plus);
  }
  
  public EClass eClass(final LogeventstableSaveableTableView it) {
    return LogeventPackage.eINSTANCE.getLogEvent();
  }
}

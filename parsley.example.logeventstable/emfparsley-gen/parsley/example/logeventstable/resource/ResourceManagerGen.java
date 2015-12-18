package parsley.example.logeventstable.resource;

import logevent.LogEvent;
import logevent.LogEventGroup;
import logevent.LogEventQueue;
import logevent.LogeventFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ResourceManagerGen extends ResourceManager {
  private final LogeventFactory factory = LogeventFactory.eINSTANCE;
  
  public LogeventFactory getFactory() {
    return this.factory;
  }
  
  @Override
  public void initialize(final Resource it) {
    EList<EObject> _contents = it.getContents();
    LogEventQueue _createLogEventQueue = this.factory.createLogEventQueue();
    final Procedure1<LogEventQueue> _function = new Procedure1<LogEventQueue>() {
      @Override
      public void apply(final LogEventQueue it) {
        EList<LogEventGroup> _eventGroups = it.getEventGroups();
        LogEventGroup _createLogEventGroup = ResourceManagerGen.this.factory.createLogEventGroup();
        final Procedure1<LogEventGroup> _function = new Procedure1<LogEventGroup>() {
          @Override
          public void apply(final LogEventGroup it) {
            EList<LogEvent> _events = it.getEvents();
            LogEvent _createLogEvent = ResourceManagerGen.this.factory.createLogEvent();
            final Procedure1<LogEvent> _function = new Procedure1<LogEvent>() {
              @Override
              public void apply(final LogEvent it) {
                it.setName("First");
              }
            };
            LogEvent _doubleArrow = ObjectExtensions.<LogEvent>operator_doubleArrow(_createLogEvent, _function);
            _events.add(_doubleArrow);
            EList<LogEvent> _events_1 = it.getEvents();
            LogEvent _createLogEvent_1 = ResourceManagerGen.this.factory.createLogEvent();
            final Procedure1<LogEvent> _function_1 = new Procedure1<LogEvent>() {
              @Override
              public void apply(final LogEvent it) {
                it.setName("Second");
              }
            };
            LogEvent _doubleArrow_1 = ObjectExtensions.<LogEvent>operator_doubleArrow(_createLogEvent_1, _function_1);
            _events_1.add(_doubleArrow_1);
            EList<LogEvent> _events_2 = it.getEvents();
            LogEvent _createLogEvent_2 = ResourceManagerGen.this.factory.createLogEvent();
            final Procedure1<LogEvent> _function_2 = new Procedure1<LogEvent>() {
              @Override
              public void apply(final LogEvent it) {
                it.setName("Third");
              }
            };
            LogEvent _doubleArrow_2 = ObjectExtensions.<LogEvent>operator_doubleArrow(_createLogEvent_2, _function_2);
            _events_2.add(_doubleArrow_2);
          }
        };
        LogEventGroup _doubleArrow = ObjectExtensions.<LogEventGroup>operator_doubleArrow(_createLogEventGroup, _function);
        _eventGroups.add(_doubleArrow);
      }
    };
    LogEventQueue _doubleArrow = ObjectExtensions.<LogEventQueue>operator_doubleArrow(_createLogEventQueue, _function);
    _contents.add(_doubleArrow);
  }
}

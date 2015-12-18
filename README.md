# parsley-table-rcp-example
An example of Table implemented with EMF Parsley

You first need to install EMF Parsley:
- Since EMF Parsley DSL requires Xtext, first add this update site to your update sites: http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/
- Then you can install EMF Parsley features from this update site: http://download.eclipse.org/emf-parsley/updates/0.5

Then import all the projects in the workspace.

This example contributes a View, "Logeventstable", showing the contents of an EMF model, which consists of a _LogEventQueue_ containing _LogEventGroup_ objects containing _LogEvent_ objects.

The table shows all the LogEvent objects.

The view provides a button that will add a new LogEventGroup with a LogEvent (with some incremental names).  The table will automatically show the new LogEvent of the new added LogEventQueue.

You can then run another Eclipse instance or use the RCP project and run the RCP application.

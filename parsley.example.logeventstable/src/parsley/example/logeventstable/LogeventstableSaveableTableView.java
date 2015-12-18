package parsley.example.logeventstable;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import logevent.LogEvent;
import logevent.LogEventGroup;
import logevent.LogEventQueue;
import logevent.LogeventFactory;

public class LogeventstableSaveableTableView extends org.eclipse.emf.parsley.views.SaveableTableView {
	public LogeventstableSaveableTableView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayout(new FillLayout());
		composite.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		super.createPartControl(composite);

		Button button = new Button(parent, SWT.PUSH);
		button.setText("Add a Log Group");
		button.addSelectionListener(new SelectionAdapter() {
			int counter = 0;

			@Override
			public void widgetSelected(SelectionEvent e) {
				LogEventQueue queue = (LogEventQueue) getResource().getContents().get(0);
				addNewGroup(queue);
			}

			private void addNewGroup(LogEventQueue queue) {
				LogeventFactory factory = LogeventFactory.eINSTANCE;
				LogEventGroup newGroup = factory.createLogEventGroup();
				newGroup.setName("Group " + ++counter);
				queue.getEventGroups().add(newGroup);
				LogEvent newEvent = factory.createLogEvent();
				newEvent.setName("Event " + counter);
				newGroup.getEvents().add(newEvent);
			}
		});
	}
}

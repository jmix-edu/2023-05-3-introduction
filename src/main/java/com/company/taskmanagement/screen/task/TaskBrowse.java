package com.company.taskmanagement.screen.task;

import com.company.taskmanagement.app.TaskImportService;
import io.jmix.ui.component.Button;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.*;
import com.company.taskmanagement.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("tm_Task.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
public class TaskBrowse extends StandardLookup<Task> {
    @Autowired
    private TaskImportService taskImportService;
    @Autowired
    private CollectionLoader<Task> tasksDl;

    @Subscribe("importTasksBtn")
    public void onImportTasksBtnClick(Button.ClickEvent event) {
        taskImportService.importTasks();
        tasksDl.load();
    }
}
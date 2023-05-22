package com.company.taskmanagement.screen.task;

import io.jmix.ui.screen.*;
import com.company.taskmanagement.entity.Task;

@UiController("tm_Task.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
public class TaskEdit extends StandardEditor<Task> {
}
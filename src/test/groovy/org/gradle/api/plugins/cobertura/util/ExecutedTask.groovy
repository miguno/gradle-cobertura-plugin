package org.gradle.api.plugins.cobertura.util

import org.gradle.api.Task;

public class ExecutedTask {

    private final Task task;
    private final IncrementalTaskState state;

    public ExecutedTask(Task task, IncrementalTaskState state) {
        this.task = task;
        this.state = state;
    }

    public Task getTask() {
        return task;
    }

    public IncrementalTaskState getState() {
        return state;
    }
}

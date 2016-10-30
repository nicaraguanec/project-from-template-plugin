package net.baulin.project_from_template;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

/**
 * Created by Evgenii Baulin on 30.10.16.
 */
public class PullTemplateTask extends DefaultTask {

    private String templateSource;

    @TaskAction
    public void pullTemplateTask() {

    }

    @Input
    public void setTemplateSource(String templateSource) {
        this.templateSource = templateSource;
    }
}

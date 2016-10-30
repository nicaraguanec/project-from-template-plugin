package net.baulin.project_from_template;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by Evgenii Baulin on 30.10.16.
 */
public class FromTemplatePlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        FromTemplatePluginExtention extention = project.getExtensions().create("fromTemplate", FromTemplatePluginExtention.class);
        project.task("pullTemplateTask");
    }
}

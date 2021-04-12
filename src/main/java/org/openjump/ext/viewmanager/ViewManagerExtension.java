package org.openjump.ext.viewmanager;

import com.vividsolutions.jump.workbench.plugin.Extension;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;

/**
 * Extension to manage views.
 * A "View" is defined by the styles associated to the layers of a project.
 */
public class ViewManagerExtension extends Extension {

    public String getName() {
        return "View Manager Extension (Micha\u00EBl Michaud)";
    }

    public String getVersion() {
        return "1.0.0 (2021-04-12)";
    }

    public void configure(PlugInContext context) throws Exception {
        new ViewManagerPlugIn().initialize(context);
    }
}

package org.openjump.ext.viewmanager;

import com.vividsolutions.jump.I18N;
import com.vividsolutions.jump.workbench.plugin.Extension;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;

/**
 * Extension to manage views.
 * A "View" is defined by the styles associated to the layers of a project.
 */
public class ViewManagerExtension extends Extension {

    public final static I18N I18N = com.vividsolutions.jump.I18N.getInstance("view_manager");

    public String getName() {
        return "View Manager Extension (Micha\u00EBl Michaud)";
    }

    public String getVersion() {
        return I18N.get("ViewManagerPlugIn.Version");
    }

    public void configure(PlugInContext context) throws Exception {
        new ViewManagerPlugIn().initialize(context);
    }
}

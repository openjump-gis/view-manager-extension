package org.openjump.ext.viewmanager.style;

import com.vividsolutions.jump.workbench.ui.renderer.style.BasicStyle;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Class to persist BasicStyleFill
 */
public class PBasicStyleFill {

    @XmlAttribute
    boolean enabled = true;

    @XmlAttribute
    String color;

    //@XmlAttribute
    //float pattern = 1;

    PBasicStyleFill() {}

    public PBasicStyleFill setFillStyle(BasicStyle style) {
        enabled = style.isRenderingFill();
        color = ColorUtil.encode(style.getFillColor());
        return this;
    }
}

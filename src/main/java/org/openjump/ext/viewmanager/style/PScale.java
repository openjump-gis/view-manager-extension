package org.openjump.ext.viewmanager.style;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class to persist Scale.
 */
@XmlRootElement (name="scale")
public class PScale {

    @XmlAttribute
    public boolean scaleDependent = false;

    @XmlAttribute
    public Double minScale = 1000000.0;

    @XmlAttribute
    public Double maxScale = 1.0;

}

package org.openjump.ext.viewmanager.style;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by UMichael on 21/06/2015.
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

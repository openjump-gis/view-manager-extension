package org.openjump.ext.viewmanager.style;

import java.awt.*;

/**
 * Color encoder/decoder util.
 */
public class ColorUtil {

    public static Color decode(String color) throws NumberFormatException {
        return color == null ? null : Color.decode(color);
    }

    public static String encode(Color color) {
        return "#" + String.format("%08x", color.getRGB()).substring(2);
    }
}

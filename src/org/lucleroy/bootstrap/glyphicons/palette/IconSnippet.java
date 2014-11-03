package org.lucleroy.bootstrap.glyphicons.palette;

import java.util.prefs.Preferences;
import org.openide.util.NbPreferences;

public abstract class IconSnippet extends AbstractSnippet {

    @Override
    protected String createBody() {
        Preferences pref = NbPreferences.forModule(BootstrapGlyphiconsPalettePanel.class);
        String tag = pref.get("tag", "span");
        return "<" + tag + " class=" + quote(getClasses()) + "></" + tag + ">";
    }

    private String quote(String string) {
        return "\"" + string + "\"";
    }

    protected abstract String getClasses();
}

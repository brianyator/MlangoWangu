package gnu.kawa.xslt;

import gnu.mapping.Procedure;
import gnu.mapping.Symbol;

public class TemplateTable {
    static final TemplateTable nullModeTable = new TemplateTable(XSLT.nullMode);
    TemplateEntry entries;
    Symbol name;

    public TemplateTable(Symbol mode) {
        this.name = mode;
    }

    static TemplateTable getTemplateTable(Symbol name2) {
        if (name2 == XSLT.nullMode) {
            return nullModeTable;
        }
        return null;
    }

    public void enter(String pattern, double priority, Procedure procedure) {
        TemplateEntry entry = new TemplateEntry();
        entry.procedure = procedure;
        entry.priority = priority;
        entry.pattern = pattern;
        entry.next = this.entries;
        this.entries = entry;
    }

    public Procedure find(String name2) {
        for (TemplateEntry entry = this.entries; entry != null; entry = entry.next) {
            if (entry.pattern.equals(name2)) {
                return entry.procedure;
            }
        }
        return null;
    }
}

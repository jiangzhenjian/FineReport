// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 

package com.fr.design.mainframe.widget.renderer;

import com.fr.design.mainframe.widget.wrappers.TreeModelWrapper;

// Referenced classes of package com.fr.design.mainframe.widget.renderer:
//            EncoderCellRenderer

public class TreeModelRenderer extends EncoderCellRenderer
{

    public TreeModelRenderer()
    {
        super(new TreeModelWrapper());
    }
}

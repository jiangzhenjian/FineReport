// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 

package com.fr.design.chart.series.SeriesCondition;

import com.fr.chart.base.ChartConstants;

// Referenced classes of package com.fr.design.chart.series.SeriesCondition:
//            ChartConditionPane

public class MapPlotChartConditionPane extends ChartConditionPane
{

    public MapPlotChartConditionPane()
    {
    }

    public String[] columns2Populate()
    {
        return (new String[] {
            ChartConstants.AREA_NAME, ChartConstants.AREA_VALUE
        });
    }
}

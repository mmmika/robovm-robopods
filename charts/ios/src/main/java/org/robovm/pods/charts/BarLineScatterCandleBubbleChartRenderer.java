/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.charts;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BarLineScatterCandleBubbleChartRenderer/*</name>*/ 
    extends /*<extends>*/ChartDataRendererBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BarLineScatterCandleBubbleChartRendererPtr extends Ptr<BarLineScatterCandleBubbleChartRenderer, BarLineScatterCandleBubbleChartRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BarLineScatterCandleBubbleChartRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BarLineScatterCandleBubbleChartRenderer() {}
    protected BarLineScatterCandleBubbleChartRenderer(Handle h, long handle) { super(h, handle); }
    protected BarLineScatterCandleBubbleChartRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAnimator:viewPortHandler:")
    public BarLineScatterCandleBubbleChartRenderer(ChartAnimator animator, ChartViewPortHandler viewPortHandler) { super((SkipInit) null); initObject(init(animator, viewPortHandler)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAnimator:viewPortHandler:")
    protected native @Pointer long init(ChartAnimator animator, ChartViewPortHandler viewPortHandler);
    @Method(selector = "isInBoundsXWithEntry:dataSet:")
    public native boolean isInBoundsX(ChartDataEntry e, IBarLineScatterCandleBubbleChartDataSet dataSet);
    @Method(selector = "shouldDrawValuesForDataSet:")
    public native boolean shouldDrawValuesForDataSet(IChartDataSet set);
    /*</methods>*/
}

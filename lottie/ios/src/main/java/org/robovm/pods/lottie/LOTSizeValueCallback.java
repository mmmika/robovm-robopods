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
package org.robovm.pods.lottie;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LOTSizeValueCallback/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements LOTSizeValueDelegate/*</implements>*/ {

    /*<ptr>*/public static class LOTSizeValueCallbackPtr extends Ptr<LOTSizeValueCallback, LOTSizeValueCallbackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LOTSizeValueCallback.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LOTSizeValueCallback() {}
    protected LOTSizeValueCallback(Handle h, long handle) { super(h, handle); }
    protected LOTSizeValueCallback(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sizeValue")
    public native @ByVal CGSize getSizeValue();
    @Property(selector = "setSizeValue:")
    public native void setSizeValue(@ByVal CGSize v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "withPointValue:")
    public static native LOTSizeValueCallback withPointValue(@ByVal CGSize sizeValue);
    @Method(selector = "sizeForFrame:startKeyframe:endKeyframe:interpolatedProgress:startSize:endSize:currentSize:")
    public native @ByVal CGSize getSize(@MachineSizedFloat double currentFrame, @MachineSizedFloat double startKeyframe, @MachineSizedFloat double endKeyframe, @MachineSizedFloat double interpolatedProgress, @ByVal CGSize startSize, @ByVal CGSize endSize, @ByVal CGSize interpolatedSize);
    /*</methods>*/
}
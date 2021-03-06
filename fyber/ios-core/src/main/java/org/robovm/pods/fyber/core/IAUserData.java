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
package org.robovm.pods.fyber.core;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IAUserData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IAInterfaceBuilder, IAUserDataBuilder/*</implements>*/ {

    /*<ptr>*/public static class IAUserDataPtr extends Ptr<IAUserData, IAUserDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IAUserData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IAUserData() {}
    protected IAUserData(Handle h, long handle) { super(h, handle); }
    protected IAUserData(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "age")
    public native @MachineSizedUInt long getAge();
    @Property(selector = "setAge:")
    public native void setAge(@MachineSizedUInt long v);
    @Property(selector = "gender")
    public native IAUserGenderType getGender();
    @Property(selector = "setGender:")
    public native void setGender(IAUserGenderType v);
    @Property(selector = "zipCode")
    public native String getZipCode();
    @Property(selector = "setZipCode:")
    public native void setZipCode(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "build:")
    public static native IAUserData build(@Block VoidBlock1<IAUserDataBuilder> buildBlock);
    /*</methods>*/
}

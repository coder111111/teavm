/*
 *  Copyright 2014 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.jso.dom.events;

import org.teavm.jso.JSProperty;
import org.teavm.jso.core.JSArray;

// From https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent

public interface TouchEvent extends Event {

    @JSProperty
    boolean getCtrlKey();

    @JSProperty
    boolean getShiftKey();

    @JSProperty
    boolean getAltKey();

    @JSProperty
    boolean getMetaKey();
    
    @JSProperty
    JSArray<Touch> getChangedTouches();
    
    @JSProperty
    JSArray<Touch> getTargetTouches();
    
    @JSProperty
    JSArray<Touch> getTouches();
    
}

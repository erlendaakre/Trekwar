/*
 * Copyright 2012 FrostVoid Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.frostvoid.trekwar.common.net.messaging.requests;

import com.frostvoid.trekwar.common.net.messaging.Request;

/**
 * Tells server to demolish a structure
 *
 * @author Erlend Aakre
 * @author FrostVoid Software
 * @author http://www.frostvoid.com
 */
public class DemolishStructureRequest extends Request {
    private int x;
    private int y;
    private int planetNumber;
    private int slot;

    public DemolishStructureRequest(int x, int y, int planetNumber, int slot) {
        this.x = x;
        this.y = y;
        this.planetNumber = planetNumber;
        this.slot = slot;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @return the planetNumber
     */
    public int getPlanetNumber() {
        return planetNumber;
    }

    /**
     * @return the slot
     */
    public int getSlot() {
        return slot;
    }
}

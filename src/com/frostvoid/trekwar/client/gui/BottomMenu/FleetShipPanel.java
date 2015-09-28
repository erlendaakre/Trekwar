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
package com.frostvoid.trekwar.client.gui.BottomMenu;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import com.frostvoid.trekwar.common.Fleet;

/**
 * Shows icons + bars for all the ships in a fleet.
 *
 * @author Erlend Aakre
 * @author FrostVoid Software
 * @author http://www.frostvoid.com
 */
public class FleetShipPanel extends JPanel {
    
    public FleetShipPanel() {
        setLayout(null);
        
//        JScrollPane shipsPane = new JScrollPane();
//        shipsPane.setBounds(0, 50, 150, 105);
//        add(shipsPane);
    }
    
    public void setFleet(Fleet f) {
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(0,0,1000,1000);
        paintComponents(g);
    }
}
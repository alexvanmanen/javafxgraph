/*
 * (C) Copyright 2012 JavaFXGraph (http://code.google.com/p/javafxgraph/).
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 3.0 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
package com.google.code.javafxgraph;

import javafx.scene.input.MouseEvent;

public abstract class FXTool {

    public abstract void mousePressedOnNode(MouseEvent aEvent, FXNode aNode);

    public abstract void mousePressedOnEdge(MouseEvent aEvent, FXEdge aEdge);

    public abstract void mousePressedOnEdgeWayPoint(MouseEvent aEvent, FXEdgeWayPoint aWayPoint);

    public abstract void mousePressed(MouseEvent aEvent);

    public abstract void mouseDragged(MouseEvent aEvent);

    public abstract void mouseReleased(MouseEvent aEvent);
}

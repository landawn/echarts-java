/*
 * Copyright (C) 2019 HaiYang Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.landawn.echarts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 *  
 * @see {@link https://echarts.apache.org/en/option.html#title}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class Title {
    private String id;
    private boolean show = true;
    private String text = "";
    private String link = "";
    private String target = "blank";
    private TextStyle textStyle = new TextStyle().color(new Color().value("#333"))
            .fontStyle("normal")
            .fontWeight("normal")
            .fontFamily("sans-serif")
            .fontSize(18)
            .textBorderColor("transparent")
            .textBorderWidth(0)
            .textShadowColor("transparent");
    private Rich rich;
    private String subtext = "";
    private String sublink = "";
    private String subtarget = " blank";
    private SubtextStyle subtextStyle;
    private String textAlign = "auto";
    private String textVerticalAlign = "auto";
    private boolean triggerEvent = false;
    private int padding = 5;
    private int itemGap = 10;
    private int zlevel = 0;
    private int z = 2;
    private String left = "auto";
    private String top = "auto";
    private String right = "auto";
    private String bottom = "auto";
    private Color backgroundColor = Color.of("transparent");
    private Color borderColor = Color.of("#ccc");
    private int borderWidth;
    private int borderRadius;
    private int shadowBlur;
    private Color shadowColor;
    private int shadowOffsetX;
    private int shadowOffsetY;

    // TODO
}

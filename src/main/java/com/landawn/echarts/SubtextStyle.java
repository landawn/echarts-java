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
public class SubtextStyle {
    private Color color;
    private String fontStyle;
    private String fontWeight;
    private String fontFamily;
    private int fontSize;
    private String align;
    private String verticalAlign;
    private int lineHeight;
    private String width;
    private String heigh;
    private String textBorderColor;
    private int textBorderWidth;
    private String textShadowColor;
    private int textShadowBlur;
    private int textShadowOffsetX;
    private int textShadowOffsetY;

}

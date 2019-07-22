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
    private boolean show;
    private String text;
    private String link;
    private String target;
    private String textStyle;
    private String subtext;
    private String sublink;
    private String subtarget;
    private String subtextStyle;
    private String textAlign;

    // TODO
}

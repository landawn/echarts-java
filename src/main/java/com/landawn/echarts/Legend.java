package com.landawn.echarts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 *  
 * @see {@link https://echarts.apache.org/en/option.html#legend}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class Legend {
    private String id;
    private boolean show;

    // TODO

}

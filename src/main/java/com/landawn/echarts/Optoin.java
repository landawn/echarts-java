package com.landawn.echarts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 *  
 * @see {@link https://echarts.apache.org/en/option.html}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class Optoin {
    private Title title;
    private Legend legend;

    // TODO

}

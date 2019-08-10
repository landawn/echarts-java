package com.landawn.echarts;

import org.junit.jupiter.api.Test;

import com.landawn.abacus.parser.JSONSerializationConfig.JSC;
import com.landawn.abacus.util.N;

class JSONTest {

    @Test
    void test() {
        String json = N.toJSON(new Title().id("123").textStyle(new TextStyle().fontFamily("song")), JSC.create().setPrettyFormat(true));
        N.println(json);
    }

}

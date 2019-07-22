package com.landawn.echarts;

import org.junit.jupiter.api.Test;

import com.landawn.abacus.util.N;

class JSONTest {

    @Test
    void test() {
        String json = N.toJSON(new Title().id("123"));
        N.println(json);
    }

}

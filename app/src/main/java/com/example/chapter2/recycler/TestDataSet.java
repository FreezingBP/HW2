package com.example.chapter2.recycler;

import java.util.ArrayList;
import java.util.List;

public class TestDataSet {

    public static List<TestData> getData() {
        List<TestData> result = new ArrayList();
        result.add(new TestData("让人忘记原唱的歌手", "刚刚", "小刘"));
        result.add(new TestData("林丹退役", "刚刚","Andy"));
        result.add(new TestData("你在教我做事？", "刚刚","Bob"));
        result.add(new TestData("投身乡村教育的燃灯者", "1h 15min","Alice"));
        result.add(new TestData("暑期嘉年华", "1h 15min","Andy"));
        result.add(new TestData("2020年三伏天有40天", "1h 15min","Anan"));
        result.add(new TestData("会跟游客合照的老虎", "1h 15min","Cyd"));
        result.add(new TestData("苏州暴雨", "1h 15min","David"));
        result.add(new TestData("6月全国菜价上涨", "1h 15min","Father"));
        result.add(new TestData("猫的第六感有多强", "1h 15min","Mother"));
        result.add(new TestData("IU真好看", "1h 15min","Fuxk"));
        return result;
    }

}

package com.wx.ex;

/**
 * Created by wbj on 16-5-10.
 */
public class TimesRule implements Rule {
    private int times;

    private int times(int n, int times) {
        return n * times;
    }

    @Override
    public int compute(int month, Servant servant) {
        return times(servant.getBase(), times);
    }
}

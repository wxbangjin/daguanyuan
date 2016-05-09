package com.wx.ex;

/**
 * Created by wbj on 16-5-10.
 */
public class BaoYuRule implements Rule{
    private int times;
    public BaoYuRule(int times) {
        this.times = times;
    }
    @Override
    public int compute(int month, Servant servant) {
        return RuleUtil.times(servant.getBase(), times);
    }
}

package com.wx.ex;

/**
 * Created by wbj on 16-5-10.
 */
public class Master {
    private Servant servant;

    private Rule rule;

    public Master(Servant servant, Rule rule) {
        this.servant = servant;
        this.rule = rule;
    }

    public int compute(int month) {
        return rule.compute(month, servant);
    }
}

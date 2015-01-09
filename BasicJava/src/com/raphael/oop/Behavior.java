package com.raphael.oop;

/**
 * Created by Nov on 2015/1/9.
 */
public class Behavior implements Cloneable{
    public String walk;
    public String run;

    public Behavior(String walk, String run) {
        this.walk = walk;
        this.run = run;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public Object clone() throws CloneNotSupportedException {
        return (Behavior)super.clone();
    }

}

package com.corejava;

import java.util.Objects;

public class makeJavaBean {

    private String string;
    private String string1;

    public makeJavaBean(String string, String string1) {
        this.string = string;
        this.string1 = string1;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        makeJavaBean that = (makeJavaBean) o;
        if (this == o) return true;
        return Objects.equals(string, that.string) && Objects.equals(string1, that.string1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string, string1);
    }

    public String getString() {
        return string;
    }


    public void setString(String string) {
        this.string = string;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }
}

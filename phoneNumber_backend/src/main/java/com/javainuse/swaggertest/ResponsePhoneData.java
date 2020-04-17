package com.javainuse.swaggertest;

import java.util.ArrayList;

public class ResponsePhoneData {
    int total;
    int totalPages;
    ArrayList<String> list = new ArrayList<String>();

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "ResponsePhoneData{" +
                "total=" + total +
                ", list=" + list +
                '}';
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }



}

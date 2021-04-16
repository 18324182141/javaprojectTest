package com.qingcheng.entity;

import java.io.Serializable;
import java.util.List;

public class pageResult<T> implements Serializable {
    private long title;
    private List<T> rows;

    public pageResult(long title, List<T> rows) {
        this.title = title;
        this.rows = rows;
    }

    public long getTitle() {
        return title;
    }

    public void setTitle(long title) {
        this.title = title;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}

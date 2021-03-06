package com.zjj.jpa.entity;

import lombok.Data;

/**
 * 扩展类
 */
@Data
public class UserVo extends User {
    int page = 1;
    int pageSize = 3;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
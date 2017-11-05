package cn.ok.smp.domain;

/**
 * Created by Kyou on 2017/11/5 13:50.
 * PACKAGE_NAME: cn.ok.smp.domain
 * PROJECT_NAME: smp
 */
public class BaseDomain {

    private Integer pageNum = 1;

    private Integer PageSize = 10;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }
}

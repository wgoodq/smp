package cn.ok.smp.domain;

/**
 * Created by Kyou on 2017/11/5 9:27.
 * PACKAGE_NAME: cn.ok.domain
 * PROJECT_NAME: springboot-mybais-pagehelper
 */
public class Result<T> {
    private boolean success = true;
    private T data;
    private String msg = "";

    public Result() {
    }

    public Result(T data) {
        this.data = data;
    }

    public Result(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}

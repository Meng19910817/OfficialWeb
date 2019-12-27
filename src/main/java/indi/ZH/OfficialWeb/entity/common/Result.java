package indi.ZH.OfficialWeb.entity.common;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 返回包装类
 */
@AllArgsConstructor

@Data
public class Result {

    private boolean flag;

    private Integer code;

    private List<Object> dataList;

    private Object data;


    public Result(boolean b, int fail) {
    }


    public Result(List<Object> dataList) {
        this.dataList = dataList;
    }
    public Result(boolean flag, Integer code) {
        this.code = code;
        this.flag = flag;
    }

}

package indi.ZH.OfficialWeb.entity.wx;

import lombok.Data;

import java.io.Serializable;

@Data
public class WeChatSession implements Serializable {
    private String openid;
    private String session_key;
    private String unionid;
    private Integer errcode;
    private String errmsg;
}

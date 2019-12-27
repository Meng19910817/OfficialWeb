package indi.ZH.OfficialWeb.service;

public interface WXService {
    /**
     * openid
     * @param code
     * @return
     */
    public String getMiniOpenid(String code);
}

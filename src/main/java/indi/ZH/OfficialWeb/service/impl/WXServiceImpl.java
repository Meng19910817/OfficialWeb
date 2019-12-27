package indi.ZH.OfficialWeb.service.impl;

import com.google.gson.Gson;
import indi.ZH.OfficialWeb.entity.wx.WeChatSession;
import indi.ZH.OfficialWeb.exception.BusinessException;
import indi.ZH.OfficialWeb.service.WXService;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
public class WXServiceImpl implements WXService {

    private static final String appid = "wx798c61cb91e7904b";

    private static final String secret = "88ec00245670eacd6075d0b545dfb771";

    private static final String grantType = "authorization_code";

    String authorizationCodeUrl= "https://api.weixin.qq.com/sns/jscode2session?appid=%s&amp;secret=%s&amp;js_code=%s&amp;grant_type=authorization_code";

    @Override
    public String getMiniOpenid(String code) {
        WeChatSession wechatSession = null;
        try {
            wechatSession = getOpenidFromWx(code);
        } catch (BusinessException e) {
            e.printStackTrace();
        }

        return wechatSession.getOpenid();
    }

    private String getTokenFromWX(String session_key) {
            return "成功的token";
    }

    /**
     * 向微信服务器获取openid
     * @param code wx.login
     * @return
     * @throws BusinessException
     */
    private WeChatSession getOpenidFromWx(String code) throws BusinessException {
        String js_code = null;
        try {
            js_code = URLEncoder.encode(code, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format(authorizationCodeUrl, appid, secret, js_code);
        //进行网络请求,访问url接口
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        //根据返回值进行后续操作
        if (responseEntity != null && responseEntity.getStatusCode() == HttpStatus.OK) {
            String sessionData = responseEntity.getBody();
            Gson gson = new Gson();
            //解析从微信服务器获得的openid和session_key;
            WeChatSession weChatSession = gson.fromJson(sessionData, WeChatSession.class);
            if (weChatSession == null){
                throw new BusinessException("获取openid接口返回空值");
            }
            System.out.print(weChatSession.getErrcode() + "," + weChatSession.getErrmsg());
            return weChatSession;
        }
        return null;
    }
}
package indi.ZH.OfficialWeb.entity.Banner;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Banner implements Serializable {
    private Integer bannerId;

    private String bannerName;

    private String imgUrl;

    private String redirectUrl;

    private Integer isValidate;

    private Date validateTime;

}
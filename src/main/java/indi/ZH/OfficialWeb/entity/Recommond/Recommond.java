package indi.ZH.OfficialWeb.entity.Recommond;

import lombok.Data;

import java.io.Serializable;

@Data
public class Recommond implements Serializable {
    private Integer recommonId;

    private String title;

    private String imgUrl;

    private String redirectUrl;

}
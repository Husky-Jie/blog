package com.husky.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

  private long userId;
  private String userName;
  private String userPass;
  private String userNickname;
  private String userEmail;
  private String userUrl;
  private String userAvatar;
  private String userLastLoginIp;
  private Date userRegisterTime;
  private Date userLastLoginTime;
  private long userStatus;
  private String userRole;

}

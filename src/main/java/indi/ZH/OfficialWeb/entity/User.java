package indi.ZH.OfficialWeb.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 * @ZOUMENGYU
 * 2019-11-13 8:34pm
 */
public class User implements Serializable {
    private String userUuid;
    private String companyId;//关联公司id
    private String roleId;//关联角色id

    private String name;//用户名
    private String password;//密码
    private String oldPassword;//旧密码

    private Date birthday;//生日
    private Integer gender;//性别
    private Integer age;//年龄
    private String phone;//电话号码

    private Integer profession;//职业：0学生；1工作
    private String major;//专业
    private String professionName;//职业名称

    private Integer examType;//考试类型：0雅思；1托福；2GMAT；3GRE
    private Integer userType;//用户类型：0总管理员；1公司总管理员；2管理员；3普通用户
    private Double period;//已准备考试时间
    private Date nextExam;//下次考试时间

    private String loginIP;//登陆ip地址
    private Date quiteTime;//安全退出时间

    private String creator;
    private Date createTime;
    private String updator;
    private Date updateTime;

    private String R1;//预留字段
    private String R2;
    private String R3;
    private String R4;
    private String R5;


    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getProfession() {
        return profession;
    }

    public void setProfession(Integer profession) {
        this.profession = profession;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public Integer getExamType() {
        return examType;
    }

    public void setExamType(Integer examType) {
        this.examType = examType;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Double getPeriod() {
        return period;
    }

    public void setPeriod(Double period) {
        this.period = period;
    }

    public Date getNextExam() {
        return nextExam;
    }

    public void setNextExam(Date nextExam) {
        this.nextExam = nextExam;
    }

    public String getLoginIP() {
        return loginIP;
    }

    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }

    public Date getQuiteTime() {
        return quiteTime;
    }

    public void setQuiteTime(Date quiteTime) {
        this.quiteTime = quiteTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getR1() {
        return R1;
    }

    public void setR1(String r1) {
        R1 = r1;
    }

    public String getR2() {
        return R2;
    }

    public void setR2(String r2) {
        R2 = r2;
    }

    public String getR3() {
        return R3;
    }

    public void setR3(String r3) {
        R3 = r3;
    }

    public String getR4() {
        return R4;
    }

    public void setR4(String r4) {
        R4 = r4;
    }

    public String getR5() {
        return R5;
    }

    public void setR5(String r5) {
        R5 = r5;
    }
}

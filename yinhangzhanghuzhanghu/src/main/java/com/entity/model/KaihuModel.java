package com.entity.model;

import com.entity.KaihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 账户信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaihuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 卡号
     */
    private String kaihuUuidNumber;


    /**
     * 账户类型
     */
    private Integer kaihuTypes;


    /**
     * 账户余额
     */
    private Double kaihuMoney;


    /**
     * 开户备注
     */
    private String kaihuContent;


    /**
     * 开户时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：卡号
	 */
    public String getKaihuUuidNumber() {
        return kaihuUuidNumber;
    }


    /**
	 * 设置：卡号
	 */
    public void setKaihuUuidNumber(String kaihuUuidNumber) {
        this.kaihuUuidNumber = kaihuUuidNumber;
    }
    /**
	 * 获取：账户类型
	 */
    public Integer getKaihuTypes() {
        return kaihuTypes;
    }


    /**
	 * 设置：账户类型
	 */
    public void setKaihuTypes(Integer kaihuTypes) {
        this.kaihuTypes = kaihuTypes;
    }
    /**
	 * 获取：账户余额
	 */
    public Double getKaihuMoney() {
        return kaihuMoney;
    }


    /**
	 * 设置：账户余额
	 */
    public void setKaihuMoney(Double kaihuMoney) {
        this.kaihuMoney = kaihuMoney;
    }
    /**
	 * 获取：开户备注
	 */
    public String getKaihuContent() {
        return kaihuContent;
    }


    /**
	 * 设置：开户备注
	 */
    public void setKaihuContent(String kaihuContent) {
        this.kaihuContent = kaihuContent;
    }
    /**
	 * 获取：开户时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：开户时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

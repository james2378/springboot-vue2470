package com.entity.vo;

import com.entity.KaihuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 账户信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaihu")
public class KaihuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 卡号
     */

    @TableField(value = "kaihu_uuid_number")
    private String kaihuUuidNumber;


    /**
     * 账户类型
     */

    @TableField(value = "kaihu_types")
    private Integer kaihuTypes;


    /**
     * 账户余额
     */

    @TableField(value = "kaihu_money")
    private Double kaihuMoney;


    /**
     * 开户备注
     */

    @TableField(value = "kaihu_content")
    private String kaihuContent;


    /**
     * 开户时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：卡号
	 */
    public String getKaihuUuidNumber() {
        return kaihuUuidNumber;
    }


    /**
	 * 获取：卡号
	 */

    public void setKaihuUuidNumber(String kaihuUuidNumber) {
        this.kaihuUuidNumber = kaihuUuidNumber;
    }
    /**
	 * 设置：账户类型
	 */
    public Integer getKaihuTypes() {
        return kaihuTypes;
    }


    /**
	 * 获取：账户类型
	 */

    public void setKaihuTypes(Integer kaihuTypes) {
        this.kaihuTypes = kaihuTypes;
    }
    /**
	 * 设置：账户余额
	 */
    public Double getKaihuMoney() {
        return kaihuMoney;
    }


    /**
	 * 获取：账户余额
	 */

    public void setKaihuMoney(Double kaihuMoney) {
        this.kaihuMoney = kaihuMoney;
    }
    /**
	 * 设置：开户备注
	 */
    public String getKaihuContent() {
        return kaihuContent;
    }


    /**
	 * 获取：开户备注
	 */

    public void setKaihuContent(String kaihuContent) {
        this.kaihuContent = kaihuContent;
    }
    /**
	 * 设置：开户时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：开户时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

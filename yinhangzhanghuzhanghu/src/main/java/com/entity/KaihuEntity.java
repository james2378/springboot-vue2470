package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 账户信息
 *
 * @author 
 * @email
 */
@TableName("kaihu")
public class KaihuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KaihuEntity() {

	}

	public KaihuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kaihu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", kaihuUuidNumber=" + kaihuUuidNumber +
            ", kaihuTypes=" + kaihuTypes +
            ", kaihuMoney=" + kaihuMoney +
            ", kaihuContent=" + kaihuContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}

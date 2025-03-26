package com.entity.vo;

import com.entity.CuenquyewuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 存取业务
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("cuenquyewu")
public class CuenquyewuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 开户
     */

    @TableField(value = "kaihu_id")
    private Integer kaihuId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 存取金额
     */

    @TableField(value = "cuenquyewu_price")
    private Double cuenquyewuPrice;


    /**
     * 存取类型
     */

    @TableField(value = "cuenquyewu_types")
    private Integer cuenquyewuTypes;


    /**
     * 存取时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
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
	 * 设置：开户
	 */
    public Integer getKaihuId() {
        return kaihuId;
    }


    /**
	 * 获取：开户
	 */

    public void setKaihuId(Integer kaihuId) {
        this.kaihuId = kaihuId;
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
	 * 设置：存取金额
	 */
    public Double getCuenquyewuPrice() {
        return cuenquyewuPrice;
    }


    /**
	 * 获取：存取金额
	 */

    public void setCuenquyewuPrice(Double cuenquyewuPrice) {
        this.cuenquyewuPrice = cuenquyewuPrice;
    }
    /**
	 * 设置：存取类型
	 */
    public Integer getCuenquyewuTypes() {
        return cuenquyewuTypes;
    }


    /**
	 * 获取：存取类型
	 */

    public void setCuenquyewuTypes(Integer cuenquyewuTypes) {
        this.cuenquyewuTypes = cuenquyewuTypes;
    }
    /**
	 * 设置：存取时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：存取时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

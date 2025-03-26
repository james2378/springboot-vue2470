package com.entity.vo;

import com.entity.GuashiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 挂失信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("guashi")
public class GuashiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "kaihu_id")
    private Integer kaihuId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 挂失类型
     */

    @TableField(value = "guashi_types")
    private Integer guashiTypes;


    /**
     * 挂失备注
     */

    @TableField(value = "guashi_content")
    private String guashiContent;


    /**
     * 挂失时间
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
	 * 设置：账户
	 */
    public Integer getKaihuId() {
        return kaihuId;
    }


    /**
	 * 获取：账户
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
	 * 设置：挂失类型
	 */
    public Integer getGuashiTypes() {
        return guashiTypes;
    }


    /**
	 * 获取：挂失类型
	 */

    public void setGuashiTypes(Integer guashiTypes) {
        this.guashiTypes = guashiTypes;
    }
    /**
	 * 设置：挂失备注
	 */
    public String getGuashiContent() {
        return guashiContent;
    }


    /**
	 * 获取：挂失备注
	 */

    public void setGuashiContent(String guashiContent) {
        this.guashiContent = guashiContent;
    }
    /**
	 * 设置：挂失时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：挂失时间
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

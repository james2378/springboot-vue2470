package com.entity.view;

import com.entity.GuashiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 挂失信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("guashi")
public class GuashiView extends GuashiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 挂失类型的值
		*/
		private String guashiValue;



		//级联表 kaihu
			/**
			* 账户信息 的 用户
			*/
			private Integer kaihuYonghuId;
			/**
			* 卡号
			*/
			private String kaihuUuidNumber;
			/**
			* 账户类型
			*/
			private Integer kaihuTypes;
				/**
				* 账户类型的值
				*/
				private String kaihuValue;
			/**
			* 账户余额
			*/
			private Double kaihuMoney;
			/**
			* 开户备注
			*/
			private String kaihuContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public GuashiView() {

	}

	public GuashiView(GuashiEntity guashiEntity) {
		try {
			BeanUtils.copyProperties(this, guashiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 挂失类型的值
			*/
			public String getGuashiValue() {
				return guashiValue;
			}
			/**
			* 设置： 挂失类型的值
			*/
			public void setGuashiValue(String guashiValue) {
				this.guashiValue = guashiValue;
			}













				//级联表的get和set kaihu

					/**
					* 获取：账户信息 的 用户
					*/
					public Integer getKaihuYonghuId() {
						return kaihuYonghuId;
					}
					/**
					* 设置：账户信息 的 用户
					*/
					public void setKaihuYonghuId(Integer kaihuYonghuId) {
						this.kaihuYonghuId = kaihuYonghuId;
					}


					/**
					* 获取： 卡号
					*/
					public String getKaihuUuidNumber() {
						return kaihuUuidNumber;
					}
					/**
					* 设置： 卡号
					*/
					public void setKaihuUuidNumber(String kaihuUuidNumber) {
						this.kaihuUuidNumber = kaihuUuidNumber;
					}

					/**
					* 获取： 账户类型
					*/
					public Integer getKaihuTypes() {
						return kaihuTypes;
					}
					/**
					* 设置： 账户类型
					*/
					public void setKaihuTypes(Integer kaihuTypes) {
						this.kaihuTypes = kaihuTypes;
					}


						/**
						* 获取： 账户类型的值
						*/
						public String getKaihuValue() {
							return kaihuValue;
						}
						/**
						* 设置： 账户类型的值
						*/
						public void setKaihuValue(String kaihuValue) {
							this.kaihuValue = kaihuValue;
						}

					/**
					* 获取： 账户余额
					*/
					public Double getKaihuMoney() {
						return kaihuMoney;
					}
					/**
					* 设置： 账户余额
					*/
					public void setKaihuMoney(Double kaihuMoney) {
						this.kaihuMoney = kaihuMoney;
					}

					/**
					* 获取： 开户备注
					*/
					public String getKaihuContent() {
						return kaihuContent;
					}
					/**
					* 设置： 开户备注
					*/
					public void setKaihuContent(String kaihuContent) {
						this.kaihuContent = kaihuContent;
					}







				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}

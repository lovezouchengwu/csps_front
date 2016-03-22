package com.edot.util;

public class ConstantUtils {

	public static final int PAGE_SIZE = 10;
	
	public static final int STATUS_RELEASED = 1;		// 已发布
	public static final int STATUS_TO_RELEASE = 2;		// 待发布
	public static final int STATUS_CANCEL = 3;			// 已撤销
	public static final int STATUS_TO_AUDIT = 4;		// 待审核
	public static final int STATUS_AUDIT_FAILED = 5;	// 审核失败
	
	public static final int UNIT_TAI = 1;		// 台
	public static final int UNIT_LIANG = 2;		// 辆
	public static final int UNIT_JIAN = 3;		// 件
	public static final int UNIT_GE = 4;		// 个
	
	public static final int PRICE_UNIT_TAI = 1;		// 元/台
	public static final int PRICE_UNIT_LIANG = 2;	// 元/辆
	public static final int PRICE_UNIT_JIAN = 3;	// 元/件
	public static final int PRICE_UNIT_GE = 4;		// 元/个
	
	public static final int PRICE_UNIT_MONTH = 1;	// 元/平/月
	public static final int PRICE_UNIT_QUARTER = 2;	// 元/平/季
	public static final int PRICE_UNIT_YEAR = 3;	// 元/平/年
	
	public static final int TYPE_CONSIGNOR = 1;	// 个人货主
	public static final int TYPE_DRIVER = 2;	// 个人司机
	public static final int TYPE_SHIPPER = 11;	// 商户企业
	public static final int TYPE_LOGISTICS = 12;// 物流企业
	
	public static final String GENDER_NONE = "N";	// 保密
	public static final String GENDER_MALE = "M";	// 男
	public static final String GENDER_FEMALE = "F";	// 女
	
	public static final int COMPANY_LEVEL_NONE = 0;		// 无资质等级
	public static final int COMPANY_LEVEL_LOW = 1;		// 低
	public static final int COMPANY_LEVEL_MIDDLE = 2;	// 中
	public static final int COMPANY_LEVEL_HIGH = 3;		// 高
	
	public static final String PROPERTY_GOVERNMENT_TYPE = "government.type";
	public static final String PROPERTY_POLICY_TYPE = "policy.type";
	
}

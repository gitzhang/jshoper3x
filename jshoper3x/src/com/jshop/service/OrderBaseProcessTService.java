package com.jshop.service;

import java.util.List;

import com.jshop.entity.CartT;
import com.jshop.entity.DeliverAddressT;
import com.jshop.entity.LogisticsBusinessT;
import com.jshop.entity.LogisticsbusinessareaT;
import com.jshop.entity.MemberT;
import com.jshop.entity.PaymentM;

/**
 * 订单生成过程必须调用的方法
 * @author sdywcd
 *
 */
public interface OrderBaseProcessTService {
	/**
	 * 获取当前用户的所有收货地址
	 * @param m
	 * @return
	 */
	public List<DeliverAddressT>getMemberDeliverAddress(MemberT m);
	
	/**
	 * 获取当前可用的物流商信息
	 * @param state
	 * @return
	 */
	public List<LogisticsBusinessT>getLogisticstsBusiness(String state);
	/**
	 * 获取当前可用的支付方式
	 * @param state
	 * @return
	 */
	public List<PaymentM>getPaymentM(String state);
	/**
	 * 获取当前用的购物车信息
	 * @param memberid
	 * @param state
	 * @param orderTag
	 * @return
	 */
	public List<CartT>getMemberCart(String memberid,String state,String orderTag);
	/**
	 * 获取系统默认的物流商
	 * @param visiable
	 * @return
	 */
	public List<LogisticsBusinessT>getDefaultLogisticsBusinessT(String visiable);
	/**
	 * 获取系统默认物流商的全过阶梯运费信息
	 * @param logisticsid
	 * @return
	 */
	public List<LogisticsbusinessareaT>getDefaultLogisticsbusinessareaT(String logisticsid);
}
package com.nieyue.service;

import java.util.List;

import com.nieyue.bean.Advertise;

/**
 * 广告逻辑层接口
 * @author yy
 *
 */
public interface AdvertiseService {
	/** 新增广告 */	
	public boolean addAdvertise(Advertise advertise) ;	
	/** 删除广告 */	
	public boolean delAdvertise(Integer advertiseId) ;
	/** 更新广告*/	
	public boolean updateAdvertise(Advertise advertise);
	/** 装载广告 */	
	public Advertise loadAdvertise(Integer advertiseId);	
	/** 广告总共数目 */	
	public int countAll(Integer adminId,String type,String subtype,String billingMode,String region);		
	/** 分页广告 */
	public List<Advertise> browsePagingAdvertise(int pageNum,int pageSize,String orderName,String orderWay) ;
	/** 根据金额随机一条广告 */
	public Advertise browsePagingAdvertiseSpaceShowAdvertise(String type,String subtype,String billingMode,String region,Double unitPrice,String status) ;
	/** 根据金额随机一条广告 备胎 */
	public List<Advertise> browsePagingAdvertiseSpaceShowAdvertiseBei(String type,String subtype,String billingMode,String region,Double unitPrice,String status) ;
	/** 根据管理员分页广告 */
	public List<Advertise> browsePagingAdvertiseByAdminId(Integer adminId,int pageNum,int pageSize,String orderName,String orderWay) ;		
}

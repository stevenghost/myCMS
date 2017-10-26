package cn.aresoft.service;
import cn.aresoft.entity.TbTestUserEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TbTestUserServiceI extends CommonService{
	
 	public void delete(TbTestUserEntity entity) throws Exception;
 	
 	public Serializable save(TbTestUserEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TbTestUserEntity entity) throws Exception;
 	
}

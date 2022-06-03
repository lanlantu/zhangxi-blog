package com.mayikt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mayikt.entity.OperationLog;
import org.springframework.stereotype.Repository;


/**
 * 操作日志
 *
 * @author yezhiqiu
 * @date 2021/08/10
 */
@Repository
public interface OperationLogDao extends BaseMapper<OperationLog> {
}

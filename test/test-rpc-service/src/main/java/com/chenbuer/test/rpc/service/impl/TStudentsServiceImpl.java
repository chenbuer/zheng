package com.chenbuer.test.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.chenbuer.test.dao.mapper.TStudentsMapper;
import com.chenbuer.test.dao.model.TStudents;
import com.chenbuer.test.dao.model.TStudentsExample;
import com.chenbuer.test.rpc.api.TStudentsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TStudentsService实现
* Created by shuzheng on 2018/4/25.
*/
@Service
@Transactional
@BaseService
public class TStudentsServiceImpl extends BaseServiceImpl<TStudentsMapper, TStudents, TStudentsExample> implements TStudentsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TStudentsServiceImpl.class);

    @Autowired
    TStudentsMapper tStudentsMapper;

}
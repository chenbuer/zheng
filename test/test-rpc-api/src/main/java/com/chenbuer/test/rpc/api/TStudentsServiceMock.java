package com.chenbuer.test.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.chenbuer.test.dao.mapper.TStudentsMapper;
import com.chenbuer.test.dao.model.TStudents;
import com.chenbuer.test.dao.model.TStudentsExample;

/**
* 降级实现TStudentsService接口
* Created by shuzheng on 2018/4/25.
*/
public class TStudentsServiceMock extends BaseServiceMock<TStudentsMapper, TStudents, TStudentsExample> implements TStudentsService {

}

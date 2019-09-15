package com.subway.manager.service;

import com.subway.manager.api.JsonMapper;
import com.subway.manager.api.MapperBuilder;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

public abstract class AbstractService {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected static JsonMapper mapper = MapperBuilder.getDefaultMapper();

    @Resource
    protected SqlSession sqlSession;
}
package com.lovecoding.service.impl;

import com.lovecoding.mapper.BaseDictMapper;
import com.lovecoding.pojo.BaseDict;
import com.lovecoding.pojo.BaseDictExample;
import com.lovecoding.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseDictServiceImpl implements BaseDictService {

    @Autowired
    BaseDictMapper baseDictMapper;

    @Override
    public List<BaseDict> getDictTypeName(String typeCode) {
        BaseDictExample baseDictExample = new BaseDictExample();
        baseDictExample.createCriteria().andDictTypeCodeEqualTo(typeCode);

        return baseDictMapper.selectByExample(baseDictExample);
    }
}

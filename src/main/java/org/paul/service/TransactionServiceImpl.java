package org.paul.service;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.paul.mapper.Sample2Mapper;
import org.paul.mapper.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService {

    @Setter(onMethod_ = @Autowired)
    private SampleMapper mapper;

    @Setter(onMethod_ = @Autowired)
    private Sample2Mapper mapper2;


    @Transactional
    @Override
    public void add(String value) {
        mapper.insertCol500(value);
        mapper.insertCol50(value);
    }


}

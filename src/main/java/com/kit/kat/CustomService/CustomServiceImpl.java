package com.kit.kat.CustomService;

import com.kit.kat.CustomRepository.ICustomRepository;
import com.kit.kat.Customs.Custom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Ash on 02-Jun-14.
 */
@Component("customService")
@Scope("prototype") //default is Singleton
public class CustomServiceImpl implements ICustomService {

    //setter injection
    @Autowired
    public void setCustomRepository(ICustomRepository anotherRepository) {
        this.customRepository = anotherRepository;
    }

    //@Autowired
    private ICustomRepository customRepository;

    public CustomServiceImpl(){}

    public CustomServiceImpl(int something){
        //a default constructor is needed for setter injection.

    }

    //@Value("${myself}")
    private String addBlessings;

    @Override
    public void blessTheWorld(){

        for(Custom c : customRepository.findAll()){
            System.out.println("May the world be blessed by " + c.getCustomName() + " & " + addBlessings);
        }

    }
}

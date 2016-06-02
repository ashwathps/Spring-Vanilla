package com.kit.kat.CustomRepository;

import com.kit.kat.Customs.Custom;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ash on 02-Jun-14.
 */
@Component("customRepository")
public class CustomRepositoryImpl implements ICustomRepository {

    private List<Custom> customs  = new ArrayList<Custom>();
    @Override
    public List<Custom> findAll(){

        Custom hindu = new Custom();
        hindu.setCustomName("hindhuism");

        Custom christian = new Custom();
        christian.setCustomName("christianity");

        customs.add(hindu);
        customs.add(christian);

        return customs;
    }

}

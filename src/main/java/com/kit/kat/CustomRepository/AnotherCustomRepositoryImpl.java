package com.kit.kat.CustomRepository;

import com.kit.kat.Customs.Custom;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ash on 02-Jun-14.
 */
@Repository("anotherRepository")
public class AnotherCustomRepositoryImpl  implements ICustomRepository {

        private List<Custom> customs  = new ArrayList<Custom>();
        @Override
        public List<Custom> findAll(){

            Custom jew = new Custom();
            jew.setCustomName("Jewism");

            Custom buddhist = new Custom();
            buddhist.setCustomName("Buddhism");

            customs.add(jew);
            customs.add(buddhist);

            return customs;
        }

    }

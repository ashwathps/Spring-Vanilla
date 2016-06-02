package com.kit.kat.CustomRepository;

import com.kit.kat.Customs.Custom;

import java.util.List;

/**
 * Created by Ash on 02-Jun-14.
 */
public interface ICustomRepository {
    List<Custom> findAll();
}

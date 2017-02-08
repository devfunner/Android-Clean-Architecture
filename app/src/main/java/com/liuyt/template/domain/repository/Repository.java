package com.liuyt.template.domain.repository;

import com.liuyt.template.domain.model.SampleModel;

/**
 * Created by user on 17-2-8.
 * A sample repository with CRUD operations on a model.
 */
public interface Repository {

    boolean insert(SampleModel model);

    boolean update(SampleModel model);

    SampleModel get(Object id);

    boolean delete(SampleModel model);
}
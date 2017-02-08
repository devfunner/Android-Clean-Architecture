package com.liuyt.template.presentation.presenters.impl;


import com.liuyt.template.domain.executor.Executor;
import com.liuyt.template.domain.executor.MainThread;
import com.liuyt.template.domain.interactors.SampleInteractor;
import com.liuyt.template.presentation.presenters.MainPresenter;
import com.liuyt.template.presentation.presenters.base.AbstractPresenter;

/**
 * Created by liuyuang on 17-2-8.
 */

public class MainPresenterImpl extends AbstractPresenter implements MainPresenter,
        SampleInteractor.Callback {

    private MainPresenter.View mView;

    public MainPresenterImpl(Executor executor,
                             MainThread mainThread,
                             View view) {
        super(executor, mainThread);
        mView = view;
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void onError(String message) {

    }
}

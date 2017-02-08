package com.liuyt.template.presentation.presenters.base;

import com.liuyt.template.domain.executor.Executor;
import com.liuyt.template.domain.executor.MainThread;

/**
 * Created by liuyutang on 17-2-8.
 * This is a base class for all presenters which are communicating with interactors. This base class will hold a
 * reference to the Executor and MainThread objects that are needed for running interactors in a background thread.
 */
public abstract class AbstractPresenter {
    protected Executor mExecutor;
    protected MainThread mMainThread;

    public AbstractPresenter(Executor executor, MainThread mainThread) {
        mExecutor = executor;
        mMainThread = mainThread;
    }
}
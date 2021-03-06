package com.teamgames.gamepayments.deprecated_request.result.listener;

import com.teamgames.gamepayments.deprecated_request.Request;
import com.teamgames.gamepayments.deprecated_request.result.Result;

/**
 * Created by Jason MK on 2020-01-02 at 3:22 p.m.
 */
public interface ResultListener<T extends Result, R extends Request<T>> {

    void listen(R request, T result);

}

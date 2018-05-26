package com.zheng.upms.client.shiro.session;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.SessionDAO;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by buer on 2018/5/13.
 */
public class MySessionDao implements SessionDAO {
    @Override
    public Serializable create(Session session) {
        return null;
    }

    @Override
    public Session readSession(Serializable sessionId) throws UnknownSessionException {
        return null;
    }

    @Override
    public void update(Session session) throws UnknownSessionException {

    }

    @Override
    public void delete(Session session) {

    }

    @Override
    public Collection<Session> getActiveSessions() {
        return null;
    }
}

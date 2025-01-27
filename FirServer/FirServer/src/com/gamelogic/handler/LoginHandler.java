package com.gamelogic.handler;

import com.common.Protocal;
import com.gamelogic.entity.UserEntity;
import com.google.protobuf.InvalidProtocolBufferException;
import com.handler.BaseHandler;
import com.protos.Person;
import com.protos.ResLogin;
import com.protos.UserInfo;
import com.smartfoxserver.v2.entities.User;
import com.tables.enums.ProtoType;

public class LoginHandler extends BaseHandler {
    @Override
    public void OnMessage(User user, byte[] bytes) {
        ///解析客户端数据
        Person person = null;
        try {
            person = Person.parseFrom(bytes);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        if (person != null) {
            logMgr().Trace("Person Count: " + person.getName());
        }

        ///从数据库初始化数据
        UserEntity userEntity = new UserEntity("10000");
        if (userEntity != null) {
            userEntity.Initialize();
        }
        
        ///发送reply数据
        UserInfo info = UserInfo.newBuilder()
            .setUserid("10000")
            .setName("张三")
            .setMoney(999999)
            .build();
        ResLogin login = ResLogin.newBuilder()
            .setUserinfo(info)
            .build();
        SendData(user, ProtoType.LuaProtoMsg, Protocal.ResLogin, login);
    }
}


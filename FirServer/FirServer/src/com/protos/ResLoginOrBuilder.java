// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pbuser.proto

package com.protos;

public interface ResLoginOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pb_user.ResLogin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .pb_common.ResultCode result = 1;</code>
   */
  int getResultValue();
  /**
   * <code>optional .pb_common.ResultCode result = 1;</code>
   */
  com.protos.ResultCode getResult();

  /**
   * <code>optional .pb_common.UserInfo userinfo = 2;</code>
   */
  boolean hasUserinfo();
  /**
   * <code>optional .pb_common.UserInfo userinfo = 2;</code>
   */
  com.protos.UserInfo getUserinfo();
  /**
   * <code>optional .pb_common.UserInfo userinfo = 2;</code>
   */
  com.protos.UserInfoOrBuilder getUserinfoOrBuilder();
}
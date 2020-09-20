
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box.internal;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.camel.component.box.api.BoxGroupsManager;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for org.apache.camel.component.box.api.BoxGroupsManager
 */
public enum BoxGroupsManagerApiMethod implements ApiMethod {

    ADD_GROUP_MEMBERSHIP(
        com.box.sdk.BoxGroupMembership.class,
        "addGroupMembership",
        arg("groupId", String.class),
        arg("userId", String.class),
        arg("role", com.box.sdk.BoxGroupMembership.Role.class)),

    CREATE_GROUP(
        com.box.sdk.BoxGroup.class,
        "createGroup",
        arg("name", String.class),
        arg("provenance", String.class),
        arg("externalSyncIdentifier", String.class),
        arg("description", String.class),
        arg("invitabilityLevel", String.class),
        arg("memberViewabilityLevel", String.class)),

    DELETE_GROUP(
        void.class,
        "deleteGroup",
        arg("groupId", String.class)),

    DELETE_GROUP_MEMBERSHIP(
        void.class,
        "deleteGroupMembership",
        arg("groupMembershipId", String.class)),

    GET_ALL_GROUPS(
        java.util.Collection.class,
        "getAllGroups"),

    GET_GROUP_INFO(
        com.box.sdk.BoxGroup.Info.class,
        "getGroupInfo",
        arg("groupId", String.class)),

    GET_GROUP_MEMBERSHIP_INFO(
        com.box.sdk.BoxGroupMembership.Info.class,
        "getGroupMembershipInfo",
        arg("groupMembershipId", String.class)),

    GET_GROUP_MEMBERSHIPS(
        java.util.Collection.class,
        "getGroupMemberships",
        arg("groupId", String.class)),

    UPDATE_GROUP_INFO(
        com.box.sdk.BoxGroup.class,
        "updateGroupInfo",
        arg("groupId", String.class),
        arg("groupInfo", com.box.sdk.BoxGroup.Info.class)),

    UPDATE_GROUP_MEMBERSHIP_INFO(
        com.box.sdk.BoxGroupMembership.class,
        "updateGroupMembershipInfo",
        arg("groupMembershipId", String.class),
        arg("info", com.box.sdk.BoxGroupMembership.Info.class));

    private final ApiMethod apiMethod;

    private BoxGroupsManagerApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(BoxGroupsManager.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
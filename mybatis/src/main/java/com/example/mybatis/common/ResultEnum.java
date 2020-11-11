/**************************************************************************************** 
 Copyright © 2003-2018 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.example.mybatis.common;

/**
 * @author chenyunhuan
 * @date 2020/11/10
 * @desc 返回码枚举类
 */

public enum ResultEnum {

    SUCCESS(0, "Success"),
    ACCOUNT_ID_IS_NULL(0001, "ACCOUNT ID IS NULL"),
    CERT_ID_IS_NULL(0002, "CERT ID IS NULL"),
    CERT_ID_IS_EXIST(0002, "CERT ID IS EXIST"),
    SYSTEM_ERROR(9999, "service Interface General Exception");

    // 返回码
    private Integer resultCode;
    // 返回信息
    private String resultMsg;

    /**
     * 返回码和返回信息构造方法
     *
     * @author Lucian <br>
     * @param resultCode <br>
     * @param resultMsg <br>
     */
    ResultEnum(Integer resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * 判断枚举中是否包含某个value
     *
     * @param value 默认value
     * @return 是否包含
     */
    public static boolean containsValue(Integer value) {
        for (ResultEnum resultEnum : values()) {
            if (resultEnum.getResultCode().equals(value)) {
                return true;
            }
        }
        return false;
    }
}

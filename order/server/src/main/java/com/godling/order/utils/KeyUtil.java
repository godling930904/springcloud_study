package com.godling.order.utils;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.RandomUtil;

/**
 * Created with 凌神.
 * Description: 产生唯一ID的工具类
 * User: 87179
 * Date: 2019-01-02
 * Time: 21:19
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 此处采用: 时间戳+随机数
     */
    public static synchronized String genUniqueKey() {
        return System.currentTimeMillis() + Convert.toStr(RandomUtil.randomInt(900000) + 100000);
    }
}

package com.godling.product.utils;

import com.godling.product.vo.ResultVO;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-04
 * Time: 23:12
 */
public class ResultVOUtil {
    public static ResultVO success(Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("success");
        resultVO.setData(data);
        return resultVO;
    }
}

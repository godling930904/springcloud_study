package com.godling.product.expection;

import com.godling.product.enums.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2019-01-17
 * Time: 23:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}

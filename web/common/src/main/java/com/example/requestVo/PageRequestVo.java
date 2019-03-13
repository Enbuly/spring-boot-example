package com.example.requestVo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangzy
 * @since 3-7
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageRequestVo {
    @ApiModelProperty(value = "currentPage")
    private int currentPage;
    @ApiModelProperty(value = "pageSize")
    private int pageSize;
}

package com.wangling.springcloud.entity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import sun.misc.Contended;

import java.io.Serializable;
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptNo;
    private String dName;
    private String dbSource;

    public Dept(String dName) {
        super();
        this.dName = dName;
    }

}

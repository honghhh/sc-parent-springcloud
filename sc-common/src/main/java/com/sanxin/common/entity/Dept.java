package com.sanxin.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}

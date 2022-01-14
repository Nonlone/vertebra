package per.nonlone.vertebra.common;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * 基础Po类，用于提供审计数据
 */
@Data
public abstract class  BasePo {

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;
}

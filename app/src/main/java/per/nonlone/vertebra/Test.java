package per.nonlone.vertebra;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Test {

    @TableId
    @TableField
    private Long id;

    @TableField("`key`")
    private String key;

    private String value;
}

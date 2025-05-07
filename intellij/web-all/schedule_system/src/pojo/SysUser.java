package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *ClassName: SysUser
 *Package: pojo
 *Description:创建于 2025/5/7 10:08
 *@Author lyl
 *@Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;
}

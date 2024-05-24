package member;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Member {
    private long USER_NO; // DB의 필드명과 동일해야 자동으로 매핑된다.
    private String USER_ID;
    private String USER_PW;
    private String USER_NM;
    private String MOBILE;
    private LocalDateTime REG_DT;
    private LocalDateTime MOD_DT;


}

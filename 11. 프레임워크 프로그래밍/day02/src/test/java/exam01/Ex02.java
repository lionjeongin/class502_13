package exam01;

import board.services.BoardService;
import config.AppCtx;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        BoardService service = ctx.getBean(BoardService.class);
        service.write();

        ctx.close();
    }
}

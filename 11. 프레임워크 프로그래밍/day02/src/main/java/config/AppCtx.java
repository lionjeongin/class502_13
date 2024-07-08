package config;

import board.services.BoardService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"member", "board"})
public class AppCtx {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BoardService2 boardService2() {
        return new BoardService2();
    }


}

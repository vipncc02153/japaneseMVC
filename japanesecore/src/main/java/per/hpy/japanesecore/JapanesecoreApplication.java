package per.hpy.japanesecore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("per.hpy.word")
@ComponentScan(value = {"per.hpy"})
public class JapanesecoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(JapanesecoreApplication.class, args);
    }

}

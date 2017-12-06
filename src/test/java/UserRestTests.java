import com.x.users.UsersApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={UsersApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserRestTests {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void exampleTest() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/test",
                String.class)).contains("active profile");
    }
}

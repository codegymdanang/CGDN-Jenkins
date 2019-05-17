package codegym.danang.demo;


import codegym.danang.DemoApplication;
import codegym.danang.entity.Book;


import io.restassured.RestAssured;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { DemoApplication.class }, webEnvironment
        = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class LiveTest {

    private static final String API_ROOT
            = "http://localhost:8080/api/books";

    private Book createRandomBook() {
        Book book = new Book();
        book.setTitle("1");
        book.setAuthor("l");
        return book;
    }

    @Test
    public void whenGetAllBooks_thenOK() {
        Response response = RestAssured.get(API_ROOT);

        Assert.assertEquals(HttpStatus.OK.value(), response.getStatusCode());
    }
}

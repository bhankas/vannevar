package org.bhankas;

import io.micronaut.http.annotation.*;

@Controller("/vannevar")
public class VannevarController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}
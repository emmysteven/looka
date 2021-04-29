package com.looka.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

/**
 * @author Emmy Steven
*/

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class User {

    private String name;
    private String blog;

}

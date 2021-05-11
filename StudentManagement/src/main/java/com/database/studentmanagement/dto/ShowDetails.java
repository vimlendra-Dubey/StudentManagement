package com.database.studentmanagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ShowDetails {

    private String clgName;
    private String branchName;

    public ShowDetails(String clgName, String branchName) {
        this.clgName = clgName;
        this.branchName = branchName;
    }
}

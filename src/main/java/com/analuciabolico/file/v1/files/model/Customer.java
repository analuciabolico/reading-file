package com.analuciabolico.file.v1.files.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {

    private String name;
    private String cnpj;
    private String businessArea;

}

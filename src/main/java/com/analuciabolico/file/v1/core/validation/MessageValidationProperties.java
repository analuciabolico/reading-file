package com.analuciabolico.file.v1.core.validation;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ResourceBundle;

import static java.util.ResourceBundle.getBundle;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MessageValidationProperties {

    private static final String PROPERTIES = "ValidationMessages";
    private static final ResourceBundle bundle = getBundle(PROPERTIES);

    public static String getMessage(GenericMessagesValidationEnum enumProperties) {
        return bundle.getString(enumProperties.getKey());
    }
}

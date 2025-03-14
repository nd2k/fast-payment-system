package com.nd2k.library.model.pain.pain00100112;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@Getter
@NoArgsConstructor
@XmlType(name = "MandateClassification1Code")
@XmlEnum
public enum MandateClassification1Code {

    FIXE,
    USGB,
    VARI;
}

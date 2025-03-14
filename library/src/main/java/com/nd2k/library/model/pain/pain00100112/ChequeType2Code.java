package com.nd2k.library.model.pain.pain00100112;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@Getter
@NoArgsConstructor
@XmlType(name = "ChequeType2Code")
@XmlEnum
public enum ChequeType2Code {

    CCHQ,
    CCCH,
    BCHQ,
    DRFT,
    ELDR;
}

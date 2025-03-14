package com.nd2k.library.model.pain.pain00100112;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorReferenceInformation3", propOrder = {
        "tp",
        "ref"
})
public class CreditorReferenceInformation3 {

    @XmlElement(name = "Tp")
    protected CreditorReferenceType3 tp;
    @XmlElement(name = "Ref")
    protected String ref;
}

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
@XmlType(name = "RegulatoryAuthority2", propOrder = {
        "nm",
        "ctry"
})
public class RegulatoryAuthority2 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Ctry")
    protected String ctry;
}

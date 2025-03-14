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
@XmlType(name = "PaymentInitiationSource1", propOrder = {
        "nm",
        "prvdr",
        "vrsn"
})
public class PaymentInitiationSource1 {

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
}

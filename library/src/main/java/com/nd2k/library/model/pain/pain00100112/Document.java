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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
        "cstmrCdtTrfInitn"
})
public class Document {

    @XmlElement(name = "CstmrCdtTrfInitn", required = true)
    protected CustomerCreditTransferInitiationV12 cstmrCdtTrfInitn;
}

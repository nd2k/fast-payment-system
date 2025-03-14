package com.nd2k.library.model.pain.pain00100112;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCreditTransferInitiationV12", propOrder = {
        "grpHdr",
        "pmtInf",
        "splmtryData"
})
public class CustomerCreditTransferInitiationV12 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader114 grpHdr;
    @XmlElement(name = "PmtInf", required = true)
    protected List<PaymentInstruction44> pmtInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;
}

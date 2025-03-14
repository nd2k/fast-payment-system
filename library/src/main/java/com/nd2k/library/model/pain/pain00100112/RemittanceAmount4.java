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
@XmlType(name = "RemittanceAmount4", propOrder = {
        "rmtAmtAndTp",
        "adjstmntAmtAndRsn"
})
public class RemittanceAmount4 {

    @XmlElement(name = "RmtAmtAndTp")
    protected List<DocumentAmount1> rmtAmtAndTp;
    @XmlElement(name = "AdjstmntAmtAndRsn")
    protected List<DocumentAdjustment1> adjstmntAmtAndRsn;
}

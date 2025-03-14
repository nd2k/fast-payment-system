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
@XmlType(name = "BranchAndFinancialInstitutionIdentification8", propOrder = {
        "finInstnId",
        "brnchId"
})
public class BranchAndFinancialInstitutionIdentification8 {

    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentification23 finInstnId;
    @XmlElement(name = "BrnchId")
    protected BranchData5 brnchId;
}

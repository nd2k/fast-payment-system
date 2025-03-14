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
@XmlType(name = "StructuredRemittanceInformation18", propOrder = {
        "rfrdDocInf",
        "rfrdDocAmt",
        "cdtrRefInf",
        "invcr",
        "invcee",
        "taxRmt",
        "grnshmtRmt",
        "addtlRmtInf"
})
public class StructuredRemittanceInformation18 {

    @XmlElement(name = "RfrdDocInf")
    protected List<ReferredDocumentInformation8> rfrdDocInf;
    @XmlElement(name = "RfrdDocAmt")
    protected RemittanceAmount4 rfrdDocAmt;
    @XmlElement(name = "CdtrRefInf")
    protected CreditorReferenceInformation3 cdtrRefInf;
    @XmlElement(name = "Invcr")
    protected PartyIdentification272 invcr;
    @XmlElement(name = "Invcee")
    protected PartyIdentification272 invcee;
    @XmlElement(name = "TaxRmt")
    protected TaxData1 taxRmt;
    @XmlElement(name = "GrnshmtRmt")
    protected Garnishment4 grnshmtRmt;
    @XmlElement(name = "AddtlRmtInf")
    protected List<String> addtlRmtInf;
}

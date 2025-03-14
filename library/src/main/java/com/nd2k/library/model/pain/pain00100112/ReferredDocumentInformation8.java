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
@XmlType(name = "ReferredDocumentInformation8", propOrder = {
        "tp",
        "nb",
        "rltdDt",
        "lineDtls"
})
public class ReferredDocumentInformation8 {

    @XmlElement(name = "Tp")
    protected DocumentType1 tp;
    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "RltdDt")
    protected DateAndType1 rltdDt;
    @XmlElement(name = "LineDtls")
    protected List<DocumentLineInformation2> lineDtls;
}

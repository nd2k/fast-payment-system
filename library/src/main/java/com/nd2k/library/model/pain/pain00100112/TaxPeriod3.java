package com.nd2k.library.model.pain.pain00100112;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxPeriod3", propOrder = {
        "yr",
        "tp",
        "frToDt"
})
public class TaxPeriod3 {

    @XmlElement(name = "Yr")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yr;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TaxRecordPeriod1Code tp;
    @XmlElement(name = "FrToDt")
    protected DatePeriod2 frToDt;
}

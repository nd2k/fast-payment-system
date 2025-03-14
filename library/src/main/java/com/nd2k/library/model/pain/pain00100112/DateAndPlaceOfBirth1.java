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
@XmlType(name = "DateAndPlaceOfBirth1", propOrder = {
        "birthDt",
        "prvcOfBirth",
        "cityOfBirth",
        "ctryOfBirth"
})
public class DateAndPlaceOfBirth1 {

    @XmlElement(name = "BirthDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "PrvcOfBirth")
    protected String prvcOfBirth;
    @XmlElement(name = "CityOfBirth", required = true)
    protected String cityOfBirth;
    @XmlElement(name = "CtryOfBirth", required = true)
    protected String ctryOfBirth;
}

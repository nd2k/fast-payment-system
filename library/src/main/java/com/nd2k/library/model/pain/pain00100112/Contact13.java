package com.nd2k.library.model.pain.pain00100112;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact13", propOrder = {
        "nmPrfx",
        "nm",
        "phneNb",
        "mobNb",
        "faxNb",
        "urlAdr",
        "emailAdr",
        "emailPurp",
        "jobTitl",
        "rspnsblty",
        "dept",
        "othr",
        "prefrdMtd"
})
public class Contact13 {

    @XmlElement(name = "NmPrfx")
    @XmlSchemaType(name = "string")
    protected NamePrefix2Code nmPrfx;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "MobNb")
    protected String mobNb;
    @XmlElement(name = "FaxNb")
    protected String faxNb;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "EmailPurp")
    protected String emailPurp;
    @XmlElement(name = "JobTitl")
    protected String jobTitl;
    @XmlElement(name = "Rspnsblty")
    protected String rspnsblty;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "Othr")
    protected List<OtherContact1> othr;
    @XmlElement(name = "PrefrdMtd")
    @XmlSchemaType(name = "string")
    protected PreferredContactMethod2Code prefrdMtd;
}

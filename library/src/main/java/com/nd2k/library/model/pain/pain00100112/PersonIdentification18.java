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
@XmlType(name = "PersonIdentification18", propOrder = {
        "dtAndPlcOfBirth",
        "othr"
})
public class PersonIdentification18 {

    @XmlElement(name = "DtAndPlcOfBirth")
    protected DateAndPlaceOfBirth1 dtAndPlcOfBirth;
    @XmlElement(name = "Othr")
    protected List<GenericPersonIdentification2> othr;
}

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
@XmlType(name = "InstructionForDebtorAgent1", propOrder = {
        "cd",
        "instrInf"
})
public class InstructionForDebtorAgent1 {

    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "InstrInf")
    protected String instrInf;
}

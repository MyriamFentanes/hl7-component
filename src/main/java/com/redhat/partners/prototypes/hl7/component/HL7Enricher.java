package com.redhat.partners.prototypes.hl7.component;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class HL7Enricher {

	 public Message processPatient(Message input) throws HL7Exception {
//	        QRD qrd = (QRD)input.get("QRD");
	        PV1 pv1 = (PV1) input.get("PV1");
	        String patientId = pv1.getName();
	        System.err.println("PV1"+patientId);
	        // find patient data based on the patient id and create a HL7 model object with the response
	        Message response = input;
	        return response;
	    }
}

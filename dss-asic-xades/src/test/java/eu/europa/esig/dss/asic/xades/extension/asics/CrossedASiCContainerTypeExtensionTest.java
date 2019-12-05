package eu.europa.esig.dss.asic.xades.extension.asics;

import eu.europa.esig.dss.asic.xades.extension.AbstractTestASiCwithXAdESExtension;
import eu.europa.esig.dss.enumerations.ASiCContainerType;
import eu.europa.esig.dss.enumerations.SignatureLevel;

public class CrossedASiCContainerTypeExtensionTest extends AbstractTestASiCwithXAdESExtension {

	@Override
	protected SignatureLevel getOriginalSignatureLevel() {
		return SignatureLevel.XAdES_BASELINE_B;
	}

	@Override
	protected SignatureLevel getFinalSignatureLevel() {
		return SignatureLevel.XAdES_BASELINE_T;
	}

	@Override
	protected ASiCContainerType getContainerType() {
		return ASiCContainerType.ASiC_S;
	}

	@Override
	protected ASiCContainerType getFinalContainerType() {
		// No impact, the parameter is not used
		return ASiCContainerType.ASiC_E;
	}

}
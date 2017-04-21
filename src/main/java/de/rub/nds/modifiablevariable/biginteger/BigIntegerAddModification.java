/**
 * ModifiableVariable - A Variable Concept for Runtime Modifications
 *
 * Copyright 2014-2017 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.modifiablevariable.biginteger;

import de.rub.nds.modifiablevariable.VariableModification;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 */
@XmlRootElement
@XmlType(propOrder = { "summand", "modificationFilter", "postModification" })
public class BigIntegerAddModification extends VariableModification<BigInteger> {

    private BigInteger summand;

    public BigIntegerAddModification() {

    }

    public BigIntegerAddModification(BigInteger bi) {
        this.summand = bi;
    }

    @Override
    protected BigInteger modifyImplementationHook(BigInteger input) {
        return (input == null) ? summand : input.add(summand);
    }

    public BigInteger getSummand() {
        return summand;
    }

    public void setSummand(BigInteger summand) {
        this.summand = summand;
    }
}

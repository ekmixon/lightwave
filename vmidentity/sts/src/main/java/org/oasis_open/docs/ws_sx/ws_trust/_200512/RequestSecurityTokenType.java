
package org.oasis_open.docs.ws_sx.ws_trust._200512;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.rsa.names._2009._12.std_ext.ws_trust1_4.advice.AdviceSetType;
import org.oasis_open.docs.ws_sx.ws_trust._200802.ActAsType;


/**
 *
 *         Actual content model is non-deterministic, hence wildcard. The following shows intended content model:
 *
 *         <xs:element ref='wst:TokenType' minOccurs='0' />
 *         <xs:element ref='wst:RequestType' />
 *         <xs:element ref='wst:Claims' minOccurs='0' />
 *         <xs:element ref='wst:Entropy' minOccurs='0' />
 *         <xs:element ref='wst:Lifetime' minOccurs='0' />
 *         <xs:element ref='wst:AllowPostdating' minOccurs='0' />
 *         <xs:element ref='wst:Renewing' minOccurs='0' />
 *         <xs:element ref='wst:OnBehalfOf' minOccurs='0' />
 *         <xs:element ref='wst:Issuer' minOccurs='0' />
 *         <xs:element ref='wst:AuthenticationType' minOccurs='0' />
 *         <xs:element ref='wst:KeyType' minOccurs='0' />
 *         <xs:element ref='wst:KeySize' minOccurs='0' />
 *         <xs:element ref='wst:SignatureAlgorithm' minOccurs='0' />
 *         <xs:element ref='wst:Encryption' minOccurs='0' />
 *         <xs:element ref='wst:EncryptionAlgorithm' minOccurs='0' />
 *         <xs:element ref='wst:CanonicalizationAlgorithm' minOccurs='0' />
 *         <xs:element ref='wst:ProofEncryption' minOccurs='0' />
 *         <xs:element ref='wst:UseKey' minOccurs='0' />
 *         <xs:element ref='wst:SignWith' minOccurs='0' />
 *         <xs:element ref='wst:EncryptWith' minOccurs='0' />
 *         <xs:element ref='wst:DelegateTo' minOccurs='0' />
 *         <xs:element ref='wst:Forwardable' minOccurs='0' />
 *         <xs:element ref='wst:Delegatable' minOccurs='0' />
 *         <xs:any namespace='##other' processContents='lax' minOccurs='0' maxOccurs='unbounded' />
 *
 *
 *
 * <p>Java class for RequestSecurityTokenType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RequestSecurityTokenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}TokenType" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}RequestType"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}Lifetime" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}ValidateTarget" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}RenewTarget" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}Renewing" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}DelegateTo" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}Delegatable" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200802}ActAs" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}UseKey" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}KeyType" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}SignatureAlgorithm" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}BinaryExchange" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}Participants" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}Claims" minOccurs="0"/>
 *         &lt;element ref="{http://www.rsa.com/names/2009/12/std-ext/WS-Trust1.4/advice}AdviceSet" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="Context" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestSecurityTokenType", propOrder = {

})
public class RequestSecurityTokenType {

    @XmlElement(name = "TokenType")
    @XmlSchemaType(name = "anyURI")
    protected String tokenType;
    @XmlElement(name = "RequestType", required = true)
    protected String requestType;
    @XmlElement(name = "Lifetime")
    protected LifetimeType lifetime;
    @XmlElement(name = "ValidateTarget")
    protected ValidateTargetType validateTarget;
    @XmlElement(name = "RenewTarget")
    protected RenewTargetType renewTarget;
    @XmlElement(name = "Renewing")
    protected RenewingType renewing;
    @XmlElement(name = "DelegateTo")
    protected DelegateToType delegateTo;
    @XmlElement(name = "Delegatable")
    protected Boolean delegatable;
    @XmlElement(name = "ActAs", namespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200802")
    protected ActAsType actAs;
    @XmlElement(name = "UseKey")
    protected UseKeyType useKey;
    @XmlElement(name = "KeyType")
    protected String keyType;
    @XmlElement(name = "SignatureAlgorithm")
    @XmlSchemaType(name = "anyURI")
    protected String signatureAlgorithm;
    @XmlElement(name = "BinaryExchange")
    protected BinaryExchangeType binaryExchange;
    @XmlElement(name = "Participants")
    protected ParticipantsType participants;
    @XmlElement(name = "Claims")
    protected ClaimsType claims;
    @XmlElement(name = "AdviceSet", namespace = "http://www.rsa.com/names/2009/12/std-ext/WS-Trust1.4/advice")
    protected AdviceSetType adviceSet;
    @XmlAttribute(name = "Context")
    @XmlSchemaType(name = "anyURI")
    protected String context;

    /**
     * Gets the value of the tokenType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTokenType() {
        return tokenType;
    }

    /**
     * Sets the value of the tokenType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTokenType(String value) {
        this.tokenType = value;
    }

    /**
     * Gets the value of the requestType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the lifetime property.
     *
     * @return
     *     possible object is
     *     {@link LifetimeType }
     *
     */
    public LifetimeType getLifetime() {
        return lifetime;
    }

    /**
     * Sets the value of the lifetime property.
     *
     * @param value
     *     allowed object is
     *     {@link LifetimeType }
     *
     */
    public void setLifetime(LifetimeType value) {
        this.lifetime = value;
    }

    /**
     * Gets the value of the validateTarget property.
     *
     * @return
     *     possible object is
     *     {@link ValidateTargetType }
     *
     */
    public ValidateTargetType getValidateTarget() {
        return validateTarget;
    }

    /**
     * Sets the value of the validateTarget property.
     *
     * @param value
     *     allowed object is
     *     {@link ValidateTargetType }
     *
     */
    public void setValidateTarget(ValidateTargetType value) {
        this.validateTarget = value;
    }

    /**
     * Gets the value of the renewTarget property.
     *
     * @return
     *     possible object is
     *     {@link RenewTargetType }
     *
     */
    public RenewTargetType getRenewTarget() {
        return renewTarget;
    }

    /**
     * Sets the value of the renewTarget property.
     *
     * @param value
     *     allowed object is
     *     {@link RenewTargetType }
     *
     */
    public void setRenewTarget(RenewTargetType value) {
        this.renewTarget = value;
    }

    /**
     * Gets the value of the renewing property.
     *
     * @return
     *     possible object is
     *     {@link RenewingType }
     *
     */
    public RenewingType getRenewing() {
        return renewing;
    }

    /**
     * Sets the value of the renewing property.
     *
     * @param value
     *     allowed object is
     *     {@link RenewingType }
     *
     */
    public void setRenewing(RenewingType value) {
        this.renewing = value;
    }

    /**
     * Gets the value of the delegateTo property.
     *
     * @return
     *     possible object is
     *     {@link DelegateToType }
     *
     */
    public DelegateToType getDelegateTo() {
        return delegateTo;
    }

    /**
     * Sets the value of the delegateTo property.
     *
     * @param value
     *     allowed object is
     *     {@link DelegateToType }
     *
     */
    public void setDelegateTo(DelegateToType value) {
        this.delegateTo = value;
    }

    /**
     * Gets the value of the delegatable property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDelegatable() {
        return delegatable;
    }

    /**
     * Sets the value of the delegatable property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDelegatable(Boolean value) {
        this.delegatable = value;
    }

    /**
     * Gets the value of the actAs property.
     *
     * @return
     *     possible object is
     *     {@link ActAsType }
     *
     */
    public ActAsType getActAs() {
        return actAs;
    }

    /**
     * Sets the value of the actAs property.
     *
     * @param value
     *     allowed object is
     *     {@link ActAsType }
     *
     */
    public void setActAs(ActAsType value) {
        this.actAs = value;
    }

    /**
     * Gets the value of the useKey property.
     *
     * @return
     *     possible object is
     *     {@link UseKeyType }
     *
     */
    public UseKeyType getUseKey() {
        return useKey;
    }

    /**
     * Sets the value of the useKey property.
     *
     * @param value
     *     allowed object is
     *     {@link UseKeyType }
     *
     */
    public void setUseKey(UseKeyType value) {
        this.useKey = value;
    }

    /**
     * Gets the value of the keyType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKeyType(String value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the signatureAlgorithm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Sets the value of the signatureAlgorithm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSignatureAlgorithm(String value) {
        this.signatureAlgorithm = value;
    }

    /**
     * Gets the value of the binaryExchange property.
     *
     * @return
     *     possible object is
     *     {@link BinaryExchangeType }
     *
     */
    public BinaryExchangeType getBinaryExchange() {
        return binaryExchange;
    }

    /**
     * Sets the value of the binaryExchange property.
     *
     * @param value
     *     allowed object is
     *     {@link BinaryExchangeType }
     *
     */
    public void setBinaryExchange(BinaryExchangeType value) {
        this.binaryExchange = value;
    }

    /**
     * Gets the value of the participants property.
     *
     * @return
     *     possible object is
     *     {@link ParticipantsType }
     *
     */
    public ParticipantsType getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     *
     * @param value
     *     allowed object is
     *     {@link ParticipantsType }
     *
     */
    public void setParticipants(ParticipantsType value) {
        this.participants = value;
    }

    /**
     * Gets the value of the claims property.
     *
     * @return
     *     possible object is
     *     {@link ClaimsType }
     *
     */
    public ClaimsType getClaims() {
        return claims;
    }

    /**
     * Sets the value of the claims property.
     *
     * @param value
     *     allowed object is
     *     {@link ClaimsType }
     *
     */
    public void setClaims(ClaimsType value) {
        this.claims = value;
    }

    /**
     * Gets the value of the adviceSet property.
     *
     * @return
     *     possible object is
     *     {@link AdviceSetType }
     *
     */
    public AdviceSetType getAdviceSet() {
        return adviceSet;
    }

    /**
     * Sets the value of the adviceSet property.
     *
     * @param value
     *     allowed object is
     *     {@link AdviceSetType }
     *
     */
    public void setAdviceSet(AdviceSetType value) {
        this.adviceSet = value;
    }

    /**
     * Gets the value of the context property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContext(String value) {
        this.context = value;
    }

}

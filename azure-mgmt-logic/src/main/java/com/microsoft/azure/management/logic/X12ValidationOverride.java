/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The X12 validation override settings.
 */
public class X12ValidationOverride {
    /**
     * The message id on which the validation settings has to be applied.
     */
    @JsonProperty(value = "messageId", required = true)
    private String messageId;

    /**
     * The value indicating whether to validate EDI types.
     */
    @JsonProperty(value = "validateEdiTypes", required = true)
    private boolean validateEdiTypes;

    /**
     * The value indicating whether to validate XSD types.
     */
    @JsonProperty(value = "validateXsdTypes", required = true)
    private boolean validateXsdTypes;

    /**
     * The value indicating whether to allow leading and trailing spaces and
     * zeroes.
     */
    @JsonProperty(value = "allowLeadingAndTrailingSpacesAndZeroes", required = true)
    private boolean allowLeadingAndTrailingSpacesAndZeroes;

    /**
     * The value indicating whether to validate character Set.
     */
    @JsonProperty(value = "validateCharacterSet", required = true)
    private boolean validateCharacterSet;

    /**
     * The value indicating whether to trim leading and trailing spaces and
     * zeroes.
     */
    @JsonProperty(value = "trimLeadingAndTrailingSpacesAndZeroes", required = true)
    private boolean trimLeadingAndTrailingSpacesAndZeroes;

    /**
     * The trailing separator policy. Possible values include: 'NotSpecified',
     * 'NotAllowed', 'Optional', 'Mandatory'.
     */
    @JsonProperty(value = "trailingSeparatorPolicy", required = true)
    private TrailingSeparatorPolicy trailingSeparatorPolicy;

    /**
     * Get the messageId value.
     *
     * @return the messageId value
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the messageId value.
     *
     * @param messageId the messageId value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the validateEdiTypes value.
     *
     * @return the validateEdiTypes value
     */
    public boolean validateEdiTypes() {
        return this.validateEdiTypes;
    }

    /**
     * Set the validateEdiTypes value.
     *
     * @param validateEdiTypes the validateEdiTypes value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withValidateEdiTypes(boolean validateEdiTypes) {
        this.validateEdiTypes = validateEdiTypes;
        return this;
    }

    /**
     * Get the validateXsdTypes value.
     *
     * @return the validateXsdTypes value
     */
    public boolean validateXsdTypes() {
        return this.validateXsdTypes;
    }

    /**
     * Set the validateXsdTypes value.
     *
     * @param validateXsdTypes the validateXsdTypes value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withValidateXsdTypes(boolean validateXsdTypes) {
        this.validateXsdTypes = validateXsdTypes;
        return this;
    }

    /**
     * Get the allowLeadingAndTrailingSpacesAndZeroes value.
     *
     * @return the allowLeadingAndTrailingSpacesAndZeroes value
     */
    public boolean allowLeadingAndTrailingSpacesAndZeroes() {
        return this.allowLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * Set the allowLeadingAndTrailingSpacesAndZeroes value.
     *
     * @param allowLeadingAndTrailingSpacesAndZeroes the allowLeadingAndTrailingSpacesAndZeroes value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withAllowLeadingAndTrailingSpacesAndZeroes(boolean allowLeadingAndTrailingSpacesAndZeroes) {
        this.allowLeadingAndTrailingSpacesAndZeroes = allowLeadingAndTrailingSpacesAndZeroes;
        return this;
    }

    /**
     * Get the validateCharacterSet value.
     *
     * @return the validateCharacterSet value
     */
    public boolean validateCharacterSet() {
        return this.validateCharacterSet;
    }

    /**
     * Set the validateCharacterSet value.
     *
     * @param validateCharacterSet the validateCharacterSet value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withValidateCharacterSet(boolean validateCharacterSet) {
        this.validateCharacterSet = validateCharacterSet;
        return this;
    }

    /**
     * Get the trimLeadingAndTrailingSpacesAndZeroes value.
     *
     * @return the trimLeadingAndTrailingSpacesAndZeroes value
     */
    public boolean trimLeadingAndTrailingSpacesAndZeroes() {
        return this.trimLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * Set the trimLeadingAndTrailingSpacesAndZeroes value.
     *
     * @param trimLeadingAndTrailingSpacesAndZeroes the trimLeadingAndTrailingSpacesAndZeroes value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withTrimLeadingAndTrailingSpacesAndZeroes(boolean trimLeadingAndTrailingSpacesAndZeroes) {
        this.trimLeadingAndTrailingSpacesAndZeroes = trimLeadingAndTrailingSpacesAndZeroes;
        return this;
    }

    /**
     * Get the trailingSeparatorPolicy value.
     *
     * @return the trailingSeparatorPolicy value
     */
    public TrailingSeparatorPolicy trailingSeparatorPolicy() {
        return this.trailingSeparatorPolicy;
    }

    /**
     * Set the trailingSeparatorPolicy value.
     *
     * @param trailingSeparatorPolicy the trailingSeparatorPolicy value to set
     * @return the X12ValidationOverride object itself.
     */
    public X12ValidationOverride withTrailingSeparatorPolicy(TrailingSeparatorPolicy trailingSeparatorPolicy) {
        this.trailingSeparatorPolicy = trailingSeparatorPolicy;
        return this;
    }

}

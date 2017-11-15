/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.cognitiveservices.language.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KeyPhraseBatchResultItem model.
 */
public class KeyPhraseBatchResultItem {
    /**
     * A list of representative words or phrases. The number of key phrases
     * returned is proportional to the number of words in the input document.
     */
    @JsonProperty(value = "keyPhrases", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> keyPhrases;

    /**
     * Unique document identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get the keyPhrases value.
     *
     * @return the keyPhrases value
     */
    public List<String> keyPhrases() {
        return this.keyPhrases;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

}
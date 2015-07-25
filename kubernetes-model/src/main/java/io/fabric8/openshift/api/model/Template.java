/**
 * Copyright (C) 2011 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.internal.HasMetadataComparator;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;


/**
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "apiVersion",
        "kind",
        "labels",
        "metadata",
        "objects",
        "parameters"
})
@JsonDeserialize(using = JsonDeserializer.None.class)
@EqualsAndHashCode
@ToString
public class Template implements HasMetadata {

    /**
     * (Required)
     */
    @JsonProperty("apiVersion")
    @NotNull
    private Template.ApiVersion apiVersion = Template.ApiVersion.fromValue("v1");
    /**
     * (Required)
     */
    @JsonProperty("kind")
    @NotNull
    private java.lang.String kind = "Template";
    /**
     *
     *
     */
    @JsonProperty("labels")
    @Valid
    private Map<String, String> labels;
    /**
     *
     *
     */
    @JsonProperty("metadata")
    @Valid
    private ObjectMeta metadata;
    /**
     *
     *
     */
    @JsonProperty("objects")
    @Valid
    private List<HasMetadata> objects = new ArrayList<HasMetadata>();
    /**
     *
     *
     */
    @JsonProperty("parameters")
    @Valid
    private List<Parameter> parameters = new ArrayList<Parameter>();
    @JsonIgnore
    private Map<java.lang.String, java.lang.Object> additionalProperties = new HashMap<java.lang.String, java.lang.Object>();


    /**
     * No args constructor for use in serialization
     */
    public Template() {
    }

    /**
     * @param apiVersion
     * @param labels
     * @param parameters
     * @param objects
     * @param kind
     * @param metadata
     */
    public Template(Template.ApiVersion apiVersion, java.lang.String kind, Map<String, String> labels, ObjectMeta metadata, List<HasMetadata> objects, List<Parameter> parameters) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.labels = labels;
        this.metadata = metadata;
        this.parameters = parameters;
        this.objects = objects;
    }

    /**
     * (Required)
     *
     * @return The apiVersion
     */
    @JsonProperty("apiVersion")
    public Template.ApiVersion getApiVersion() {
        return apiVersion;
    }

    /**
     * (Required)
     *
     * @param apiVersion The apiVersion
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(Template.ApiVersion apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * (Required)
     *
     * @return The kind
     */
    @JsonProperty("kind")
    public java.lang.String getKind() {
        return kind;
    }

    /**
     * (Required)
     *
     * @param kind The kind
     */
    @JsonProperty("kind")
    public void setKind(java.lang.String kind) {
        this.kind = kind;
    }

    /**
     * @return The labels
     */
    @JsonProperty("labels")
    public Map<String, String> getLabels() {
        return labels;
    }

    /**
     * @param labels The labels
     */
    @JsonProperty("labels")
    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * @return The metadata
     */
    @JsonProperty("metadata")
    public ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * @param metadata The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
    }

    /**
     * @return The objects
     */
    @JsonProperty("objects")
    public List<HasMetadata> getObjects() {
        List<HasMetadata> sortedObjects = new ArrayList<>(objects);
        Collections.sort(sortedObjects, new HasMetadataComparator());
        return sortedObjects;
    }

    public void setObjects(List<HasMetadata> objects) {
        this.objects = objects;
    }

    /**
     * @return The parameters
     */
    @JsonProperty("parameters")
    public List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * @param parameters The parameters
     */
    @JsonProperty("parameters")
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    @JsonAnyGetter
    public Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
    }

    @Generated("org.jsonschema2pojo")
    public static enum ApiVersion {

        V_1("v1");
        private static Map<java.lang.String, Template.ApiVersion> constants = new HashMap<java.lang.String, Template.ApiVersion>();

        static {
            for (Template.ApiVersion c : values()) {
                constants.put(c.value, c);
            }
        }

        private final java.lang.String value;

        private ApiVersion(java.lang.String value) {
            this.value = value;
        }

        @JsonCreator
        public static Template.ApiVersion fromValue(java.lang.String value) {
            Template.ApiVersion constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

        @JsonValue
        @Override
        public java.lang.String toString() {
            return this.value;
        }

    }
}

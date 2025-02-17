package io.github.robin536180.exposerversdk.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TicketError {
        @JsonProperty("DeviceNotRegistered")
        DEVICENOTREGISTERED("DeviceNotRegistered"),
        @JsonProperty("InvalidCredentials")
        INVALIDCREDENTIALS("InvalidCredentials");

        private String error;
        private TicketError(String error) {
                this.error = error;
        }

        @Override
        public String toString(){
                return error;
        }
}

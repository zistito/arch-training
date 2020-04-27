package com.group3.archtraining.component;

public enum DocumentType {

    ISO("ISO"),
    QEP("QEP");

    private String type;

    DocumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

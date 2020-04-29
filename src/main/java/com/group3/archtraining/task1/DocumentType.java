package com.group3.archtraining.task1;

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

package com.group3.archtraining.component;

import java.time.YearMonth;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// todo: implement this as Decorator and Chain of Responsibility
// https://www.baeldung.com/java-decorator-pattern
// https://www.baeldung.com/chain-of-responsibility-pattern
public final class DocumentManager {

    private static DocumentManager INSTANCE;

    private static Long PAGE_ID = 0L;
    private static final String DEMO_PREFIX = "DEMO/";
    private static final String AUDIT_SUFFIX = "/AUDIT";
    private static final String DELIMITER = "/";

    private DocumentManager() {
    }

    public static DocumentManager getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DocumentManager();
        }

        return INSTANCE;
    }

    public String generatePageNumber(boolean isDemo, boolean isAudit, DocumentType documentType, YearMonth yearMonth) {
        String prefix = isDemo ? DEMO_PREFIX : "";
        String suffix = isAudit ? AUDIT_SUFFIX : "";

        increaseCurrentPageId();

        return Stream.of(documentType.getType(), Long.toString(PAGE_ID), Integer.toString(yearMonth.getMonthValue()),
                Integer.toString(yearMonth.getYear())).collect(Collectors.joining(DELIMITER, prefix, suffix));
    }

    private void increaseCurrentPageId() {
        PAGE_ID++;
    }
}

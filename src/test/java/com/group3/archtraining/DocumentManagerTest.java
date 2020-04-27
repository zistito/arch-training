package com.group3.archtraining;

import com.group3.archtraining.component.DocumentManager;
import com.group3.archtraining.component.DocumentType;
import org.junit.jupiter.api.Test;

import java.time.YearMonth;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentManagerTest {

    DocumentManager documentManager = DocumentManager.getInstance();

    @Test
    public void shouldGeneratePageNumber() {
        // given
        String expectedDocumentNumber1 = "ISO/1/4/2020/AUDIT";
        String expectedDocumentNumber2 = "DEMO/QEP/2/4/2020";

        // when
        String documentNumber1 = documentManager.generatePageNumber(false, true, DocumentType.ISO, YearMonth.now());
        String documentNumber2 = documentManager.generatePageNumber(true, false, DocumentType.QEP, YearMonth.now());

        // then
        assertThat(documentNumber1).isEqualTo(expectedDocumentNumber1);
        assertThat(documentNumber2).isEqualTo(expectedDocumentNumber2);
    }
}
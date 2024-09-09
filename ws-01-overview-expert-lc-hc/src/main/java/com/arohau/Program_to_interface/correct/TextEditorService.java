package com.arohau.Program_to_interface.correct;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextEditorService {
    private SpellingChecker spellingChecker;

    public void saveNewTextToDatabase(String text) {
        spellingChecker.checkSpelling(text);
        // .. save corrected text to database ...
    }
}

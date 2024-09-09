package com.arohau.Program_to_interface;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextEditorService {
    private EnglishTextSpellingChecker englishTextSpellingChecker;

    public void saveNewTextToDatabase(String text) {
        englishTextSpellingChecker.checkSpelling(text);
        // .. save corrected text to database ...
    }
}

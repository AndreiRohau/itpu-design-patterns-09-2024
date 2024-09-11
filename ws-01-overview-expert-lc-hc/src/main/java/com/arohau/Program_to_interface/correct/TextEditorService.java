package com.arohau.Program_to_interface.correct;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TextEditorService {
//    private SpellingChecker spellingChecker;

    public void saveNewTextToDatabase(String text, SpellingChecker spellingChecker) {
        spellingChecker.checkSpelling(text);
        // .. save corrected text to database ...
    }
}

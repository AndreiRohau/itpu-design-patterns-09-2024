package com.arohau.Program_to_interface;

public class Main {
    // PROBLEM: cannot use different languages spelling checkers
    public static void main(String[] args) {
        EnglishTextSpellingChecker englishTextSpellingChecker = new EnglishTextSpellingChecker();
        TextEditorService textEditorService = new TextEditorService(englishTextSpellingChecker);

        textEditorService.saveNewTextToDatabase("new text example to check spelling and save to database");
    }
}

package com.arohau.Program_to_interface.correct;

public class Main {
    // by getting rid of specific class binding
    // now we can easily change Spelling Checker and reuse Service
    public static void main(String[] args) {
        EnglishTextSpellingChecker englishTextSpellingChecker = new EnglishTextSpellingChecker();
        TextEditorService engTextEditorService = new TextEditorService(englishTextSpellingChecker);
        engTextEditorService.saveNewTextToDatabase("new text example to check spelling and save to database");

        ChineseTextSpellingChecker chineseTextSpellingChecker = new ChineseTextSpellingChecker();
        TextEditorService chineseTextEditorService = new TextEditorService(chineseTextSpellingChecker);
        chineseTextEditorService.saveNewTextToDatabase("wo ai pu tong hua");
    }
}

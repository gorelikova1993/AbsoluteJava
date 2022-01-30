package ch14.ex2;

import java.util.List;

public class Dictionary {
    private String term;
    private List<String> synonyms;

    public Dictionary(String term, List<String> synonyms) {
        this.term = term;
        this.synonyms = synonyms;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }



    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }
}

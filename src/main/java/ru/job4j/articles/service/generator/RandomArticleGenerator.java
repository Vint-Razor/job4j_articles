package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;

import java.util.Collections;
import java.util.List;

public class RandomArticleGenerator implements ArticleGenerator {

    @Override
    public Article generate(List<Word> words) {
        Collections.shuffle(words);
        StringBuilder joiner = new StringBuilder();
        for (Word word : words) {
            joiner.append(word.getValue());
            joiner.append(" ");
        }
        return new Article(joiner.toString());
    }
}

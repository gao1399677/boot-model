package com.spring.boot.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamAPI{

    private List<Article> articles = new ArrayList<>();


    public Article getFirstJavaArticle(List<Article> articles) {
        for (Article article : articles) {
            if (article.getTags().contains("Java")) {
                return article;
            }
        }

        return null;
    }

    public Optional<Article> getFirstJavaArticle2(List<Article> articles) {
        return articles.stream().filter(article -> article.getTags().contains("Java")).findFirst();
    }

}

class Article {
 
        private final String title;
        private final String author;
        private final List<String> tags;
 
        private Article(String title, String author, List<String> tags) {
            this.title = title;
            this.author = author;
            this.tags = tags;
        }


        public String getTitle() {
            return title;
        }
 
        public String getAuthor() {
            return author;
        }
 
        public List<String> getTags() {
            return tags;
        }
    }
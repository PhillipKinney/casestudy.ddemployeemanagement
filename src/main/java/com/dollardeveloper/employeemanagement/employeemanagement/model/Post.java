package com.dollardeveloper.employeemanagement.employeemanagement.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
public class Post {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;


        private String title;

        @Lob
        private String postBody;

        private Instant dateCreated;
        private Instant dateUpdated;
        private String author;

//        @ManyToOne (cascade = CascadeType.ALL)
//        private User author;

        public Post(String title, String author, String postBody){
                this.title=title;
                this.author=author;
                this.postBody=postBody;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getPostBody() {
                return postBody;
        }

        public void setPostBody(String postBody) {
                this.postBody = postBody;
        }

        public Instant getDateCreated() {
                return dateCreated;
        }

        public void setDateCreated(Instant dateCreated) {
                this.dateCreated = dateCreated;
        }

        public Instant getDateUpdated() {
                return dateUpdated;
        }

        public void setDateUpdated(Instant dateUpdated) {
                this.dateUpdated = dateUpdated;
        }

        public String getAuthor() {
                return author;
        }

        public void setAuthor(String author) {
                this.author = author;
        }
}

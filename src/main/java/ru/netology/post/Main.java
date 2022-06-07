package ru.netology.post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 N 444444";
        post.patronymic = "Евлампович";
        post.phone = "+7 (123)-456-78-90";
        post.surname = "Тестов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 2;
        post.birthday.year = 1998;
    }
}
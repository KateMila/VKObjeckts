package ru.netology.domain;

public class NewPost {
    private int owner_id;
    private int created_by;
    private int  data;
    private String text;
    private int reply_owner_id;
    private int reply_post_id;
    private int friends_only;
    private String post_type;
    private boolean can_close;
    private boolean can_open;
    private int can_pin;
    private int can_delete;
    private int can_edit;
    private int market_as_ads;
    private boolean is_favorite;
    private int marked_as_ads;
    private int signer_id;
    // + get/set на все поля
}

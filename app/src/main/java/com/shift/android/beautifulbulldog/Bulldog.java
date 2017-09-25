package com.shift.android.beautifulbulldog;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by racha on 9/23/2017.
 */

public class Bulldog extends RealmObject
{
    private String id;
    private String name;
    private String age;
    public RealmList<Vote> votes;
    public byte[] image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RealmList<Vote> getVotes() {
        return votes;
    }

    public void setVotes(RealmList votes) {
        this.votes = votes;
    }

    public void appendVote (Vote vote){
        this.votes.add(vote);
    }

    public byte[] getImage(){
        return image;
    }

    public void setImage(byte[] image){
        this.image=image;
    }

}

package io.soramitsu.irohaandroid.domain.entity;

import java.io.Serializable;

public class Domain implements Serializable {
    public String name;
    public String owner;
    public String signature;
    public long timestamp;
}
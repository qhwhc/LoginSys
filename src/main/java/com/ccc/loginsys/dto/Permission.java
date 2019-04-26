package com.ccc.loginsys.dto;

public class Permission {
    private Long id;

    private String name;

    private String type;

    private String url;

    private String percode;

    private Long parentid;

    private String parentids;

    private String sortstring;

    private String available;

    public Long getId() {
        return id;
    }

    public Permission setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Permission setName(String name) {
        this.name = name == null ? null : name.trim();
        return this;
    }

    public String getType() {
        return type;
    }

    public Permission setType(String type) {
        this.type = type == null ? null : type.trim();
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Permission setUrl(String url) {
        this.url = url == null ? null : url.trim();
        return this;
    }

    public String getPercode() {
        return percode;
    }

    public Permission setPercode(String percode) {
        this.percode = percode == null ? null : percode.trim();
        return this;
    }

    public Long getParentid() {
        return parentid;
    }

    public Permission setParentid(Long parentid) {
        this.parentid = parentid;
        return this;
    }

    public String getParentids() {
        return parentids;
    }

    public Permission setParentids(String parentids) {
        this.parentids = parentids == null ? null : parentids.trim();
        return this;
    }

    public String getSortstring() {
        return sortstring;
    }

    public Permission setSortstring(String sortstring) {
        this.sortstring = sortstring == null ? null : sortstring.trim();
        return this;
    }

    public String getAvailable() {
        return available;
    }

    public Permission setAvailable(String available) {
        this.available = available == null ? null : available.trim();
        return this;
    }
}
package com.v5ent.rapid4j.web.model;

public class Menu {
    private String menuid;

    private String description;

    private String route;

    private String module;

    private Boolean requiresauthenication;

    private Integer menuorder;

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route == null ? null : route.trim();
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public Boolean getRequiresauthenication() {
        return requiresauthenication;
    }

    public void setRequiresauthenication(Boolean requiresauthenication) {
        this.requiresauthenication = requiresauthenication;
    }

    public Integer getMenuorder() {
        return menuorder;
    }

    public void setMenuorder(Integer menuorder) {
        this.menuorder = menuorder;
    }
}
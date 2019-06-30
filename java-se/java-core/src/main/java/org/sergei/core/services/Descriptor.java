package org.sergei.core.services;

/**
 * @author Sergei Visotsky
 */
public class Descriptor {

    private Long id;
    private String title;
    private String status;
    private String description;
    private Boolean active;

    public Descriptor(Long id, String title, String status, String description, Boolean active) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.description = description;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Descriptor{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                '}';
    }
}

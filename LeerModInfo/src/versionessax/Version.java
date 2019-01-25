package versionessax;
public class Version {
    private String name;
    private String description;
    private String author;
    private double version;
    private String website;

    public Version() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    

    @Override
    public String toString() {
        return "Información del Mod:" + "\nNombre=" + name + "\nDescripción=" + description + "\nAutor=" + author + "\nVersion=" + version + "\nSitio Web=" + website + "\n\n-----------------------\n";
    }
    
    
}

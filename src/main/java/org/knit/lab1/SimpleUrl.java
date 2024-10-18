package org.knit.lab1;

public class SimpleUrl {
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String webpageName;
    private String webPageExtention;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDomainZone() {
        return domainZone;
    }

    public void setDomainZone(String domainZone) {
        this.domainZone = domainZone;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getWebpageName() {
        return webpageName;
    }

    public void setWebpageName(String webpageName) {
        this.webpageName = webpageName;
    }

    public String getWebPageExtention() {
        return webPageExtention;
    }

    public void setWebPageExtention(String webPageExtention) {
        this.webPageExtention = webPageExtention;
    }

    @Override
    public String toString() {
        return "SimpleUrl{" +
                "protocol='" + protocol + '\'' +
                ", address='" + address + '\'' +
                ", domainZone='" + domainZone + '\'' +
                ", siteName='" + siteName + '\'' +
                ", webpageName='" + webpageName + '\'' +
                ", webPageExtention='" + webPageExtention + '\'' +
                '}';
    }
}

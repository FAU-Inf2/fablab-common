package de.fau.cs.mad.fablab.rest.core;

/**
 * Entity representing current application version.
 */
public class UpdateStatus {

    public enum UpdateAvailability {
        NotAvailable,
        Optional,
        Required
    }

    private String latestVersion;
    private int latestVersionCode;
    private int oldVersionCode;
    private UpdateAvailability updateAvailable;
    private String updateMessage;

    public UpdateStatus() {

    }

    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public int getLatestVersionCode() {
        return latestVersionCode;
    }

    public int getOldVersionCode() {
        return oldVersionCode;
    }

    public void setOldVersionCode(int oldVersionCode) {
        this.oldVersionCode = oldVersionCode;
    }

    public void setLatestVersionCode(int latestVersionCode) {
        this.latestVersionCode = latestVersionCode;
    }

    public UpdateAvailability getUpdateAvailable() {
        return updateAvailable;
    }

    public void setUpdateAvailable(UpdateAvailability updateAvailable) {
        this.updateAvailable = updateAvailable;
    }

    public String getUpdateMessage() {
        return updateMessage;
    }

    public void setUpdateMessage(String updateMessage) {
        this.updateMessage = updateMessage;
    }
}

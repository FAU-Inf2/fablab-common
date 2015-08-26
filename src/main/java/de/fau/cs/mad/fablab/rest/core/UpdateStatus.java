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

    private String currentVersion;
    private int currentVersionCode;
    private int oldVersionCode;
    private UpdateAvailability updateAvailable;
    private String updateMessage;

    public UpdateStatus() {

    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public int getCurrentVersionCode() {
        return currentVersionCode;
    }

    public int getOldVersionCode() {
        return oldVersionCode;
    }

    public void setOldVersionCode(int oldVersionCode) {
        this.oldVersionCode = oldVersionCode;
    }

    public void setCurrentVersionCode(int currentVersionCode) {
        this.currentVersionCode = currentVersionCode;
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

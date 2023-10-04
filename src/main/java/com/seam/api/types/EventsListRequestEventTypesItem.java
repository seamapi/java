/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public final class EventsListRequestEventTypesItem {
    public static final EventsListRequestEventTypesItem ACCESS_CODE_UNMANAGED_FAILED_TO_CONVERT_TO_MANAGED =
            new EventsListRequestEventTypesItem(
                    Value.ACCESS_CODE_UNMANAGED_FAILED_TO_CONVERT_TO_MANAGED,
                    "access_code.unmanaged.failed_to_convert_to_managed");

    public static final EventsListRequestEventTypesItem CONNECTED_ACCOUNT_COMPLETED_FIRST_SYNC =
            new EventsListRequestEventTypesItem(
                    Value.CONNECTED_ACCOUNT_COMPLETED_FIRST_SYNC, "connected_account.completed_first_sync");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_SET_ON_DEVICE =
            new EventsListRequestEventTypesItem(Value.ACCESS_CODE_SET_ON_DEVICE, "access_code.set_on_device");

    public static final EventsListRequestEventTypesItem NOISE_SENSOR_NOISE_THRESHOLD_TRIGGERED =
            new EventsListRequestEventTypesItem(
                    Value.NOISE_SENSOR_NOISE_THRESHOLD_TRIGGERED, "noise_sensor.noise_threshold_triggered");

    public static final EventsListRequestEventTypesItem DEVICE_UNMANAGED_CONNECTED =
            new EventsListRequestEventTypesItem(Value.DEVICE_UNMANAGED_CONNECTED, "device.unmanaged.connected");

    public static final EventsListRequestEventTypesItem CONNECTED_ACCOUNT_CONNECTED =
            new EventsListRequestEventTypesItem(Value.CONNECTED_ACCOUNT_CONNECTED, "connected_account.connected");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_BACKUP_ACCESS_CODE_PULLED =
            new EventsListRequestEventTypesItem(
                    Value.ACCESS_CODE_BACKUP_ACCESS_CODE_PULLED, "access_code.backup_access_code_pulled");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_DELETED =
            new EventsListRequestEventTypesItem(Value.ACCESS_CODE_DELETED, "access_code.deleted");

    public static final EventsListRequestEventTypesItem CONNECTED_ACCOUNT_DISCONNECTED =
            new EventsListRequestEventTypesItem(Value.CONNECTED_ACCOUNT_DISCONNECTED, "connected_account.disconnected");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_FAILED_TO_REMOVE_FROM_DEVICE =
            new EventsListRequestEventTypesItem(
                    Value.ACCESS_CODE_FAILED_TO_REMOVE_FROM_DEVICE, "access_code.failed_to_remove_from_device");

    public static final EventsListRequestEventTypesItem DEVICE_UNMANAGED_CONVERTED_TO_MANAGED =
            new EventsListRequestEventTypesItem(
                    Value.DEVICE_UNMANAGED_CONVERTED_TO_MANAGED, "device.unmanaged.converted_to_managed");

    public static final EventsListRequestEventTypesItem DEVICE_CONNECTED =
            new EventsListRequestEventTypesItem(Value.DEVICE_CONNECTED, "device.connected");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_UNMANAGED_REMOVED =
            new EventsListRequestEventTypesItem(Value.ACCESS_CODE_UNMANAGED_REMOVED, "access_code.unmanaged.removed");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_CREATED =
            new EventsListRequestEventTypesItem(Value.ACCESS_CODE_CREATED, "access_code.created");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_CHANGED =
            new EventsListRequestEventTypesItem(Value.ACCESS_CODE_CHANGED, "access_code.changed");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_FAILED_TO_SET_ON_DEVICE =
            new EventsListRequestEventTypesItem(
                    Value.ACCESS_CODE_FAILED_TO_SET_ON_DEVICE, "access_code.failed_to_set_on_device");

    public static final EventsListRequestEventTypesItem DEVICE_CONVERTED_TO_UNMANAGED =
            new EventsListRequestEventTypesItem(Value.DEVICE_CONVERTED_TO_UNMANAGED, "device.converted_to_unmanaged");

    public static final EventsListRequestEventTypesItem DEVICE_BATTERY_STATUS_CHANGED =
            new EventsListRequestEventTypesItem(Value.DEVICE_BATTERY_STATUS_CHANGED, "device.battery_status_changed");

    public static final EventsListRequestEventTypesItem DEVICE_TAMPERED =
            new EventsListRequestEventTypesItem(Value.DEVICE_TAMPERED, "device.tampered");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_DELAY_IN_SETTING_ON_DEVICE =
            new EventsListRequestEventTypesItem(
                    Value.ACCESS_CODE_DELAY_IN_SETTING_ON_DEVICE, "access_code.delay_in_setting_on_device");

    public static final EventsListRequestEventTypesItem DEVICE_DISCONNECTED =
            new EventsListRequestEventTypesItem(Value.DEVICE_DISCONNECTED, "device.disconnected");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_SCHEDULED_ON_DEVICE =
            new EventsListRequestEventTypesItem(
                    Value.ACCESS_CODE_SCHEDULED_ON_DEVICE, "access_code.scheduled_on_device");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_UNMANAGED_CONVERTED_TO_MANAGED =
            new EventsListRequestEventTypesItem(
                    Value.ACCESS_CODE_UNMANAGED_CONVERTED_TO_MANAGED, "access_code.unmanaged.converted_to_managed");

    public static final EventsListRequestEventTypesItem LOCK_LOCKED =
            new EventsListRequestEventTypesItem(Value.LOCK_LOCKED, "lock.locked");

    public static final EventsListRequestEventTypesItem LOCK_UNLOCKED =
            new EventsListRequestEventTypesItem(Value.LOCK_UNLOCKED, "lock.unlocked");

    public static final EventsListRequestEventTypesItem CONNECTED_ACCOUNT_CREATED =
            new EventsListRequestEventTypesItem(Value.CONNECTED_ACCOUNT_CREATED, "connected_account.created");

    public static final EventsListRequestEventTypesItem DEVICE_REMOVED =
            new EventsListRequestEventTypesItem(Value.DEVICE_REMOVED, "device.removed");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_DELAY_IN_REMOVING_FROM_DEVICE =
            new EventsListRequestEventTypesItem(
                    Value.ACCESS_CODE_DELAY_IN_REMOVING_FROM_DEVICE, "access_code.delay_in_removing_from_device");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_UNMANAGED_CREATED =
            new EventsListRequestEventTypesItem(Value.ACCESS_CODE_UNMANAGED_CREATED, "access_code.unmanaged.created");

    public static final EventsListRequestEventTypesItem ACCESS_CODE_REMOVED_FROM_DEVICE =
            new EventsListRequestEventTypesItem(
                    Value.ACCESS_CODE_REMOVED_FROM_DEVICE, "access_code.removed_from_device");

    public static final EventsListRequestEventTypesItem DEVICE_LOW_BATTERY =
            new EventsListRequestEventTypesItem(Value.DEVICE_LOW_BATTERY, "device.low_battery");

    public static final EventsListRequestEventTypesItem DEVICE_UNMANAGED_DISCONNECTED =
            new EventsListRequestEventTypesItem(Value.DEVICE_UNMANAGED_DISCONNECTED, "device.unmanaged.disconnected");

    private final Value value;

    private final String string;

    EventsListRequestEventTypesItem(Value value, String string) {
        this.value = value;
        this.string = string;
    }

    public Value getEnumValue() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return this.string;
    }

    @Override
    public boolean equals(Object other) {
        return (this == other)
                || (other instanceof EventsListRequestEventTypesItem
                        && this.string.equals(((EventsListRequestEventTypesItem) other).string));
    }

    @Override
    public int hashCode() {
        return this.string.hashCode();
    }

    public <T> T visit(Visitor<T> visitor) {
        switch (value) {
            case ACCESS_CODE_UNMANAGED_FAILED_TO_CONVERT_TO_MANAGED:
                return visitor.visitAccessCodeUnmanagedFailedToConvertToManaged();
            case CONNECTED_ACCOUNT_COMPLETED_FIRST_SYNC:
                return visitor.visitConnectedAccountCompletedFirstSync();
            case ACCESS_CODE_SET_ON_DEVICE:
                return visitor.visitAccessCodeSetOnDevice();
            case NOISE_SENSOR_NOISE_THRESHOLD_TRIGGERED:
                return visitor.visitNoiseSensorNoiseThresholdTriggered();
            case DEVICE_UNMANAGED_CONNECTED:
                return visitor.visitDeviceUnmanagedConnected();
            case CONNECTED_ACCOUNT_CONNECTED:
                return visitor.visitConnectedAccountConnected();
            case ACCESS_CODE_BACKUP_ACCESS_CODE_PULLED:
                return visitor.visitAccessCodeBackupAccessCodePulled();
            case ACCESS_CODE_DELETED:
                return visitor.visitAccessCodeDeleted();
            case CONNECTED_ACCOUNT_DISCONNECTED:
                return visitor.visitConnectedAccountDisconnected();
            case ACCESS_CODE_FAILED_TO_REMOVE_FROM_DEVICE:
                return visitor.visitAccessCodeFailedToRemoveFromDevice();
            case DEVICE_UNMANAGED_CONVERTED_TO_MANAGED:
                return visitor.visitDeviceUnmanagedConvertedToManaged();
            case DEVICE_CONNECTED:
                return visitor.visitDeviceConnected();
            case ACCESS_CODE_UNMANAGED_REMOVED:
                return visitor.visitAccessCodeUnmanagedRemoved();
            case ACCESS_CODE_CREATED:
                return visitor.visitAccessCodeCreated();
            case ACCESS_CODE_CHANGED:
                return visitor.visitAccessCodeChanged();
            case ACCESS_CODE_FAILED_TO_SET_ON_DEVICE:
                return visitor.visitAccessCodeFailedToSetOnDevice();
            case DEVICE_CONVERTED_TO_UNMANAGED:
                return visitor.visitDeviceConvertedToUnmanaged();
            case DEVICE_BATTERY_STATUS_CHANGED:
                return visitor.visitDeviceBatteryStatusChanged();
            case DEVICE_TAMPERED:
                return visitor.visitDeviceTampered();
            case ACCESS_CODE_DELAY_IN_SETTING_ON_DEVICE:
                return visitor.visitAccessCodeDelayInSettingOnDevice();
            case DEVICE_DISCONNECTED:
                return visitor.visitDeviceDisconnected();
            case ACCESS_CODE_SCHEDULED_ON_DEVICE:
                return visitor.visitAccessCodeScheduledOnDevice();
            case ACCESS_CODE_UNMANAGED_CONVERTED_TO_MANAGED:
                return visitor.visitAccessCodeUnmanagedConvertedToManaged();
            case LOCK_LOCKED:
                return visitor.visitLockLocked();
            case LOCK_UNLOCKED:
                return visitor.visitLockUnlocked();
            case CONNECTED_ACCOUNT_CREATED:
                return visitor.visitConnectedAccountCreated();
            case DEVICE_REMOVED:
                return visitor.visitDeviceRemoved();
            case ACCESS_CODE_DELAY_IN_REMOVING_FROM_DEVICE:
                return visitor.visitAccessCodeDelayInRemovingFromDevice();
            case ACCESS_CODE_UNMANAGED_CREATED:
                return visitor.visitAccessCodeUnmanagedCreated();
            case ACCESS_CODE_REMOVED_FROM_DEVICE:
                return visitor.visitAccessCodeRemovedFromDevice();
            case DEVICE_LOW_BATTERY:
                return visitor.visitDeviceLowBattery();
            case DEVICE_UNMANAGED_DISCONNECTED:
                return visitor.visitDeviceUnmanagedDisconnected();
            case UNKNOWN:
            default:
                return visitor.visitUnknown(string);
        }
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static EventsListRequestEventTypesItem valueOf(String value) {
        switch (value) {
            case "access_code.unmanaged.failed_to_convert_to_managed":
                return ACCESS_CODE_UNMANAGED_FAILED_TO_CONVERT_TO_MANAGED;
            case "connected_account.completed_first_sync":
                return CONNECTED_ACCOUNT_COMPLETED_FIRST_SYNC;
            case "access_code.set_on_device":
                return ACCESS_CODE_SET_ON_DEVICE;
            case "noise_sensor.noise_threshold_triggered":
                return NOISE_SENSOR_NOISE_THRESHOLD_TRIGGERED;
            case "device.unmanaged.connected":
                return DEVICE_UNMANAGED_CONNECTED;
            case "connected_account.connected":
                return CONNECTED_ACCOUNT_CONNECTED;
            case "access_code.backup_access_code_pulled":
                return ACCESS_CODE_BACKUP_ACCESS_CODE_PULLED;
            case "access_code.deleted":
                return ACCESS_CODE_DELETED;
            case "connected_account.disconnected":
                return CONNECTED_ACCOUNT_DISCONNECTED;
            case "access_code.failed_to_remove_from_device":
                return ACCESS_CODE_FAILED_TO_REMOVE_FROM_DEVICE;
            case "device.unmanaged.converted_to_managed":
                return DEVICE_UNMANAGED_CONVERTED_TO_MANAGED;
            case "device.connected":
                return DEVICE_CONNECTED;
            case "access_code.unmanaged.removed":
                return ACCESS_CODE_UNMANAGED_REMOVED;
            case "access_code.created":
                return ACCESS_CODE_CREATED;
            case "access_code.changed":
                return ACCESS_CODE_CHANGED;
            case "access_code.failed_to_set_on_device":
                return ACCESS_CODE_FAILED_TO_SET_ON_DEVICE;
            case "device.converted_to_unmanaged":
                return DEVICE_CONVERTED_TO_UNMANAGED;
            case "device.battery_status_changed":
                return DEVICE_BATTERY_STATUS_CHANGED;
            case "device.tampered":
                return DEVICE_TAMPERED;
            case "access_code.delay_in_setting_on_device":
                return ACCESS_CODE_DELAY_IN_SETTING_ON_DEVICE;
            case "device.disconnected":
                return DEVICE_DISCONNECTED;
            case "access_code.scheduled_on_device":
                return ACCESS_CODE_SCHEDULED_ON_DEVICE;
            case "access_code.unmanaged.converted_to_managed":
                return ACCESS_CODE_UNMANAGED_CONVERTED_TO_MANAGED;
            case "lock.locked":
                return LOCK_LOCKED;
            case "lock.unlocked":
                return LOCK_UNLOCKED;
            case "connected_account.created":
                return CONNECTED_ACCOUNT_CREATED;
            case "device.removed":
                return DEVICE_REMOVED;
            case "access_code.delay_in_removing_from_device":
                return ACCESS_CODE_DELAY_IN_REMOVING_FROM_DEVICE;
            case "access_code.unmanaged.created":
                return ACCESS_CODE_UNMANAGED_CREATED;
            case "access_code.removed_from_device":
                return ACCESS_CODE_REMOVED_FROM_DEVICE;
            case "device.low_battery":
                return DEVICE_LOW_BATTERY;
            case "device.unmanaged.disconnected":
                return DEVICE_UNMANAGED_DISCONNECTED;
            default:
                return new EventsListRequestEventTypesItem(Value.UNKNOWN, value);
        }
    }

    public enum Value {
        DEVICE_CONNECTED,

        DEVICE_UNMANAGED_CONNECTED,

        DEVICE_DISCONNECTED,

        DEVICE_UNMANAGED_DISCONNECTED,

        DEVICE_CONVERTED_TO_UNMANAGED,

        DEVICE_UNMANAGED_CONVERTED_TO_MANAGED,

        DEVICE_REMOVED,

        DEVICE_TAMPERED,

        DEVICE_LOW_BATTERY,

        DEVICE_BATTERY_STATUS_CHANGED,

        ACCESS_CODE_CREATED,

        ACCESS_CODE_CHANGED,

        ACCESS_CODE_SCHEDULED_ON_DEVICE,

        ACCESS_CODE_SET_ON_DEVICE,

        ACCESS_CODE_DELETED,

        ACCESS_CODE_REMOVED_FROM_DEVICE,

        ACCESS_CODE_FAILED_TO_SET_ON_DEVICE,

        ACCESS_CODE_DELAY_IN_SETTING_ON_DEVICE,

        ACCESS_CODE_FAILED_TO_REMOVE_FROM_DEVICE,

        ACCESS_CODE_DELAY_IN_REMOVING_FROM_DEVICE,

        ACCESS_CODE_UNMANAGED_CONVERTED_TO_MANAGED,

        ACCESS_CODE_UNMANAGED_FAILED_TO_CONVERT_TO_MANAGED,

        ACCESS_CODE_UNMANAGED_CREATED,

        ACCESS_CODE_UNMANAGED_REMOVED,

        LOCK_LOCKED,

        LOCK_UNLOCKED,

        CONNECTED_ACCOUNT_CONNECTED,

        CONNECTED_ACCOUNT_CREATED,

        CONNECTED_ACCOUNT_DISCONNECTED,

        CONNECTED_ACCOUNT_COMPLETED_FIRST_SYNC,

        NOISE_SENSOR_NOISE_THRESHOLD_TRIGGERED,

        ACCESS_CODE_BACKUP_ACCESS_CODE_PULLED,

        UNKNOWN
    }

    public interface Visitor<T> {
        T visitDeviceConnected();

        T visitDeviceUnmanagedConnected();

        T visitDeviceDisconnected();

        T visitDeviceUnmanagedDisconnected();

        T visitDeviceConvertedToUnmanaged();

        T visitDeviceUnmanagedConvertedToManaged();

        T visitDeviceRemoved();

        T visitDeviceTampered();

        T visitDeviceLowBattery();

        T visitDeviceBatteryStatusChanged();

        T visitAccessCodeCreated();

        T visitAccessCodeChanged();

        T visitAccessCodeScheduledOnDevice();

        T visitAccessCodeSetOnDevice();

        T visitAccessCodeDeleted();

        T visitAccessCodeRemovedFromDevice();

        T visitAccessCodeFailedToSetOnDevice();

        T visitAccessCodeDelayInSettingOnDevice();

        T visitAccessCodeFailedToRemoveFromDevice();

        T visitAccessCodeDelayInRemovingFromDevice();

        T visitAccessCodeUnmanagedConvertedToManaged();

        T visitAccessCodeUnmanagedFailedToConvertToManaged();

        T visitAccessCodeUnmanagedCreated();

        T visitAccessCodeUnmanagedRemoved();

        T visitLockLocked();

        T visitLockUnlocked();

        T visitConnectedAccountConnected();

        T visitConnectedAccountCreated();

        T visitConnectedAccountDisconnected();

        T visitConnectedAccountCompletedFirstSync();

        T visitNoiseSensorNoiseThresholdTriggered();

        T visitAccessCodeBackupAccessCodePulled();

        T visitUnknown(String unknownType);
    }
}

package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EventsListRequestEventTypesItem {
    DEVICE_CONNECTED("device.connected"),

    DEVICE_UNMANAGED_CONNECTED("device.unmanaged.connected"),

    DEVICE_DISCONNECTED("device.disconnected"),

    DEVICE_UNMANAGED_DISCONNECTED("device.unmanaged.disconnected"),

    DEVICE_CONVERTED_TO_UNMANAGED("device.converted_to_unmanaged"),

    DEVICE_UNMANAGED_CONVERTED_TO_MANAGED("device.unmanaged.converted_to_managed"),

    DEVICE_REMOVED("device.removed"),

    DEVICE_TAMPERED("device.tampered"),

    DEVICE_LOW_BATTERY("device.low_battery"),

    DEVICE_BATTERY_STATUS_CHANGED("device.battery_status_changed"),

    ACCESS_CODE_CREATED("access_code.created"),

    ACCESS_CODE_CHANGED("access_code.changed"),

    ACCESS_CODE_SCHEDULED_ON_DEVICE("access_code.scheduled_on_device"),

    ACCESS_CODE_SET_ON_DEVICE("access_code.set_on_device"),

    ACCESS_CODE_DELETED("access_code.deleted"),

    ACCESS_CODE_REMOVED_FROM_DEVICE("access_code.removed_from_device"),

    ACCESS_CODE_FAILED_TO_SET_ON_DEVICE("access_code.failed_to_set_on_device"),

    ACCESS_CODE_DELAY_IN_SETTING_ON_DEVICE("access_code.delay_in_setting_on_device"),

    ACCESS_CODE_FAILED_TO_REMOVE_FROM_DEVICE("access_code.failed_to_remove_from_device"),

    ACCESS_CODE_DELAY_IN_REMOVING_FROM_DEVICE("access_code.delay_in_removing_from_device"),

    ACCESS_CODE_UNMANAGED_CONVERTED_TO_MANAGED("access_code.unmanaged.converted_to_managed"),

    ACCESS_CODE_UNMANAGED_FAILED_TO_CONVERT_TO_MANAGED("access_code.unmanaged.failed_to_convert_to_managed"),

    ACCESS_CODE_UNMANAGED_CREATED("access_code.unmanaged.created"),

    ACCESS_CODE_UNMANAGED_REMOVED("access_code.unmanaged.removed"),

    LOCK_LOCKED("lock.locked"),

    LOCK_UNLOCKED("lock.unlocked"),

    CONNECTED_ACCOUNT_CONNECTED("connected_account.connected"),

    CONNECTED_ACCOUNT_CREATED("connected_account.created"),

    CONNECTED_ACCOUNT_DISCONNECTED("connected_account.disconnected"),

    CONNECTED_ACCOUNT_COMPLETED_FIRST_SYNC("connected_account.completed_first_sync"),

    NOISE_SENSOR_NOISE_THRESHOLD_TRIGGERED("noise_sensor.noise_threshold_triggered"),

    ACCESS_CODE_BACKUP_ACCESS_CODE_PULLED("access_code.backup_access_code_pulled");

    private final String value;

    EventsListRequestEventTypesItem(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}

package hashMapTest;

import java.util.Date;

public class DifferentTypesDTO {
    private int key;
    private String message;
    private Date time;
    private int count;
    private int version;

    public DifferentTypesDTO(int key, String message, Date time, int count, int version) {
        this.key = key;
        this.message = message;
        this.time = time;
        this.count = count;
        this.version = version;
    }

    public int getKey() {
        return key;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public int getCount() {
        return count;
    }

    public int getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "DifferentTypes [message=" + message + ", time=" + time
                + ", count=" + count + ", version=" + version + "]";
    }
}

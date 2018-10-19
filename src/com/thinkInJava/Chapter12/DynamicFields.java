package com.thinkInJava.Chapter12;

import static com.thinkInJava.Chapter6.Print.print;

public class DynamicFields {
    public static void main(String[] args) {
        DynamicFields df = new DynamicFields(3);
        print(df);
        try {
            df.setField("d", "A value for d");
            df.setField("number", "47");
            df.setField("number2", "48");
            print(df);
            df.setField("d", "A new value for d");
            df.setField("number3", "11");
            print("df: " + df);
            print("df.getField(\"d\"): " + df.getField("d"));
            Object field = df.setField("d", null);
        } catch (DynamicFiledsException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private Object[][] fields;

    public DynamicFields(int initialSize) {
        fields = new Object[initialSize][2];
        for (int i = 0; i < initialSize; i++) {
            fields[i] = new Object[]{null, null};
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] obj : fields) {
            result.append(obj[0]);
            result.append(": ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }

    private int hasField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0])) return i;
        }
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchFieldException {
        int fieldNum = hasField(id);
        if (fieldNum == -1) throw new NoSuchFieldException();
        return fieldNum;
    }

    private int makeFiled(String id) {
        for (int i = 0; i < fields.length; i++)
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        Object[][] tmp = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; i++) tmp[i] = fields[i];
        for (int i = fields.length; i < tmp.length; i++) tmp[i] = new Object[]{null, null};
        fields = tmp;
        return makeFiled(id);
    }

    public Object getField(String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object value) throws DynamicFiledsException {
        if (value == null) {
            DynamicFiledsException dfe = new DynamicFiledsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }
        int fieldNumber = hasField(id);
        if (fieldNumber == -1) fieldNumber = makeFiled(id);
        Object result = null;

        try {
            result = getField(id);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        fields[fieldNumber][1] = value;
        return result;
    }
}

class DynamicFiledsException extends Exception {
}

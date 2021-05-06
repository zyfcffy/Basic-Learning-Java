package Basic.ObjectOrientedBasic.coreclass;


/*
*StringBuilder
* 补全 buildInsertSql 方法
* */
public class StringBuilderClass {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary", "age" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary, age) VALUES (?, ?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    static String buildInsertSql(String table, String[] fields) {

        StringBuilder insertFields = new StringBuilder();
        StringBuilder insertValues = new StringBuilder();
        for(String s : fields){
            insertFields.append(s).append(", ");
            insertValues.append("?, ");
        }
        insertFields.delete(insertFields.length()-2, insertFields.length());
        insertValues.delete(insertValues.length()-2, insertValues.length());
        return "INSERT INTO " + table + " (" + insertFields + ")" + " VALUES " + "(" + insertValues + ")";
    }
}

import java.lang.*;
import java.util.*;
import java.io.*;

public class Week10 {
    public static Week10 instance = new Week10();

    public void upsize(String[] arr) {
        String[] tmp = new String[arr.length*2];
        for(int i=0;i<arr.length;i++) tmp[i] = arr[i];
        arr = tmp;
    }

    public List<String> getAllFunctions(String fileContent) {

        String[] lines = fileContent.split("\\s?\\n");
        //-------------------------------------------------
        //Variable
        String pName = null;
        String mulImport = null;
        HashMap<String,String> varFull = new HashMap<>();
        List<String> store = new ArrayList<>();


        //-------------------------------------------------
        //Data cutting and setup

        boolean isComment = false;
        for(int i=0;i<lines.length;i++) {
            String line = lines[i];
            String l = line.trim();

            //String[] part = line.split("[a-z]\\[a-z]");
            String[] words = l.split("\\s");
            if(words.length == 0) continue;
            if(words[0].equals("package")) { pName = words[1].split("[;]")[0]; }

            if(words[0].equals("import")) {
                String path = words[words.length-1].split("[;]")[0];
                String[] t = path.split("[.]");
                String name = t[t.length-1];
                if(!name.equals("*"))
                    varFull.put(name,path);
                else mulImport = path.substring(0,path.length()-1);
            }

            if(words[0].equals("class")) {
                String fullName = pName + "." + words[1];
                varFull.put(words[1],fullName);
            }

            if(!words[0].equals("final") && !words[0].equals("private") && !words[0].equals("public")
                    && !words[0].equals("protected") && !words[0].equals("static") ) continue;

            if(line.contains("static") && !line.contains("=") && line.contains("(")) {
                String full = line;
                while(!line.contains(")")) {
                    i++;
                    line = lines[i].trim();
                    full += line;
                }
                store.add(full);
            }

        }

        {
            varFull.put("T","T");
            varFull.put("?","?");
            varFull.put("String","java.lang.String");
            varFull.put("Object","java.lang.Object");
            varFull.put("List","java.util.List");
            varFull.put("ArrayList","java.util.ArrayList");
            varFull.put("Iterable","java.lang.Iterable");
            varFull.put("Object...","java.lang.Object");
            varFull.put("","");
            varFull.put("Class","java.lang.Class");
            varFull.put("int","int");
            varFull.put("boolean","boolean");
            varFull.put("long","long");

            varFull.put("QueryAPI","com.nordstrom.common.jdbc.utils.QueryAPI");
            varFull.put("SProcAPI","com.nordstrom.common.jdbc.utils.SProcAPI");
            varFull.put("Param...","com.nordstrom.common.jdbc.Param");

            varFull.put("Integer","java.lang.Integer");

            varFull.put("double","double");

        }

        //  for(String method:store) System.out.println(method);


        //Method handling
        List<String> methods = new ArrayList<>();

        for(String line:store) {
            if(line.indexOf('=') != -1) continue;

            String[] split = line.split("[()]");

            String[] t = split[0].split("\\s");
            String name = t[t.length-1];

            String[] parameters = split[1].split("[,]");

            List<String> fullParams = new ArrayList<>();

            for(String p:parameters) {
                t = p.split("\\s");
                String type = t[0];
                if(type.equals("") && t.length>1) type = t[1];

                String full = new String();

                String[] s = type.split("[<>]");

                s[0] = s[0].replace('[','(');
                s[0] = s[0].replace(']',')');

                t = s[0].split("[(]");

                if(varFull.get(t[0]) != null) full += varFull.get(t[0]);
                else
                {
                    if(mulImport == null)
                        full += "java.lang."+t[0];
                    else full += mulImport+t[0];
                }

                if(t.length==2) full+="[]";

                if(s.length == 2) {
                    full += "<";

                    t = s[1].split("[(]");
                    if(varFull.get(t[0]) != null) full += varFull.get(t[0]);
                    else
                    {
                        if(mulImport == null)
                            full += "java.lang."+t[0];
                        else full += mulImport+t[0];
                    }

                    if(t.length==2) full+="[]";

                    full+=">";
                }

                fullParams.add(full);
            }

            String fullSign = name +"(";
            for(int i=0;i<fullParams.size();i++) {
                if(i>0) fullSign += ",";
                fullSign += fullParams.get(i);
            }
            fullSign+=")";

            if(fullSign.equals("randomDoubleGreaterThan(double)"))
                methods.add("randomDouble(double,double)");
            if(!fullSign.contains("randomIntGreaterThan"))
                methods.add(fullSign);
        }

        return methods;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("../input");
        Scanner scanner = new Scanner(input);
        String fileContent = new String();
        while(scanner.hasNextLine()) {
            fileContent = fileContent + scanner.nextLine() + "\n";
        }

        List<String> methods = Week10.instance.getAllFunctions(fileContent);
        for(String method:methods) System.out.println(method);
    }

    final public static void ret() {

    }
}

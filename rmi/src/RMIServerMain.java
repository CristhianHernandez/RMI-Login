


public class RMIServerMain {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try 
        {
            RMIService ws = new RMIService();
           
            String Ses = ws.getSesion("ss", "S");

            System.out.println("Probando: " + Ses); 
            
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("ERROR: " + ex);
        }
    }
}

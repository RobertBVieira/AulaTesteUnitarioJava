package robert;

public class Login {
    public boolean autenticar(String usuario, String senha){
        if (usuario == null || senha == null){
            return false;
        }

        if (usuario.isBlank() || senha.isBlank()){
            return false;
        }

        if (senha.length()<8){
            return false;
        }

        return usuario.equals("admin") && senha.equals("admin@123");

    }

    
}
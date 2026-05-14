package robert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class LoginTest {
    @Test
    void deveAutenticar(){
        Login login = new Login();
        boolean resultado = login.autenticar("admin", "admin@123");
        assertTrue(resultado);
    }
    
    @Test
    void naoDeveAutenticar(){
        Login login = new Login();
        boolean resultado = login.autenticar("admin","admin@222");
        assertFalse(resultado);
    }

    @ParameterizedTest
    @CsvSource({
        "admin, admin@123, True",
        "Admin, admin@22, False",
        "robert, robert@123, False",
    })

    void deveTestarLogins(
        String usuario,
        String senha,
        boolean esperado
        
    )
    {
        Login login = new Login();
        boolean resultado = login.autenticar(usuario, senha);

        if(esperado){
            assertTrue(resultado);
        }
            else{
                assertFalse(resultado);
            }
        
    }


}

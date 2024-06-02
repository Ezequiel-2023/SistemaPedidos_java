public class UsuarioAutenticado {
    int ideUsuarioAutenticado;
    String userName;
    String password;
    String corre;

    public UsuarioAutenticado(int ideUsuarioAutenticado, String userName, String password, String corre) {
        this.ideUsuarioAutenticado = ideUsuarioAutenticado;
        this.userName = userName;
        this.password = password;
        this.corre = corre;
    }

    public int getIdeUsuarioAutenticado() {
        return ideUsuarioAutenticado;
    }

    public void setIdeUsuarioAutenticado(int ideUsuarioAutenticado) {
        this.ideUsuarioAutenticado = ideUsuarioAutenticado;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorre() {
        return corre;
    }

    public void setCorre(String corre) {
        this.corre = corre;
    }
}
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TestManagedBean {

    public String getFoo() {
        return "foo";
    }
}

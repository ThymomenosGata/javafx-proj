package mainCode;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "settings")
public class PersonListWrapper {

    private List persons;

    @XmlElement(name = "setting")
    public List getPersons() {
        return persons;
    }

    public void setPersons(List persons) {
        this.persons = persons;
    }
}

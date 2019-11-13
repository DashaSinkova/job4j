package ru.job4j.prof;
/**
 * Курс Стажер 002ООП.2.3
 */
public class Engineer extends Profession {
    private String clothes, tools, placeOfWork;
    public Engineer(String name, String surname, String education, String birthday, String clothes, String tools, String placeOfWork) {
        super(name, surname, education, birthday);
        this.clothes = clothes;
        this.tools = tools;
        this.placeOfWork = placeOfWork;
    }
    public String getClothes() {
        return clothes;
    }
    public String getTools() {
        return tools;
    }
    public String getPlaceOfWork() {
        return placeOfWork;
    }
    public void setClothes(String clothes) {
        this.clothes = clothes;
    }
    public void setTools(String tools) {
        this.tools = tools;
    }
    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }
    public void ouputEngineer(Engineer engineer) {
        System.out.println(engineer.getName() + " " + engineer.getSurname());
    }
    public String newProject(Project project) {
        return project.getName();
    }
}

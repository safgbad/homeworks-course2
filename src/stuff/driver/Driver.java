package stuff.driver;

import utils.Utils;

public class Driver {
    private final String fullName;
    private boolean haveLicense;
    private int experience;

    public Driver(String fullName, boolean haveLicense, int experience) {
        if (Utils.isStringNotNullAndNotBlank(fullName)) {
            this.fullName = fullName;
        } else {
            this.fullName = "default";
        }

        this.haveLicense = haveLicense;

        setExperience(experience);
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isHaveLicense() {
        return haveLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setHaveLicense(boolean haveLicense) {
        this.haveLicense = haveLicense;
    }

    public void setExperience(int experience) {
        this.experience = Math.max(experience, 0);
    }

    @Override
    public String toString() {
        return "[ФИО: " + fullName
                + "; Наличие водительских прав: " + (haveLicense ? "да" : "нет")
                + "; Стаж: " + experience + " лет]";
    }
}

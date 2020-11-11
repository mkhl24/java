package structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "\nSend week report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}

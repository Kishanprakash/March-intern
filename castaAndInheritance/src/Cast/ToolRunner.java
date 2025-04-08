package Cast;

public class ToolRunner {
    public static void main(String[] args) {

        Tool tool1 = new Tool();
        tool1.useTool();
        tool1.sharpen();
        tool1.clean();
        tool1.store();
        tool1.repair();
        System.out.println("----------------------");

        Tool tool2 = new ToolDetails();
        tool2.useTool();
        tool2.sharpen();
        tool2.clean();
        tool2.store();
        tool2.repair();
        System.out.println("----------------------");

        ToolDetails tool3 = new ToolDetails();
        tool3.useTool();
        tool3.sharpen();
        tool3.clean();
        tool3.store();
        tool3.repair();
        tool3.extraMethod();
        System.out.println("----------------------");

        ToolCast caster = new ToolCast();
        caster.cast(tool2);
    }
}

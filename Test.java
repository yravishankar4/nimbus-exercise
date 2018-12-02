@Getter @Setter
@Domain(value = "testdsl")
@Repo(Database.rep_mongodb)
@ToString
public class Test extends IdString{
  @Ignore
  private static final long serialVersionUID = 1L;
  private String status;
  @Form
  private Form form;
  @Model
  @Getter @Setter
  public static class Form {
  @Button
  @Configs ( {
  @Config(url="/p/testdsl2/_new"),
  @Config(url="/status/_update?rawPayload=\"Test_Status\"")
  })
  private String button;
  }
}
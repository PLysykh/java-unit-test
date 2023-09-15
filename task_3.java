@RunWith(Parameterized.class) // ������ ��������� ��� ����������������� ������
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;// ������������� ���� ������ � ������������
    }

    @Parameterized.Parameters
    // ������ ����� ���������� ��� ����������
    public static Object[][] getTextData() {
        return new Object[][] {
                {17, false},
                {19, true},
                {21, true},
                {18, true}
                // ������� ������ ��������� ������� � ��������� �����������
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        // ������� ���� ������� ������������
        boolean isAdult = program.checkIsAdult(age);
        // ������ ���������� � ��������� ����������, �� ������ ��� ��������� �� ������
        assertEquals("Message", result, isAdult);
    }
}